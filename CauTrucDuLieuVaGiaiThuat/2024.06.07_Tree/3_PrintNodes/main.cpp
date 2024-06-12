#include <iostream>
using namespace std;
struct node
{
    int info;
    node *left;
    node *right;
};
typedef node* Tree;
node* creatnode(int x)
{
    node *p = new node;
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
        if (x==T->info)
            cout<<"Khong them duoc"<<endl;
        if (x<T->info)
            addnode(T->left,x);
        else
            addnode(T->right,x);
    }
}
void inputTree (Tree &T)
{
    int n,x;
    cin>>n;
    for (int i=0; i<n; i++)
    {
        cin>>x;
        addnode(T,x);
    }
}
void NLR (Tree T)
{
    if (T==NULL)
        return;
    cout<<T->info<<" ";
    NLR(T->left);
    NLR(T->right);
}
void LRN (Tree T)
{
    if (T==NULL)
        return;
    LRN(T->left);
    LRN(T->right);
    cout<<T->info<<" ";
}
void LNR (Tree T)
{
    if (T==NULL)
        return;
    LNR(T->left);
    cout<<T->info<<" ";
    LNR(T->right);

}
void listLeafs(Tree T)
{
    if (T==NULL)
        return;
    else
    {
        if(T->left==NULL && T->right==NULL)
            cout<<T->info<<" ";
        listLeafs(T->left);
        listLeafs(T->right);
    }

}
void listNodesWithOneChild(Tree T)
{
    if (T==NULL)
        return;
    else
    {
        if(T->left==NULL && T->right!=NULL)
            cout<<T->info<<" ";
        if(T->left!=NULL && T->right==NULL)
            cout<<T->info<<" ";
        listNodesWithOneChild(T->left);
        listNodesWithOneChild(T->right);
    }
}
void listNodesWithTwoChildren(Tree T)
{
    if (T==NULL)
        return;
    if(T->left!=NULL && T->right!=NULL)
        cout<<T->info<<" ";
    listNodesWithTwoChildren(T->left);
    listNodesWithTwoChildren(T->right);
}
void listInternalNodes(Tree T,int x)
{
    if (T==NULL)
        return;
    if(!(T->left==NULL && T->right==NULL)&&x!=0)
    {
        cout<<T->info<<" ";
    }
    x=1;


    listInternalNodes(T->left,x);
    listInternalNodes(T->right,x);
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

    cout<<"\nLeaf nodes: ";
    listLeafs(T);
    cout<<"\nInternal nodes: ";
    listInternalNodes(T,0);
    cout<<"\nNodes with one child: ";
    listNodesWithOneChild(T);
    cout<<"\nNodes with two children: ";
    listNodesWithTwoChildren(T);

    return 0;
}
