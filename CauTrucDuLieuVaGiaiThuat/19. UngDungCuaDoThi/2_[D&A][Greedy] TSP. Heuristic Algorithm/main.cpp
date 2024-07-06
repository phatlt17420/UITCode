#include <iostream>
#include <map>
#include <set>
#include <vector>
#include <iostream>
using namespace std;
class Graph
{
private:
    map<string, map<string,int>> adj_list;
    set<string>names;
public:
    void inputGraph (int e)
    {
        for(int i=0; i<e; i++)
    {
        string x,y;
        int w;
        cin>>x>>y>>w;
        adj_list[x][y]=w;
    }

    }
void findPath (string s)
{
        int n=adj_list.size();
        vector <string> path;
        string cur= s;
        path.push_back(s);
        map<string, bool> visited;
        visited[s]=1;
        while(n-1) // khi
        {
            // chọn một đỉnh trong tập đỉnh có khoản cách nhỏ nhất so với đỉnh hiện hành
            for(auto x:adj_list[cur])
            {
                int minDist=INT_MAX; // số lớn nhất
                string next;
                if(x.second<minDist)
                {
                    minDist=x.second;
                    next=x.first;
                }
            }
            // đánh dấu đỉnh next đã chọn hay chưa
            if(!visited[next]) // chưa chọn
            {
                path.push_back(next);
                cur=next;
                visited[next]=1;
                n--;
            }
            else
            {
                adj_list[cur].erase(next); // xóa ra khỏi tập đỉnh kề ko chọn lại ở bước sau.
            }
// xuất đường đi
for(int i=)

// ................



        }


}


};
int main()
{
    Graph G;
    int e;
    string s;
    cin>>e>>s;
    G.inputGraph(e);


    return 0;
}
