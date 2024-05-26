#include <iostream>
using namespace std;
struct node
{
    int data;
    node *next;
};
node* creatNode(int data)
{
    node *p=new node();
    p->data=data;
    p->next=NULL;
    return p;
}
struct List
{
    node *Head;
    node *Tail;
};
void addHead(List &L, int x)
{
    node*p=creatNode(x);
    if (L.Head==NULL)
        L.Head=L.Tail=p;
    else
    {
        p->next=L.Head;
        L.Head=p;
    }

}
void addTail (List &L, int x)
{

    node *p=creatNode(x);
    if(L.Tail==NULL)
        L.Head=L.Tail=p;
    else
    {
        L.Tail->next=p;
        L.Tail=p;
    }


}
void add(List &L, int a, int b)
{
    node *p=L.Head;
    node *pb=creatNode(b);
    if (p==NULL)
        L.Head=L.Tail=pb;

    while (p->next==NULL)
        {
            if(p->data==a)
                break;
            p=p->next;

}
            p->next=pb;
            pb->next=p->next;

}
void outputList(List L)
{
    node *p=L.Head;
    while(p!=NULL)
    {
        cout<<p->data<<" ";
        p=p->next;
    }
}

int main()
{
    List L;
    L.Head=L.Tail=NULL;
    int opt;
    while (opt!=3)
    {
        cin>>opt;
        switch (opt)
        {

        case 1:
        {
            int x;
            cin>>x;
            addHead(L,x);
            break;
        }
        case 2:
        {
            int x;
            cin>>x;
            addTail(L,x);
            break;
        }
        case 0:
        {
            int a,b;
            cin>>a>>b;
            add(L,a,b);
            break;
        }
        }
    }


    outputList(L);

    return 0;
}
