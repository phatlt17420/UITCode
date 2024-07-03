#include <iostream>
#include <vector>
#include <map>
#include <stack>
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
            // nhập vào ma trân kề;
            for(int i=0; i<v; i++)
                for(int j=0; j<v; j++)
                    cin>>matrix[i][j];
        }
    }

// viết hàm tìm kiếm đường đi

    void DFS (string s, string g)
    {
        //        Bước 1: Khởi tạo
        //        Open = {s};
        //        Close ={};
        stack<string> Open;
        Open.push(s);
        vector<bool> Close (this->names.size(),0);
//        Bước 2: while(Open!={})
        int flag = 0;
        while(Open.empty()==true)
        {
//        2.1 Lấy 1 phần từ từ đầu Open (đồng thời xoá ra ở Open)
            string p=Open.top();
            Open.pop();
//        2.2 Nếu p là trạng thái kết thúc=> thoát khỏi vòng lặp, thông báo kết quả
            if(p==g)
            {
                flag=1;
                break;
            }
//        2.3 Bỏ p vào Close (tập các phần tử đã đi qua)
//
//        2.4 Với mỗi đỉnh q kề với p,
//        Nếu q không thuộc Close (tập các phần tử đã đi qua) thì thêm q vào Open.
//
        }
//        Bước 3:
//        Sau khi thực hiện bước 2 mà không ra kết quả==> Không tìm thấy kết quả (đường đi)
        if(flag==0)



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
