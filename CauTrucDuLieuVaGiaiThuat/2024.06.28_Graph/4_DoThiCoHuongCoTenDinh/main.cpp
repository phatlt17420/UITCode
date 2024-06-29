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
    vector<vector<int>> maxtrix;
    vector<string> names;
    map<string, int> mapping;// ánh xạ tên đỉnh sang index của đỉnh
public:
    void nhap(int v,int e);
    void myProgress(int n);



};
void Graph::nhap(int v,int e)
{
    maxtrix= vector<vector<int>>(v,vector<int>(v,0)); // nếu sử dụng hàm push_back không viết câu này
    names  = vector<string> (v,"");
    for (int i=0; i<v; i++)
    {
        string x;
        cin>>x; // nhập 1 tên đỉnh
        names[i]=x; // lưu x vaò vector names
        // nếu sử dụng names.push_back(x); // không set size ngay từ đầu
        mapping[x]=i; // tạo 1 ánh xạ từ x đến y;
        for(int i=0; i<e; i++)
        {
            string x,y;
            cin>>x>>y;
            maxtrix[mapping[x]][mapping[y]]=1;
        }
;}
}
void Graph::myProcess(int n){

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

