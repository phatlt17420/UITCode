/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
###End banned keyword*/

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
    node* p = new node;
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
        if (T->info==x)
            cout<<"Khong the them do trung gia tri"<<endl;
        else if(x<T->info)
        {
            addnode(T->left,x);
        }
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
void LNR (Tree T)
{
    if(T==NULL)
        return;
    else
    {
        LNR(T->left);
        cout<<T->info<< " ";
        LNR(T->right);
    }
}

node * removeLeafs(Tree &T)
{
    if (T==NULL)
        return NULL;
    else
    {
        if(T->left==NULL && T->right==NULL)
        {
            delete T;
            return NULL;
        }
        else
        {
            T->left=removeLeafs(T->left);
            T->right=removeLeafs(T->right);
        }
    }
    return T;
}
//###INSERT CODE HERE -
int main()
{
	Tree T = NULL;
	inputTree(T);
	cout<<"LNR: "; LNR(T);
	T = removeLeafs(T);
	cout<<"\nUpdated Tree: \n";
	cout<<"LNR: "; LNR(T);
	return 0;
}



