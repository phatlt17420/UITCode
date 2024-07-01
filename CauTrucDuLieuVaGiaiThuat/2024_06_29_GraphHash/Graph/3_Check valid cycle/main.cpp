#include <iostream>
#include <vector>
#include <map>
#include <set>
#include <string>
using namespace std;
class Graph
{
private:
// Cách 1:
//
//    map<string,set<pair<string,int>>> adj_list;
//    vector<string> names;
// không cần dùng map
// Cách 2:
    map<string,map<string,int>> adj_list;
public:
    void inputGraph(int e);
    void Progress(int n);
    bool isNode(string x)
    {

    }
    bool isValid(vector<string> walk)// kiểm tra đường đi hợp lệ
    {
        int n=walk.size();
        if(walk[0]==walk[n)-1])   // TH1: kiểm tra điểm đầu điểm cuối
            return false;
        // TH2: kiểm tra tất cả có phải đỉnh, có ai đó không phải là định

        // TH3: kiểm tra đỉnh sau không kề đỉnh ở trước

        return true;
    }
};
void Graph::inputGraph(int e)
{
    // nhập cạnh
    for(int i=0; i<e; i++)
    {
        string x,y;
        int w;
        cin>>x>>y>>w;
        // CÁch 1: //muốn gọi .first . second
//         tạo ra 2 ánh xạ con
//        adj_list[y]; // tạo ánh xạ đi từ y đến tập rỗng.
//        adj_list[x].insert(make_pair(y,w));// bổ sung y vào set của x; x->(...y)//  x-> {y} // y-> {} // tạo 1 cặp pair
        // Cách 2:
        adj_list[x][y]=w;
    }
}

void Graph::Progress(int n)
{
    for(int i=0; i<n; i++) // n là số đường đi cần kiểm tra
    {
        // nhập đường đi
        vector<string> walk;
        while(1)
        {
            string x;
            cin>>x;
            if(x==".")
                break;
            walk.push_back(x);
        }
        // kiểm tra đường đi hợp lệ



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

