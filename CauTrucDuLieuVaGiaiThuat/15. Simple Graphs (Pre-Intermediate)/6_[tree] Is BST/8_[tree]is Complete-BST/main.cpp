#include <iostream>
using namespace std;
//###INSERT CODE HERE -
struct node {
int info;
node* left;
node* right;
};
typedef node* Tree;
node* createnode (int x)
{
    node* p = new node;
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
        if(T->info==x)
            cout<<"Khong them duoc do trung gia tri"<<endl;
        else if(x<T->info)
            addnode(T->left,x);
        else
            addnode(T->right,x);
    }
}
void inputTree(Tree & T)
{
    int x,n;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>x;
        addnode(T,x);
    }
}
void LNR(Tree T)
{

    if(T==NULL)
        return;
    else
    {
        LNR(T->left);
        cout<<T->info<<" ";
        LNR(T->right);
    }
}
int hightOfNode(Tree T)
{
    if(T==NULL)
        return -1;
    else
        return 1+ max (hightOfNode(T->left),hightOfNode(T->right));
}
bool checkNode (Tree T)
{
    if(T==NULL)
        return true;
    else if((T->left==NULL && T->right!=NULL) || (T->left!=NULL && T->right==NULL))
        return false;
    else
        return checkNode(T->left)&& checkNode(T->right);
}
bool isCompleteBinaryTree (Tree T)
{
    if (T==NULL)
        return true;
    else
    {
        if (!((hightOfNode(T->left)==hightOfNode(T->right)) && checkNode(T)==true))
            return false;
        else
            return isCompleteBinaryTree (T->left)&&isCompleteBinaryTree (T->right);
    }
}
//###INSERT CODE HERE -
int main()
{
	Tree T = NULL;
	inputTree(T);
	cout<<"LNR: "; LNR(T);
	int i=isCompleteBinaryTree (T);
	if(i==0) cout<<"\nThe tree is not a Complete Binary Tree";
    else cout<<"\nThe tree is a Complete Binary Tree";
	return 0;
}


