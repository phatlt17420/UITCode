#include <iostream>
#include <vector>
#include <map>
#include <set>
#include <string>
using namespace std;
class Graph
{
private:
    map<string,set<string>> adj_list;
//    vector<string> names;
// không cần dùng map
public:
    void inputGraph(int e);
    void Progress(int n);
};
void Graph::inputGraph(int e)
{
    // nhập cạnh
    for(int i=0; i<e; i++)
    {
        string x,y;
        cin>>x>>y;
        // tạo ra 2 ánh xạ con
        adj_list[y]; // tạo ánh xạ đi từ y đến tập rỗng.
        adj_list[x].insert(y);// bổ sung y vào set của x; x->(...y)//  x-> {y} // y-> {}
    }
}

void Graph::Progress(int n)
{
    for(int i=0; i<n; i++)
    {
        int ops;
        cin>>ops;
        if(ops==1) // kiểm tra 2 đỉnh có kề không
        {
            string x,y;
            cin>>x>>y;
            // gọi tập kề của x ra trước.
            set<string> adj_set=adj_list[x];
            if(adj_set.find(y)==adj_set.end()) // tương đương == null; kết quả tìm là con trỏ.
                cout<<"FALSE"<<endl;
            else cout<<"TRUE"<<endl;
        }
        else  // đếm số lượng đỉnh kề của x
        {
            string x;
            cin>>x;
            cout<<adj_list[x].size();
        }
        cout<<endl;
    }
}

int main()
{

    Graph G;
    int e, n;
    cin >> e >> n;
    G.inputGraph(e);
    G.Progress(n);
    return 0;
}

