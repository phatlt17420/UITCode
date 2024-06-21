
#include <iostream>
using namespace std;
//###INSERT CODE HERE -
struct node {
int info;
node* left;
node * right;};
typedef node* Tree;
node* creatnode (int x)
{
    node*p = new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void addnode(Tree &T, int x)
{
    if(T==NULL)
        T=creatnode(x);
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
int depthTree(Tree T)
{
    if(T==NULL)
        return -1;
    else
    {
        return 1+max (depthTree(T->left),depthTree(T->right));
    }
}
bool isAVL(Tree T)
{
    if(T==NULL)
        return true;
    else
    {
        if(abs(depthTree(T->left) - depthTree(T->right))>1)// so sánh chiều cao gốc bên trái và bên phải
            return false;
        if(isAVL(T->left)==false)
            return false;
        if (isAVL(T->right)==false)
            return false;
    }
    return true;

}
void inputTree(Tree &T)
{
    int n,x;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>x;
        addnode(T,x);
    }
}
//###INSERT CODE HERE -
int main()
{
	Tree T = NULL;
	inputTree(T);
//	NLR(T);
    cout<<isAVL(T);
	return 0;
}
