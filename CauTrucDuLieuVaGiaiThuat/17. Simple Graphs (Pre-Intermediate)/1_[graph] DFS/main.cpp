#include <iostream>
#include <map>
#include <stack>
#include <vector>
using namespace std;
class Graph
{
private:
    vector<vector<int>> matrix;
    vector<string> names;
    map<string,int> mapping;
public:
    void inputGraph(int v)
    {
        matrix=vector<vector<int>> (v,vector<int>(v,0));
        names=vector<string>(v,"");
// nhập các đỉnh;
        for(int i=0; i<v; i++)
        {
            string x;
            cin>>x;
            names[i]=x;
            mapping[x]=i;
        }
        for(int i=0; i<v; i++)
            for(int j=0; j<v; j++)
            {
                int x;
                cin>>x;
                matrix[i][j]=x;
            }
    }
    vector<string> adj_nodes(string p)
    {
        vector<string> nodes;
        // tìm đỉnh kề của p rồi bỏ vào vector
        for(int i=0; i<v; i++)

        {

        }

        return nodes;
    }
    void DFS (string s, string g)
    {
// Bước 1: Khổi tạo
// open:={s} open lưu
//
// close: lưu lại các đỉnh đã đi qua rồi.
        map<string,string> parent;
        vector<bool> close (v,0);
        stack<string> open;
        open.push(s);
        bool found=false;
        while(!open.empty())
        {
            //2.1: Lấy p từ đầu open (xoá p khỏi Open)
            string p=open.top();
            open.pop();

            //2.2 Nếu p là trrạng thái kết thức`1
            if(p==g)
            {
                found=true;
                break;
            }
            //2.3 Bỏ p và close
            close[mapping[p]]=1;
            vector<string> q= adj_nodes(p);
            for(int i=0; i<q.size(); i++)
            {
                if (close[mapping[q[i]]]==0)
                    open.push(q[i]); // liệu q[i] nằm trong open rồi thì có cần bỏ vào open nữa không ?
            parent[q[i]]=p;   // có con suy ra cha

            }
            //2.4 vớ

        }


        if(found==true)
        {
            current=g;// đỉnh hiện tại
            while (current!=s) // khống biết lặp bao nhiêu lần
            {
                // cout<<current;// bổ vào stack hoặc vector


                cur=parent[cur]; // sử dụng mapping để truy xuất cha
            llength+=trọng số của cạnh;
            }
        }
        else
        {
            // xử lý khoung tìm thấy đường đi
            cout<<"-unreachable-";
        }
    }
};
int main()
{
    int v,n;
    cin>>v>>n;
    Graph G;
    G.inputGraph(v);
    for (int o= 0; i<n; i++)
    {
        string s,g;
        cin>>s>>g;
        DFS(s,g);
    }
    return 0;
}
