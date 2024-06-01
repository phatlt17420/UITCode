/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
[
]
###End banned keyword*/

#include <iostream>
using namespace std;

/*Cach 1: Khi da cai dat List roi, dinh nghia Stack dua tren List
struct Stack
{
	List L;
};

Cach 2: Cai dat lai Stack tu dau, giong nhu List
struct node
{
    int info;
    node *next;
};
struct Stack
{
    node *pHead; // pTail khong co cung duoc

};*/

//###INSERT CODE HERE -
struct node
{
    int info;
    node *next;
};
struct Stack
{
    node *Head;
};
node* getNode(int x)
{
    node*p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addHead(Stack &L, int x)
{
    node* p =getNode(x);
    if (L.Head==NULL)
        //L.Head=L.Tail=p;
        L.Head=p;
    else
    {
        p->next=L.Head;
        L.Head=p;
    }
}
void printStack(Stack L)
{
    node *p=L.Head;
    while(p!=NULL)
    {
        cout<<p->info;
        p=p->next;
    }
}
void Init(Stack& L)
{
    L.Head=NULL;
}
void DecimaltoBinary1(int n,Stack& S)
{
    if (n==0)
        addHead(S,0);
    while (n!=0)
    {
        int k = n%2;
        addHead(S,k);
        n=n/2;
    }
}


int main()
{
    Stack S;
    Init(S);
    int n,x;
    cin>>n;
    DecimaltoBinary1(n,S);
    printStack(S);
    return 0;
}

