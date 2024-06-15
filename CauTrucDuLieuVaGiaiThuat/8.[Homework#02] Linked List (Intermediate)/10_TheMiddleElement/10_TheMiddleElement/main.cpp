#include <iostream>
#include <cstring>
#include <string>
using namespace std;
//###INSERT CODE HERE -
struct node
{
    int info;
    node* next;
};
struct List
{
    node* pHead;
    node* pTail;
};
void Init(List &L)
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
void addHead(List &L, int x)
{
    node* p= creatnode(x);
    if(L.pHead==NULL)
        L.pHead=L.pTail=p;
    else
    {
        p->next=L.pHead;
        L.pHead=p;
    }

}
void addTail(List &L, int x)
{
    node* p= creatnode(x);
    if(L.pHead==NULL)
        L.pHead=L.pTail=p;
    else
    {
        L.pTail->next=p;
        L.pTail=p;
    }
}
void outputList(List L)
{
    if(L.pHead==NULL)
        cout<<"List is empty";
    else
    {
            node*p=L.pHead;
    while(p!=NULL)
    {
        if(p==L.pTail)
        {
            cout<<p->info;
            break;
        }
        cout<<p->info<<" ";
        p=p->next;
    }
    }

}
node *Search(List L,int x)
{
    node *p=L.pHead;
    while(p!=NULL)
    {
        if(p->info==x)
            return p;
        p=p->next;
    }
    return NULL;
}
void addElement(List &L,int a,int b)
{
    if(L.pHead==NULL)
        addHead(L,b);
    else
    {
        node* p = creatnode(b);
        node* k =Search(L,a);
        if(k==L.pTail)
            addTail(L,b);
        else if (k==NULL)
            addHead(L,b);
        else
        {
            p->next=k->next;
            k->next=p;
        }
    }
}
void removeHead(List &L)
{
    if(L.pHead==NULL)
        return;
    else
    {
        node *p=L.pHead;
        L.pHead=L.pHead->next;
        if(L.pHead==NULL)
            L.pTail==NULL;
        delete p;
        p=NULL;
    }
}
void removeTail(List &L)
{
    if(L.pHead==NULL)
        return;
    if(L.pHead==L.pTail)
    {
        delete L.pHead;
        L.pHead=L.pTail=NULL;
        return;
    }
    node *tmp=L.pHead;
    while(tmp->next!=L.pTail)
        tmp=tmp->next;
    delete L.pTail;
    tmp->next=NULL;
    L.pTail=tmp;
}
void deleteElement(List &L, int x)
{
    node *p=Search(L,x);
    if (p==NULL)
        return;
    else if(p==L.pHead)
        removeHead(L);
    else if (p==L.pTail)
        removeTail(L);
    else
    {
        node *tmp=L.pHead;
        while(tmp->next!=p)
            tmp=tmp->next;
        tmp->next=p->next;
        delete p;
        p=NULL;
    }
}
void deleteAllElement(List& L,int x)
{
    if (L.pHead==NULL)
        return;
    else
    {
        while(L.pHead->info==x)
        {
            if(L.pHead==L.pTail)
            {
                delete L.pHead;
                L.pHead=L.pTail=NULL;
                return;
            }
            removeHead(L);
        }
        while(L.pTail->info==x)
            removeTail(L);
        while(Search(L,x))
            deleteElement(L,x);
    }

}
void inputList(List &L,int n)
{
    int x;
    for(int i=0; i<n; i++)
    {
        cin>>x;
        addTail(L,x);
    }
}
void moveLastToFront(List &L)
{
    if(L.pHead==L.pTail)
        return;
    else
    {
            int x=L.pTail->info;
    removeTail(L);
    addHead(L,x);
    }
}
node*


//###INSERT CODE HERE -
int main()
{
    List L;
    L.pHead=L.pTail=NULL;
    int n; cin>>n;
    inputList(L,n);
    cout<<"Created List: "<<endl;
    outputList(L);
    cout<<endl;

    node *p=findMiddle(L); //Neu so phan tu chan thi co 2 phan tu chinh giua, chi xuat phan tu chinh giua thu 2
    if(p)cout<<"The middle element is "<<p->info;

    return 0;
}

