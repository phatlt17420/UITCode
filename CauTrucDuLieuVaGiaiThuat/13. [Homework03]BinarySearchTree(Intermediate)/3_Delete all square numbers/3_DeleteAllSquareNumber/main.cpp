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
bool isSquare (int n);
void SearchStandFor(Node* &p, Node* &q); //Chon node phai nhat tren nhanh con ben trai
void deleteSquareNumbers(Tree &T);

int main()
{
    Tree T = NULL;
    inputTree(T);
    cout<<"\nNLR: ";
    NLR(T);
    cout<<"\nDelete all square numbers:";
    deleteSquareNumbers(T);
    cout<<"\nNLR: ";
    NLR(T);
    return 0;
}
//###INSERT CODE HERE -
Node *getNode(int x)
{
    Node* p=new Node;
    p->info=x;
    p->pLeft=NULL;
    p->pRight=NULL;
    return p;
}
void insertNode(Tree & T, int x)
{
    if(T==NULL)
        T=getNode(x);
    else
    {
        if(x==T->info)
            cout<<"Khong them duoc do trung gia tri";
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
bool isSquare (int n)
{
    if(n==1)
        return true;
    else
    {
        for(int i=1; i<n; i++)
            if(i*i==n)
                return true;
    }
    return false;
}
void SearchStandFor(Node* &p, Node* &q)//Chon node phai nhat tren nhanh con ben trai
{
   if(q->pRight!=NULL)
    SearchStandFor(p,q->pRight);
   else
   {
       p->info=q->info;
       p=q;
       q=q->pLeft;
   }
}
void deleteSquareNumbers(Tree &T)
{
    if(T==NULL)
        return ;
    else
    {
        if(isSquare(T->info)==false)
        {
            deleteSquareNumbers(T->pLeft);
            deleteSquareNumbers(T->pRight);
        }
        else
        {
            Node* p =T;
            if(T->pLeft==NULL)
                T=T->pRight;
            else if(T->pRight==NULL)
                T=T->pLeft;
            else
                SearchStandFor(p, T->pLeft);
            delete p;
        }
    }
}

//###INSERT CODE HERE -
