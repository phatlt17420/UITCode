#include <iostream>
#include <vector>
#include <map>
#include <set>
using namespace std;
class Graph
{
private:
    map<string,set<string>> adj_index;
public:
    void input(int e)
    {
        for(int i=0; i<e; i++)
        {
            string x,y;
            cin>>x>>y;
            adj_index[y];
            adj_index[x].insert(y);
        }
    }
    void process(int n)
    {
        for(int i=0; i<n; i++)
        {
            int ops;
            cin>>ops;
            if(ops==1) // kiểm tra 2 đỉnh kề
            {
                string x, y;
                cin>>x>>y;
                if(adj_index[x].find(y)==adj_index[x].end())
                {
                    cout<<"FALSE"<<endl;
                }
                else
                {
                    cout<<"TRUE"<<endl;
                }

            }
            else // kiểm tra số lượng đỉnh lân cận của một đỉnh cho trước
            {
                string x;
                cin>>x;
                cout<<adj_index[x].size()<<endl;
            }
            cout<<endl;
        }

    }
};
int main()
{
    Graph G;
    int e,n;
    cin>>e>>n;
    G.input(e);
    G.process(n);



    return 0;
}
