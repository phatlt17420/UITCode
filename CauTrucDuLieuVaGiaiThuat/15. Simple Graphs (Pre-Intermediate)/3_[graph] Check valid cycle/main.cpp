#include <iostream>
#include <map>
#include <vector>
#include <set>
using namespace std;
class Graph
{
private:
    map<string,set<pair<string,int>>> adj_index;
    set<string> names;
public:
    void inputGraph(int e)
    {
        for(int i=0; i<e; i++)
        {
            string x, y;
            int z;
            cin>>x>>y>>z;
            adj_index[y];
            adj_index[x].insert(make_pair(y,z));
            this->names.insert(x);
            this->names.insert(y);
        }
    }
    void process (int n)
    {
        for(int i=0; i<n; i++)
        {
            vector<string> walk;
            while(1)
            {
                cin.ignore();
                string x;
                cin>>x;
                walk.push_back(x);
                if(x==".")
                    break;
            }
// kiểm tra đường đi hợp lệ, cout true, false

            walk.pop_back();
            if(this->isWalkValid(walk)==false)
                cout<<"FALSE"<<endl;
            else if(this->isWalkValid(walk)==true)
            {
                cout<<this->length(walk);
            }
        }
    }
    bool isWalkValid(vector<string> walk)
    {
// kiểm tra đỉnh đầu, đỉnh cuối có trùng
        if(walk[0]!=walk[walk.size()-1])
            return false;
 //kiểm tra 2 đỉnh có kề
        if(this->dinhKe(walk)==false)
            return false;
        return true;
    }
    bool dinhKe(vector<string> walk)
    {

        for(int i=0; i<walk.size()-1; i++)
        {
            if(kiemtra2DinhKe(walk[i],walk[i+1])==false)
            {
                return false;
            }
        }
        return true;
    }
    bool kiemtra2DinhKe(string x, string y)
    {
        for(auto it:adj_index[x])
            if(it.first==y)
                return true;
            else
                return false;
    }
    int length(vector<string> walk)
    {
        int doDai=0;
        for(int i=0; i<walk.size()-1; i++)
        {
            for(auto it:adj_index[walk[i]])
                if(it.first==walk[i+1])
                    doDai+=it.second;
        }
        return doDai;
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
