/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
###End banned keyword*/

#include <iostream>
#include <vector>
#include <map>
#include <string>
using namespace std;
//###INSERT CODE HERE -
class Graph
{
private:
    vector<vector<int>> M;
    vector<string> names;
    map<string, int> v_indexs;// ánh xạ tên đỉnh sang index của đỉnh
public:
    void initGraph(int v)
    {
        M=vector<vector<int>>(v,vector<int>(v,0));
         names  = vector<string> (v,"");
    }
    void inputGraph(int v,int e);
    void myProgress(vector<vector<int>> G,int v, int n);
};
void Graph::inputGraph(int v,int e)
{
    for (int i=0; i<v; i++)
    {
        string x;
        cin>>x; // nhập 1 tên đỉnh
        names[i]=x; // lưu x vaò vector names
        // nếu sử dụng names.push_back(x); // không set size ngay từ đầu
        v_indexs[x]=i; // tạo 1 ánh xạ từ x đến y;
        for(int i=0; i<e; i++)
        {
            string x,y;
            cin>>x>>y;
            M[v_indexs[x]][v_indexs[y]]=1;
        }
;}
}
void Graph::myProgress(vector<vector<int>> G,int v, int n);
{
    for (int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        if(x==1) // kiem tra 2 đỉnh có kề
        {
            int y,z;
            cin>>y>>z; // kiểm tra z có kề với y không
            if (G[y-1][z-1]==1)
                cout<<"TRUE";
            else
                cout<<"FALSE";
        }
        else // liệt kê các đỉnh kề của đỉnh cho trước là y
        {
            int y;
            cin>>y;
            int flag=0;
            for(int i=0; i<v; i++)
                if(G[y-1][i]==1)
                {
                    flag=1;
                    cout<<i+1<<" "; // là đỉnh kề của y.
                }
            if(flag==0)
                cout<<"NONE";

        }
        cout<<endl;
    }
}
}
//###INSERT CODE HERE -
int main()
{

    Graph G;
    int v, e, n;
    cin >> v >> e >> n;
    G.nhap(v, e);
    G.myProcess(n);
    return 0;
}

