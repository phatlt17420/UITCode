#include <iostream>
#include <cstring>
#include <string>
using namespace std;
//###INSERT CODE HERE -
struct node
{
    int info;
    node*next;
};
struct List
{
    node* pHead;
    node* pTail;
};
void Init(List&L)
{
    L.pHead=L.pTail=NULL;
}
node* creatnode(int x)
{
    node*p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addTail (List &L, int x)
{
    node *p=creatnode(x);
    if(L.pHead==NULL)
        L.pHead=L.pTail=p;
    else
    {
        L.pTail->next=p;
        L.pTail=p;
    }
}

void inputList(List &L,int n)
{
    int x;
    for (int i=0; i<n; i++)
    {
        cin>>x;
        addTail(L,x);
    }
}
void outputList(List L)
{
    if(L.pHead==NULL)
        cout<<"List is empty";
    for(node*p=L.pHead; p!=NULL; p=p->next)
    cout<<p->info<<" ";
}
node* findMax(List L)
{
    string *kq=new string;
    if (L.pHead == NULL)
        return NULL;
    node*pMax=L.pHead;
    node*pTemp=L.pHead;
    while (pTemp!=NULL)
    {
        if(pTemp->info>pMax->info)
            pMax=pTemp;
        pTemp=pTemp->next;
    }
    return pMax;
}
//###INSERT CODE HERE -
int main()
{
    List L;
    Init(L);
    int n; cout<<"Enter a number: "; cin>>n;
    cout<<"\nEnter a sequence of "<<n<<" numbers: ";
    inputList(L,n);
    cout<<"\nThe created Linked List: ";
    outputList(L);


    cout<<"\nThe maximum value: ";
    node *p = findMax(L);
    if(p) cout<<p->info;

    return 0;
}
