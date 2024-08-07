#include <iostream>
#include <map>
#include <vector>
#include <queue>
using namespace std;
class Graph
{
private:
    vector<vector<int>> matrix;
    vector<string> names;
    map<string, int> mapping;
public:
    void inputGraph(int v);
    void process(int n);
    void BFS (string s, string g);
};
void Graph::inputGraph(int v)
{
    this->matrix=vector<vector<int>>(v,vector<int>(v,0));
    this->names=vector<string>(v,"");
    for (int i=0; i<v ; i++ )
    {
        string x;
        cin>>x;
        names[i]=x;
        mapping[x]=i;
    }
    for (int i=0; i<v ; i++ )
        for (int j=0; j<v ; j++ )
            cin>>matrix[i][j];
}
bool checkOpen(queue<string> Open,string s)
{
    while(!Open.empty())
    {
        if (Open.front()==s)
            return true;
            Open.pop();
    }
    return false;
}
void Graph::BFS (string s, string g)
{
    queue<string> Open;
    vector<int> Close (names.size(),0);
    map<string, string> parent;
    Open.push(s);
    int flag=0;
    int dem=0;
    while (Open.empty()!=true)
    {
        string p= Open.front();
        Open.pop();
        if(p==g)
        {
            flag=1;
            break;
        }

            dem++;
            Close[mapping[p]]=1;

        for (int i=0; i<names.size(); i++ )
        {
            if (Close[i]==0 && matrix[mapping[p]][i]!=0 ) //&& checkOpen(Open,p)==false
            {
                Open.push(names[i]);
                Close[i]=1;
                parent[names[i]]=p;
            }
        }
    }
    if (flag==0)
    {
        cout<<"-unreachable-"<<endl;
        cout<<dem<<" 0"<<endl;
    }
    if (flag==1)
    {
        // xuất ra đường đi
        vector<string> path;
        int length=0;
        string tmp=g;
        while(tmp!=s)
        {
            path.push_back(tmp);
            tmp=parent[tmp];
        }
        path.push_back(s);
        for (int i=path.size()-1; i>-1 ; i--)
            cout<<path[i]<<" ";
        cout<<endl;
        for (int i = path.size() - 1; i > 0; i--)
            length += matrix[mapping[path[i]]][mapping[path[i - 1]]];

        // xuất ra số lượng đỉnh + độ dài dường đi
        cout<<dem +1<<" "<<length<<endl;
    }
}
void Graph::process(int n)
{
    for (int i=0; i<n ; i++ )
    {
        string s,g;
        cin>>s>>g;
        BFS(s,g);
    }
}


int main()
{
    int v, n; // v: số đỉnh; n: số tham tác tìm kiếm.
    cin>>v>>n;
    Graph G;
    G.inputGraph(v);
    G.process(n);



    return 0;
}
