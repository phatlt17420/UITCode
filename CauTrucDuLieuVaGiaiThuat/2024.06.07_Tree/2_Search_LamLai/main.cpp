#include <iostream>
using namespace std;
// Bài 2:
struct Node
{
    int info;
    Node* left;
    Node* right;
};
typedef Node* Tree;
Node* creatnode (int x)
{
    Node*p =new Node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void addnode(Tree &T,int x)
{
    if(T==NULL)
        T=creatnode(x);
    else
    {
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
    for (int i=0; i<n; i++)
    {
        cin>>x;
        addnode(T,x);
    }
}
void LNR(Tree T)
{
    if (T==NULL)
        return;
    LNR(T->left);
    cout<<T->info<<" ";
    LNR(T->right);
}

Node* Search (Tree T, int x)
{
    if (T==NULL)
        return NULL;
    if (T->info==x)
        return T;
    if (T->info>x)
        return Search(T->left,x);
    else
        return Search(T->right,x);
}

//int maxValue(Tree T)
//{
//    if (T->right==NULL)
//        return T->info;
//    maxValue(T->right);
//}
//int minValue(Tree T)
//{
//    if (T->left==NULL)
//        return T->info;
//    minValue(T->left);
//}
int maxValue (Tree T)
{
    Node*p=T;
    while (p->right!=NULL)
    {
        p=p->right;
    }
    return p->info;
}
int minValue (Tree T)
{
    Node*p=T;
    while (p->left!=NULL)
    {
        p=p->left;
    }
    return p->info;
}

// viết theo dạng đệ quy
//int maxValue (Tree T)
//{
//    int maxValue (Tree T)
//}
int main()
{
    Tree T = NULL;
    inputTree(T);
    cout<<"LNR: ";
    LNR(T);
    cout<<endl;

    int x;
    cout<<"\nEnter the element you want to find: ";
    cin>>x;
    Node *p=Search(T,x);
    if (p) cout<< "Found";
    else cout<<"Not found";
    cout<<"\nMinimum value in BTS is "<<minValue(T);
    cout<<"\nMinimax value in BTS is "<<maxValue(T);
    return 0;
}
