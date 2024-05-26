#include <iostream>
using namespace std;
struct node
{
    int info; //chứa dữ liệu
    node *next; // con trỏ trỏ tới node kế tiếp trong danh sách
};
struct List
{
    node *Head;
    node *Tail;
};
node* getNode(int x)
{
    node*p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addHead(List &L, int x)
{
    node* p =getNode(x);
    if (L.Head==NULL)
        L.Head=L.Tail=p;
    else
    {
        p->next=L.Head;
        L.Head=p;
    }
}
void addTail(List &L, int x)
{
    node* p =getNode(x);
    if (L.Tail==NULL)
        L.Head=L.Tail=p;
    else
    {

        L.Tail->next=p;
        L.Tail=p;
    }
}
void addAndFind (List &L, int a, int b)
{
    node *pb =getNode(b);

    node *pt=L.Head;
    node *tmp=NULL;
    while(pt!=NULL)
    {
        if(pt->info==a)
        {
            tmp=pt;
            break;
        }
        pt=pt->next;
    }

    if (tmp==NULL)
        addHead(L,b);
    else if (tmp==L.Tail)
    {
        addTail(L,b);
    }
    else
    {
        pb->next=tmp->next;
        tmp->next=pb;
    }
}


void outputList (List L)
{
    node *p=L.Head;
    while(p!=NULL)
    {
        cout<<p->info<<" ";
        p=p->next;
    }
}
int main()
{
    List L;
    L.Head=L.Tail=NULL;

    while (1)
    {
        int ops;
        cin>>ops;
        if (ops==3)
            break;
        if (ops==0)
        {
            int x;
            cin>>x; //x là giá trị đưa vào danh sách
            addHead(L,x);
        }
        if (ops==1)
        {
            int x;
            cin>>x; //x là giá trị đưa vào danh sách
            addTail(L,x);
        }
        if (ops==2)
        {
            int a,b;
            cin>>a>>b;
            addAndFind(L,a,b);
        }

    }
    outputList (L);
    return 0;
}
