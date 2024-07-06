#include <iostream>
#include <map>
#include <set>
using namespace std;
class Graph {
public:
    map<string,set<string>> adj_list;
    set<string>names;
public:
    void Input(int e)
    {
        for (int i=0; i<e; i++)
        {
            string x,y;
            cin>>x>>y;
            adj_list[y];
            adj_list[x].insert(y);
            names.insert(x);
            names.insert(y);
        }
    }
    // viết hàm xét bậc của 1 đỉnh
    int level(string s)
    {
        return adj_list[s].size();
    }
   void checkGraph ()
    {
        int flag=1;
        // vi phạm số bậc
        set<string> ::iterator it;
        for (it=names.begin();it!=names.end();it++)
        {
            if(level(*it)!=adj_list.size()-1)
                flag=0;
        }
        // kiểm tra xem có vòng, có khuyên
        for (it=names.begin();it!=names.end();it++)
        {
            set<string>adj= adj_list[*it];
            if(adj.find(*it)!=adj.end())
                flag=0;
        }




        if(flag==0)
            cout<<"FALSE"<<endl;
        else
            cout<<"TRUE"<<endl;

    }
};


int main()
{
    Graph G;
    int e;
    cin>>e;
    G.Input(e);
    G.checkGraph();

    return 0;
}
