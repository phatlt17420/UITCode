#include <iostream>
#include <vector>
#include <map>
#include <stack>
#include <algorithm>
#include <queue>
using namespace std;
class Graph
{
private:
    vector<vector<int>> matrix;
    vector <string> names;
    map<string,int> mapping;
public:
    // viết hàm nhập vào ma trận kề và đỉnh
    void inputGraph (int v)
    {
        // Khởi tạo vùng nhớ;
        matrix=vector<vector<int>>(v,vector<int>(v,0));
        names=vector<string>(v,"");
        // nhập các đỉnh;
        for(int i=0; i<v; i++)
        {
            string x;
            cin>>x;
            names[i]=x;
            mapping[x]=i;
        }
        // nhập vào ma trân kề;
        for(int i=0; i<v; i++)
            for(int j=0; j<v; j++)
                cin>>matrix[i][j];
    }


// viết hàm tìm kiếm đường đi
    vector<int> adj_node (int p) // hàm tìm kiếm đỉnh kề
    {
        vector<int>  nodes (names.size(),0);
        for(int i=0; i<names.size(); i++)
            if (matrix[p][i] ==1 )
                nodes[p]=1;


        return nodes;
    }
    void Dijkstra(int s, int g) // chuyển đổi sang int
    {
        //        Bước 1: Khởi tạo
        //        Open = {s};
        //        Close ={};
        // sử dụng hàng dđợi ưu tiên
        priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>>> Open;

        Open.push({0,s}); // hoặc sử dụng make_pair
        vector<bool> Close (this->names.size(),0);
        map<int, int> parent;
        vector<int> d (names.size(),INT_MAX); // khởi tạo vector với giá trị vô cực INT_MAX là hàm có giá trị vô cực

//        Bước 2: while(Open!={})
        int flag = 0;
        while(Open.empty()!=true)
        {
//        2.1 Lấy 1 phần từ từ đầu Open (đồng thời xoá ra ở Open)// lấy tối ưu nhất từ queue (phần tử đầu)
            int p=Open.top().second; // lấy phần tử thứ 2 của pair.
            Open.pop();
//        2.2 Nếu p là trạng thái kết thúc=> thoát khỏi vòng lặp, thông báo kết quả
            if(p==g)
            {
                flag=1;
                break;
            }
//        2.3 Bỏ p vào Close (tập các phần tử đã đi qua)
//
            if(Close[p]==1) // nếu đã duyệt qua thì quay lại đầu vòng lặp
                continue;



//        2.4 Với mỗi đỉnh q kề với p,
//        Nếu q không thuộc Close (tập các phần tử đã đi qua) thì thêm q vào Open.
            // tìm đỉnh kề với p ==> viết hàm riêng tìm các đỉnh kề với đỉnh cho trước.
            Close[p]==1;
            vector<int> q = adj_node(p); // chuyển hàm qua dạng int
            for(int q=0; q<names.size(); q++)
            {
                // 2.4.1


                // 2.4.2
                // gom 2 làm 1: cho số lớn để nhảy vào thân
                // cách 2:
                if(Close[q]==0 && matrix[p][q]!=0) // không có trong close
                    // duyệt từng phần tử đồng thời xét ác phần tử có trong tập đỉnh kề.
                {
                    int d_new=d[p]+matrix[p][q];
                    if(d_new<d[p])
                    {
                        d[q]=d_new;// cập nhật giá trị mới tốt hơn
                        parent[q]=p; // cập nhật con đường mới tốt hơn
                        Open.push({d[q],q});// bị trùng thì vẫn bỏ vào.
                    }
                }
            }

            //
        }
//        Bước 3:
//        Sau khi thực hiện bước 2 mà không ra kết quả==> Không tìm thấy kết quả (đường đi)
        if(flag==0)
            cout<<"-unreachable"<<endl;
        else
        {
            vector<int> walk;
            int lenght=0;
            int current =g;
            while (current!=s)
            {
                walk.push_back(current);
                current=parent[current];
            }
            walk.push_back(s);
            for (int i=walk.size();i>=0;i--)
            {
                cout<<walk[i]<<" ";
                lenght+= matrix[walk[i][walk[i-1]];
            }

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
        string s, g;
        cin>>s>>g;
        G.DFS(s,g);
    }


    return 0;
}
