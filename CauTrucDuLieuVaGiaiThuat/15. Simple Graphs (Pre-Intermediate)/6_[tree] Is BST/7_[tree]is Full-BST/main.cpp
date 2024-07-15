/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
###End banned keyword*/

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
void inputTree(Tree &T){
    int n,x;
    cin>>n;
    for(int i=0;i<n;i++)
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
bool isFullBinaryTree (Tree T)
{
    if(T==NULL)
        return true;
    else if((T->left==NULL && T->right!=NULL) || (T->left!=NULL && T->right==NULL))
        return false;
    else
    {
        return isFullBinaryTree (T->left)&& isFullBinaryTree (T->right);
    }

}

//###INSERT CODE HERE -
int main()
{
    Tree T = NULL;
    inputTree(T);
    cout<<"LNR: ";
    LNR(T);
    int i=isFullBinaryTree (T);
    if(i==0) cout<<"\nThe tree is not a Full Binary Tree";
    else cout<<"\nThe tree is a Full Binary Tree";
    return 0;
}

