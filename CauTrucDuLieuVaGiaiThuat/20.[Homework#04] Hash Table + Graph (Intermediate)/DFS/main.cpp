#include <iostream>
#include <vector>
#include <map>
#include <stack>
#include <string>
using namespace std;
class Graph
{
private:
    vector<vector<int>> matrix;
    vector<string> names;
    map<string,int> mapping;
public:
    void inputGraph(int);
    void processGraph(int);
    void DFS (string s, string g);

};
void Graph::inputGraph(int v)
{
    string x;
    names=vector<string>(v,"");
    for (int i=0; i<v ; i++ )
    {
        cin>>x;
        mapping[x]=i;
        names[i]=x;
    }
    matrix=vector<vector<int>>(v,vector<int>(v,0));
    for (int i=0; i<v ; i++ )
    {
        for (int j=0; j<v ; j++ )
        {
            cin>>matrix[i][j];
        }
    }
}

void Graph::DFS (string s, string g)
{
    stack<string> Open;
    vector<bool> Close (names.size(),0);
    map<string, string> path;
    Open.push(s);
    int flag=0;
    int Cout=0;
    while (!Open.empty())
    {
        string p = Open.top();
        Open.pop();
        Cout++;
        if (p==g)
        {
            flag=1; // tìm thấy
            break; // tìm thấy
        }
        Close[mapping[p]]=1;
        for (int i=0; i<names.size() ; i++ )
        {
            if (matrix[mapping[p]][i]!=0 && Close[i]==0)
            {
                Open.push(names[i]);
                path[names[i]]=p;
            }
        }



    }
    if (flag == 0)
        cout << "-unreachable-" << endl;
    else // xử lý cho trường hợp tìm thấy
    {
        // in ra đường đi
        vector<string> walk;
        string tmp=g;
        while(tmp!=s)
        {
            walk.push_back(tmp);
            tmp=path[tmp];
        }
        walk.push_back(s);
        for (int i=walk.size()-1; i>-1; i-- )
        {
            cout<<walk[i]<<" ";
        }
        cout<<endl;
        cout<<Cout<<" ";
        int lenght=0;
        for (int i=walk.size()-1; i>0; i-- )
        {
            lenght+= matrix[mapping[walk[i]]][mapping[walk[i-1]]];
        }
        cout<<lenght;

        // in ra chiều dài đường đi




    }
}
void Graph::processGraph(int n)
{
    string s,g;
    for (int i=0; i<n ; i++ )
    {
        cin>>s>>g;
        DFS(s,g);
    }
}



int main()
{
    Graph G;
    int v,n; // v: số định vertical; n: số thao tác tìm kiếm.
    cin>>v>>n;
    G.inputGraph(v);
    G.processGraph(n);


    return 0;
}
