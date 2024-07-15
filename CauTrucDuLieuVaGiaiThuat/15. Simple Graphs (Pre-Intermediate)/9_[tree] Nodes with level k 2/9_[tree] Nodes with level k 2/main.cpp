/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
###End banned keyword*/

#include <iostream>
using namespace std;

struct Node
{
    int info;
    Node *pLeft;
    Node *pRight;
};
typedef struct Node* Tree;
Node *getNode(int x);
void insertNode(Tree & T, int x);
void inputTree(Tree &T);
void NLR(Tree T);
int nodesWithLevel(Tree T, int k, int c);

int main()
{
    Tree T = NULL;
    inputTree(T);
    cout<<"\nNLR: "; NLR(T);
    int k; cout<<"\nEnter k: "; cin >>k;
    cout<<nodesWithLevel(T,k,0); //neu tham so thu 3 khong can dung thi trong ham khong can xu ly

    return 0;
}
//###INSERT CODE HERE -
Node* getNode(int x)
{
    Node* p= new Node;
    p->info=x;
    p->pLeft=p->pRight=NULL;
    return p;
}
void insertNode (Tree & T, int x)
{
    if(T==NULL)
        T=getNode(x);
    else
    {
        if(T->info==x)
            cout<<"Khong them duoc do trung gia tri"<<endl;
        else if(x<T->info)
            insertNode(T->pLeft,x);
        else
            insertNode(T->pRight,x);
}
}
void inputTree(Tree &T)
{
    int n,x;
    cin>>n;
    for (int i=0; i<n; i++)
    {
        cin>>x;
        insertNode(T,x);
    }
}
void NLR(Tree T)
{
    if(T==NULL)
        return;
    else
    {
        cout<<T->info<<" ";
        NLR(T->pLeft);
        NLR(T->pRight);
    }
}
int nodesWithLevel(Tree T, int k, int c)
{
    if(T==NULL)
        return -1;
    if (k==c)
        return T->info;
    return nodesWithLevel(T,k,nodesWithLevel(T,k,c+1));


}















































//###INSERT CODE HERE -
