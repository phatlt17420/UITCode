#include <iostream>
using namespace std;
struct node
{
    int info;
    node* left;
    node*right;
};
typedef node* Tree;
node* creatnode(int x)
{
    node*p=new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void addnode (Tree &T, int x)
{
    if (T==NULL)
        T=creatnode(x);
    else
    {
        if (T->info==x)
            cout<<"Khong them duoc"<<endl;
        else if (x<T->info)
            addnode(T->left,x);
        else
            addnode(T->right,x);
    }
}

void LNR(Tree T)
{
    if(T==NULL)
        return;
    LNR(T->left);
    cout<<T->info<<" ";
    LNR(T->right);

}
void NLR(Tree T)
{
    if(T==NULL)
        return;
    cout<<T->info<<" ";
    NLR(T->left);
    NLR(T->right);

}
void LRN(Tree T)
{
    if(T==NULL)
        return;
    LRN(T->left);
    LRN(T->right);
    cout<<T->info<<" ";

}
void inputTree(Tree &T)
{
    int n,x;
    cin>>n;
    for (int i=0; i<n; i++)
    {
        cin>>x;
        addnode(T,x);
    }
}
int main()
{
    Tree T = NULL;
    inputTree(T);
    cout<<"\nNLR: ";
    NLR(T);
    cout<<"\nLRN: ";
    LRN(T);
    cout<<"\nLNR: ";
    LNR(T);
    return 0;
}
