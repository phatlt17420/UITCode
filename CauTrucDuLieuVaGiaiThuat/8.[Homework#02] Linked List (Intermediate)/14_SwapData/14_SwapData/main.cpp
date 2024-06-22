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
struct List {
node* pHead;
node* pTail;};
node* createnode(int x)
{
    node *p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addTail (List &L, int x)
{
    if(L.pHead==NULL)
        L.pHead=L.pTail=createnode(x);
    else
    {
        node *p = createnode(x);
        L.pTail->next=p;
        L.pTail=p;
    }
}
void Init(List &L)
{
    L.pHead=L.pTail=NULL;
}
void inputList(List &L,int n)
{
    int x;
    for(int i=0;i<n;i++)
    {cin>>x;
    addTail(L,x);
    }
}
void outputList(List L)
{
    node *p= L.pHead;
    if(p==NULL)
        cout<<"List is empty";
    else
    {
        while (p!=NULL)
        {
            cout<<p->info<<" ";
            p=p->next;
        }
    }
}
node* swapData(List &L,int x,int y)
{
    if(L.pHead==NULL)
        return NULL;
    else
    {
        node*p=L.pHead;
        while(p!=NULL)
        {
            if(p->info==x)
                break;
            p=p->next;
        }
        node*q=L.pHead;
        while(q!=NULL)
        {
            if(q->info==y)
                break;
            q=q->next;
        }
        if (p==NULL ||q==NULL)
            return NULL;
        else
        {
            int tmp;
            tmp= p->info;
            p->info=q->info;
            q->info=tmp;
            return p;
        }
    }
}

//###INSERT CODE HERE -
int main()
{
    List L;
    L.pHead=L.pTail=NULL;
    int n; cin>>n;
    inputList(L,n);
    cout<<"Created List: "<<endl;
    outputList(L); // Neu ds rong thi xuat "List is empty"
    cout<<endl;

    int x, y; cin>>x>>y;
    node *p = swapData(L,x,y);

    /* Tim 2 node chua x va y,
    Hoan vi gia tri cua 2 node do,
    nghia la: Lien ket giua cac node khong thay doi, node ban dau chua x se doi lai la chua y
    Ham return node chua x ban dau, luc chua hoan vi*/

    cout<<"Updated List after swapping "<<x<<" and "<<y<<": "<<endl;
    outputList(L);
    cout<<endl;

    /* Kiem tra xem co that su hoan vi info cua 2 node khong
    Neu hoan vi info thi node chua x ban dau se doi lai chua y*/

    if(p) // co hoan vi
    {
        cout<<"At the address of "<<x<< ": ";
        cout<<p->info;
    }
    else cout<<"Can not swap";
    return 0;
}
