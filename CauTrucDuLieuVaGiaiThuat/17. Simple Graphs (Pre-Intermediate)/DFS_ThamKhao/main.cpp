#include <iostream>
#include <vector>
#include <map>
#include <stack>
using namespace std;
class Graph
{
private:
    vector<vector<int>> matrix;
    vector<string> name;
    map<string,int> mapping;
    int v;
public:
    void input(int v)
    {
        this->v = v;
        matrix = vector<vector<int>>(v,vector<int>(v,0));
        name = vector<string>(v,"");
        for(int i = 0; i < v; i++)
        {
            string x;
            cin >> x;
            name[i] = x;
            mapping[x] = i;
        }
        for(int i = 0; i < v; i++)
        {
            for(int j = 0; j < v; j++)
            {
                cin >> matrix[i][j];
            }
        }
    }
    void DFB(string s, string u)
    {
        stack<string> Open;
        vector<bool> Close(v,false);
        map<string,string> parent;
        bool Found = false;
        Open.push(s);
        int Count = 0;
        while(!Open.empty())
        {
            string p = Open.top();
            Open.pop();
            if(p == u)
            {
                Found = true;
                break;
            }
            if(!Close[mapping[p]])
            {
                Close[mapping[p]] = true;
                Count++;
            }
            for(int i = 0; i < v; i++)
            {
                if(!Close[i] && matrix[mapping[p]][i] != 0)
                {
                    Open.push(name[i]);
                    parent[name[i]] = p;

                }
            }
        }
        if(Found)
        {
            int sum = 0;
            vector<string> path;
            for(string i = u; i != s; i = parent[i])
            {
                path.push_back(i);
            }
            path.push_back(s);
            for(int i = path.size()-1; i >= 0; i--)
            {
                cout << path[i] << " ";
                if(i != path.size()-1)
                {
                    sum += matrix[mapping[path[i+1]]][mapping[path[i]]];
                }
            }
            cout << endl;
            cout << Count +1  << " " << sum << endl;
        }
        else
        {
            cout << "-unreachable-" << endl;
            cout << Count << " 0" << endl;
        }

    }
    void process(int n)
    {
        for(int i = 0; i < n; i++)
        {
            string s, u;
            cin >> s >> u;
            DFB(s,u);
        }
    }
};
int main()
{
    int v, n;
    cin >> v >> n;
    Graph G;
    G.input(v);
    G.process(n);
    return 0;
}
