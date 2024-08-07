#include <iostream>
#include <vector>
#include <set>
#include <stack>
using namespace std;
class Graph
{
private:
    vector<vector<int>> matrix;
    vector<int>names;
    map<int,int> mapping;
public:
    void inputGraph(int n, int m)
    {
        matrix=vector<vector<int>> (m,vector<int>(m,0));
        set<int> vertex;
        int u,v;
        for (int i=0; i<n ; i++ )
        {
            cin>>u>>v;
            vertex.insert(u);
            vertex.insert(v);
            matrix[u][v]=matrix[v][u]=1;
        }
        for (auto it:names)
        {
            names2.push_back(it);
        }




    }
    bool DFS (int s, int g)
    {
        stack <int> Open;
        vector <bool> Close;
        Close = vector <bool> (names.size(),0);
        Open.push(s);
        int flag = 0;
        while (!Open.empty())
        {
            int p=Open.top();
            Open.pop();
            if (p==g)
            {
                flag =1;
                break;
            }
            Close[p]=1;
            for (int i=0; i<names2.size(); i++ )
            {
                if (matrix[p][i]!=0 && Close[i]==0)
                    Open.push(i);
            }
        }
        if (flag == 0)
            return false;
        else
            return true;
    }
};

int main()
{
    int m,n; // m đỉnh và n cạnh
    cin>>m>>n;
    Graph G;
    G.inputGraph(n,m);
    for (int i=1; i<m ; i++ )
    {
        if (G.DFS(0,i)==true)
            cout<<"CO"<<endl;
        else
            cout<<"KHONG"<<endl;
    }

    return 0;
}
