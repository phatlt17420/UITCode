#include <iostream>
using namespace std;
// insert code here
struct node {
int info;
node *next;};
struct List {
node*pHead;
node*pTail;
};
void Init(List&L)
{
    L.pHead=L.pTail=NULL;
}
node* creatnode (int x)
{
    node *p = new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addHead(List&L, int x)
{
    node*p=creatnode(x);
    if(L.pHead==NULL)
        L.pHead=L.pTail=p;
    else{
        p->next=L.pHead;
        L.pHead=p;
    }
}
void outputList(List L)
{
    if(L.pHead==NULL)
        cout<<"blank";
    else
    {
        node *p=L.pHead;
        while(p!=NULL)
        {
            cout<<p->info<<" ";
            p=p->next;
        }
    }
}
void addTail(List &L, int x)
{
    node *p=creatnode(x);
    if(L.pHead==NULL)
        L.pHead=L.pTail=p;
    else{
        L.pTail->next=p;
        L.pTail=p;
    }
}
node* Search(List L, int x)
{
    if(L.pHead==NULL)
        return NULL;
    else
    {
        node*p=L.pHead;
        for(p; p!=NULL; p=p->next)
            if(p->info==x)
                return p;
    }
    return NULL;
}
void addElementAfter (List&L, int a, int b)
{
    if(Search(L,a)==NULL)
        addHead(L,b);
    else{
        node *p=Search(L,a);
        node *pE=creatnode(b);
        if(p==L.pTail)
        addTail(L,b);
        else
        {
            pE->next=p->next;
        p->next=pE;
        }
    }
}
void deleteHead(List &L)
{

    if(L.pHead==NULL)
        L.pHead=L.pTail=NULL;
    else{
        node *p = L.pHead;
        L.pHead=L.pHead->next;
        p->next=NULL;
        delete p;
    }
}
int main()
{
    List L;
    Init(L);
    int opt;
    while (opt!=6)
    {
        cin>>opt;
        switch (opt)
        {
        case 0:
        {
            int x;
            cin>>x;
            addHead(L,x);
            break;
        }
        case 1:
        {
            int x;
            cin>>x;
            addTail(L,x);
            break;
        }
        case 2:
        {
            int a,b;
            cin>>a>>b;
            addElementAfter(L,a,b);
            break;
        }
        case 5:
        {

            deleteHead(L);
            break;
        }

        }
    }
    outputList(L);

    return 0;
}
// insert code here
