#include <iostream>
using namespace std;
struct node
{
    int info;
    node* left;
    node* right;
};
typedef node* Tree;
node* getnode (int x)
{
    node*p=new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void insertnode(Tree &T, int x)
{
    if (T==NULL)
        T=getnode(x);
    else
    {
        if (T->info==x)
            cout<<"Khong them duoc do trung";
        if (x<T->info)
            insertnode(T->left,x);
        else
            insertnode(T->right,x);
    }
}
void LNR (Tree T)
{
    if (T==NULL)
        return;
    LNR(T->left);
    cout<<T->info<<" ";
    LNR(T->right);
}
int main()
{
    node* T = NULL;
    int n;
    cin>>n;
    int x;
    for (int i=0; i<n; i++)
    {
        cin>>x;
        insertnode(T,x);
    }
    LNR(T);
    return 0;
}
