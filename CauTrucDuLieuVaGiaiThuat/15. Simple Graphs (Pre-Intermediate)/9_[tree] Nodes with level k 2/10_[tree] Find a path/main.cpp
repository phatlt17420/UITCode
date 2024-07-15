#include <iostream>
#include <vector>
#include <map>
using namespace std;
struct node
{
    int info;
    node* left;
    node* right;
};
typedef node* Tree;
node* createNode (int x)
{
    node* p = new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void addnode (Tree &T, int x)
{
    if(T==NULL)
        T=createNode(x);
    else
    {
        if(T->info==x)
            cout<<"Khong them duoc";
        else if(x<T->info)
            addnode(T->left,x);
        else
            addnode(T->right,x);
    }
}
void inputTree(Tree &T)
{
    int n,x;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>x;
        addnode(T,x);
    }
}
void LNR (Tree T)
{
    if(T==NULL)
        return ;
    else
    {
        LNR(T->left);
        cout<<T->info<<" ";
        LNR(T->right);
    }
}
bool isfindPath (Tree T, int x, vector<int> &s)
{
    if (T==NULL)
        return false;
    s.push_back(T->info);
    if (x==T->info)
        return true;
    if(x<T->info)
        return isfindPath(T->left,x,s);
    else
        return isfindPath(T->right,x,s);
}

int main()
{
    Tree T = NULL;
    inputTree(T);
    int x;
    cin>>x;
    vector<int>s;
    if(isfindPath(T,x,s))
    {
        cout<<"Found. Path: ";
        for(int i=0; i<s.size(); i++)
            cout<<s[i]<<" ";
    }
    else
        cout<<"Not found";
    return 0;
}

