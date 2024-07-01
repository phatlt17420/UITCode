#include <iostream>
#include <vector>
#include <map>
using namespace std;
class Graph
{
private:
    vector<vector<int>> matrix;
    vector<string> names;
    map<string, int> mapping;
public:
    void input(int v, int e)
    {
        this->matrix=vector<vector<int>>(v,vector<int>(v,0));
        this->names=vector<string>(v,"");
        for(int i=0; i<v; i++)
        {
            string x;
            cin>>x;
            this->names[i]=x;
            mapping[x]=i;
        }
        for(int i=0; i<e; i++)
        {
            string x,y;
            cin>>x>>y;
            this->matrix[mapping[x]][mapping[y]]=this->matrix[mapping[y]][mapping[x]]=1;
        }
    }
    void process(int v)
    {
        for(int i=0; i<this->names.size(); i++)
        {
            int dem=0;
            for(int j=0; j< this->names.size(); j++)
            {
                if(matrix[i][j]==1)
                    dem++;
            }
            cout<<dem<<" ";
        }
    }
};
int main()
{
    Graph G;
    int v,e; // v: số đỉnh, e: số cạnh
    cin>>v>>e;
    G.input(v,e);
    G.process(v);
    return 0;
}
