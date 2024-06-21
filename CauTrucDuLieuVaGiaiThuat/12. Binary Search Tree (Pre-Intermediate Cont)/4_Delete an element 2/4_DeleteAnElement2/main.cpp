#include <iostream>
using namespace std;
//###INSERT CODE HERE -
struct node {
int info;
node* left;
node* right;
};
typedef node* Tree;
node* creatnode (int x)
{
    node*p =new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void addnode (Tree &T, int x)
{
    if(T==NULL)
        T=creatnode(x);
    else{
        if(x<T->info)
            addnode(T->left,x);
        else
            addnode(T->right,x);
    }
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
void NLR(Tree T)
{
    if(T==NULL)
        return;
    else{
        cout<<T->info<<" ";
        NLR(T->left);
        NLR(T->right);
    }
}
void SearchStandFor(node* &k,node* &p)
{
    if(k->right!=NULL)
        SearchStandFor(k->right,p);
    else
    {
        p->info=k->info;
        p=k;
        k=k->left;
    }

}
bool isValid (Tree T, int x)
{
    node*p=T;
    if(T==NULL)
        return false;
    else if(T->info==x)
        return true;
    else if(x<T->info)
        return isValid(T->left,x);
    else
        return isValid(T->right,x);
}
void deleteElement (Tree &T, int x)
{
    if(T==NULL)
        return ;
    else if (x<T->info)
        deleteElement(T->left,x);
    else if(x>T->info)
        deleteElement(T->right,x);
    else
    {
        node* p =T;
        if(T->left==NULL)
            T=T->right;
        else if (T->right==NULL)
            T=T->left;
        else
            SearchStandFor(T->left,p);
        delete p;
    }
}
void deleteNode(Tree &T, int x)
{
    if(isValid(T,x))
    {
        char opt;
        cout<<"\nDo you want to delete "<<x<< "?(y/n):";
        cin>>opt;
        if(opt=='y')
        {
            deleteElement(T,x);
        }
        else return;
    }
    else
        cout<<"Not found";
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
