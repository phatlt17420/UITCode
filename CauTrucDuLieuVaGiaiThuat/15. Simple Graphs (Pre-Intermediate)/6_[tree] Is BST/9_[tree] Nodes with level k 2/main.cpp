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
    cout<<"\nNLR: ";
    NLR(T);
    int k;
    cout<<"\nEnter k: ";
    cin >>k;
    cout<<nodesWithLevel(T,k,0); //neu tham so thu 3 khong can dung thi trong ham khong can xu ly

    return 0;
}
//###INSERT CODE HERE -
Node *getNode(int x)
{
    Node* p=new Node;
    p->info=x;
    p->pLeft=p->pRight=NULL;
    return p;
}
void insertNode(Tree & T, int x){
    if(T==NULL)
        T=getNode(x);
    else
    {
        if(T->info==x)
            cout<<"Khong them duoc"<<endl;
        else if(x<T->info)
            insertNode(T->pLeft,x);
        else
            insertNode(T->pRight,x);
    }
}
void inputTree(Tree &T);
void NLR(Tree T);
int nodesWithLevel(Tree T, int k, int c);


















//###INSERT CODE HERE -
