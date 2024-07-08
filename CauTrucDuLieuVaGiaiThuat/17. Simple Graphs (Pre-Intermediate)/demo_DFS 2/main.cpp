#include <iostream>
#include <vector>
#include <map>
#include <stack>
#include <algorithm>
using namespace std;
class Graph
{
private:
    vector<vector<int>> matrix;
    vector<string> names;
    map<string,int>mapping;
public:
    void inputGraph (int v)
    {
        matrix=vector<vector<int>>(v,vector<int>(v,0));
        names=vector<string>(v,"");
        for(int i=0; i<v; i++)
        {
            cin>>names[i];
            mapping[names[i]]=i;
        }
        for(int i=0; i<v; i++)
            for(int j=0; j<v; j++)
                cin>>matrix[i][j];
    }
    bool Ktrastack(stack<string> Open, string p )
    {
        while(Open.empty()==false)
        {
            if(Open.top()==p)
                return true;
            Open.pop();
        }
        return false;
    }
    void DFS (string s, string g)
    {
        int v=names.size();
        stack<string> Open;
        vector<bool> Close(v,0);
        map<string,string> parent;
        int flag=0;
        int dem=0;
        Open.push(s);
        while(Open.empty()!=true)
        {
            string p= Open.top();
            Open.pop();
            if(p==g)
            {
                flag=1;
                break;
            }
            if(Close[mapping[p]]==0)
            {
                Close[mapping[p]]=1;
                dem++;
            }
            // đánh dấu đã đi qua p;
            // tìm các đỉnh kề với p
            for (int i=0; i<names.size(); i++)
            {
                if(Close[i]==0 && matrix[mapping[p]][i]!=0 )  //&&Ktrastack(Open,names[i])==false //??: hàm kiểm tra một phần tử có tồn tại trong stack
                {
                    Open.push(names[i]);
                    parent[names[i]]=p;
                }
            }
        }
        if(flag==1)
        {
            int lenght=0;
            vector<string> walk;
            string p=g;
            while(p!=s)
            {
                walk.push_back(p);
                p=parent[p];
            }
            walk.push_back(s);
            for(int i=walk.size()-1; i >= 0; i--)
            {
                cout<< walk[i]<<" ";
                if(i!=walk.size()-1)
                {
                    lenght+=matrix[mapping[walk[i+1]]][mapping[walk[i]]];
                }
            }
            cout<<endl;
            cout<<dem+1<<" "<<lenght<<endl;
        }
        else
        {
            cout<<"-unreachable-"<<endl;
            cout<<dem<<" 0"<<endl;
        }



    }

};
int main()
{
    Graph G;
    int v,n;
    cin>>v>>n;
    G.inputGraph(v);

    for(int i=0; i<n; i++)
    {
        string s,g;
        cin>>s>>g;
        G.DFS(s,g);
    }

    return 0;
}
