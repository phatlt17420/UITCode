#include <iostream>
using namespace std;
//###INSERT CODE HERE -
struct node
{
    int info;
    node* left;
    node* right;
};
typedef node* Tree;
node* createnode (int x)
{
    node* p =new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void addnode(Tree &T, int x)
{
    if(T==NULL)
        T=createnode(x);
    else
    {
        if(x>T->info)
            return addnode(T->right,x);
        else if (x<T->info)
            return addnode(T->left,x);
        else
            cout<<"Khong the them";
    }
}
void inputTree(Tree &T)
{
    int n,x;
    cin>>n;
    {
        for(int i=0; i<n; i++)
        {
            cin>>x;
            addnode(T,x);
        }
    }
}
void NLR(Tree T)
{
    if(T==NULL)
        return;
    else
    {
        cout<<T->info<<" ";
        NLR(T->left);
        NLR(T->right);
    }
}
node* rotateRight(Tree &T)
{
    if(T==NULL )
        return NULL;
    else if(T->left==NULL)
        return T;
    else
    {
        node* p=T->left;
        T->left=p->right;
        p->right=T;
        return p;
    }
}
//###INSERT CODE HERE -
int main()
{
    Tree T = NULL;
    inputTree(T);
    cout<<"NLR: ";
    NLR(T);
    T=rotateRight(T);
    cout<<"\nUpdated Tree: \n";
    cout<<"NLR: ";
    NLR(T);
    return 0;
}



