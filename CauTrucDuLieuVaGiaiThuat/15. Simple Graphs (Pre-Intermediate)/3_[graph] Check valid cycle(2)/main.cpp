#include <iostream>
#include <map>
#include <vector>
#include <set>
using namespace std;
class Graph
{
private:
    map<string,map<string,int>> adj_index;
public:
    void inputGraph(int e)
    {
        for(int i=0; i<e; i++)
        {
            string x, y;
            int z;
            cin>>x>>y>>z;
            adj_index[x][y]=z;
        }
    }
    void process (int n)
    {
        for(int i=0; i<n; i++)
        {
            vector<string> walk;
            while(1)
            {
                string x;
                cin>>x;
                walk.push_back(x);
                if(x==".")
                    break;
            }
// kiểm tra đường đi hợp lệ, cout true, false
            if(this->isWalkValid(walk)==false)
                cout<<"FALSE"<<endl;
            else
            {
                // xuất ra giá trị đường đi

            }
        }
    }
    bool isWalkValid(vector<string> walk)
    {
// kiểm tra ó phải đỉnh hay không;
        for(int i=0; i<walk.size(); i++)
        {
            if(adj_index.find(walk[i])==adj_index.end())
                return false;
        }
// kiểm tra đỉnh đầu, đỉnh cuối có trùng
        if(walk.begin()!=walk.end())
            return false;

// kiểm tra 2 đỉnh có kề
        if(this->dinhKe(walk)==false)
            return false;
        return true;
    }
    bool dinhKe(vector<string> walk)
    {
        for(int i=0;i<walk.size()-1;i++)
        {




        }
        return true;
    }
};
int main()
{
    Graph G;
    int e,n; //e: sô cạnh// n: số đường đi cần kiểm tra
    cin>>e>>n;
    G.inputGraph(e);
    G.process(n);
    return 0;
}
