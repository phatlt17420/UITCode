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
    vector<string> adj_node (string p) // hàm tìm kiếm đỉnh kề
    {
        vector<string>  nodes;
        for(int i=0; i<names.size(); i++)
            if (matrix[mapping[p]][i] ==1 )
                nodes.push_back(names[mapping[p]]);


        return nodes;
    }
    void DFS (string s, string g)
    {
        //        Bước 1: Khởi tạo
        //        Open = {s};
        //        Close ={};

        stack<string> Open;
        Open.push(s);
        vector<bool> Close (this->names.size(),0);
        map<string, string> parent;

//        Bước 2: while(Open!={})
        int flag = 0;
        while(Open.empty()!=true)
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
            Close[mapping[p]]=1;



//        2.4 Với mỗi đỉnh q kề với p,
//        Nếu q không thuộc Close (tập các phần tử đã đi qua) thì thêm q vào Open.
            // tìm đỉnh kề với p ==> viết hàm riêng tìm các đỉnh kề với đỉnh cho trước.
            vector<string> q = adj_node(p);
            for(int i=0; i<q.size(); i++)
            {
                if(Close[mapping[q[i]]]==0) // nếu q[i] không có trong close thì xem lại chỗ này
                {
                    Open.push(q[i]);
                    parent[q[i]]=p; // có con suy ra cha;
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
            stack<string> walk;
            int lenght=0;
            string current =g;
            while (current==s)
            {
                walk.push(current);
                lenght+=matrix[mapping[current]][mapping[parent[current]]];
                current=parent[current];
            }
            while(!walk.empty())
            {
                walk.top();
                walk.pop();
            }
            cout<<"Chieu dai duong di="<<lenght;
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
