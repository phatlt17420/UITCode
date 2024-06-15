#include <iostream>
using namespace std;
//###INSERT CODE HERE -
struct node
{
    int info;
    node* next;
};
struct List
{
    node* Head;
    node* Tail;
};
void Init(List &L)
{
    L.Head=L.Tail=NULL;
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
    if(L.Head==NULL)
        L.Head=L.Tail=p;
    else
    {
        p->next=L.Head;
        L.Head=p;
    }

}
void addTail(List &L, int x)
{
    node* p= creatnode(x);
    if(L.Head==NULL)
        L.Head=L.Tail=p;
    else
    {
        L.Tail->next=p;
        L.Tail=p;
    }
}
void outputList(List L)
{
    node*p=L.Head;
    while(p!=NULL)
    {
        if(p==L.Tail)
        {
            cout<<p->info;
            break;
        }
        cout<<p->info<<" ";
        p=p->next;
    }
}
node *Search(List L,int x)
{
    node *p=L.Head;
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
    if(L.Head==NULL)
        addHead(L,b);
    else
    {
        node* p = creatnode(b);
        node* k =Search(L,a);
        if(k==L.Tail)
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
    if(L.Head==NULL)
        return;
    else
    {
        node *p=L.Head;
        L.Head=L.Head->next;
        if(L.Head==NULL)
            L.Tail==NULL;
        delete p;
        p=NULL;
    }
}
void removeTail(List &L)
{
    if(L.Head==NULL)
        return;
    if(L.Head==L.Tail)
    {
        delete L.Head;
        L.Head=L.Tail=NULL;
        return;
    }
    node *tmp=L.Head;
    while(tmp->next!=L.Tail)
        tmp=tmp->next;
    delete L.Tail;
    tmp->next=NULL;
    L.Tail=tmp;
}
void deleteElement(List &L, int x)
{
    node *p=Search(L,x);
    if (p==NULL)
        return;
    else if(p==L.Head)
        removeHead(L);
    else if (p==L.Tail)
        removeTail(L);
    else
    {
        node *tmp=L.Head;
        while(tmp->next!=p)
            tmp=tmp->next;
        tmp->next=p->next;
        delete p;
        p=NULL;
    }
}
void deleteAllElement(List& L,int x)
{
    if (L.Head==NULL)
        return;
    else
    {
        while(L.Head->info==x)
        {
            if(L.Head==L.Tail)
            {
                delete L.Head;
                L.Head=L.Tail=NULL;
                return;
            }
            removeHead(L);
        }
        while(L.Tail->info==x)
            removeTail(L);
        while(Search(L,x))
            deleteElement(L,x);
    }

}


int main()
{
    List L;
    Init(L);
    int n;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        char TB;
        char TH;
        int x;
        cin>>TB>>TH>>x;
        if(TB=='+' && TH=='H')
        addHead(L,x);
        else if(TB=='+' && TH=='T')
            addTail(L,x);
        else if(TB=='-' && TH=='H')
            removeHead(L);
        else if(TB=='-' && TH=='T')
            removeTail(L);

    }


    outputList(L);
    return 0;
}

//###INSERT CODE HERE -
