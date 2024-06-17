#include <iostream>
using namespace std;
//###INSERT CODE HERE -
struct node {
int info;
node*left;
node* right;};
typedef node* Tree;
node* creatnode (int x)
{
    node*p = new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void addnode (Tree &T, int x)
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
void NLR (Tree T)
{
    if (T==NULL)
        return;
    else
    {
        cout<<T->info<<" ";
        NLR(T->left);
        NLR(T->right);
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
void SearchStandFor(node* &p,node *&q)
{
    if(q->left!=NULL)
        SearchStandFor(p,q->left);

    else
    {
        p->info=q->info;
        p=q;
        q=q->right;
    }
}

int deleteNode(Tree &T, int x)
{
    if(T==NULL)
        return 0;
    if(x<T->info)
        return deleteNode(T->left,x);
    else // (x>T->info)
        return deleteNode(T->right,x);


    node* p =T;
    if(T->left==NULL)
        T=T->right;
    else if(T->right==NULL)
        T=T->left;
    else
        SearchStandFor(p,T->right);

    delete p;
}


//###INSERT CODE HERE -
int main()
{
	Tree T = NULL;
	inputTree(T);
	cout<<"NLR: "; NLR(T);
    int x; cout<<"\nEnter the element you want to delete: ";cin>>x;
    deleteNode(T,x);
    cout<<"\nNLR: "; NLR(T);
	return 0;
}
