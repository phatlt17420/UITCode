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
node* Head;
node* Tail;};
node* createnode(int x)
{
    node *p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addTail (List &L, int x)
{
    if(L.Head==NULL)
        L.Head=L.Tail=createnode(x);
    else
    {
        node *p = createnode(x);
        L.Tail->next=p;
        L.Tail=p;
    }
}
void Init(List &L)
{
    L.Head=L.Tail=NULL;
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
    node *p= L.Head;
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
void concate(List &L1,List L2)
{
    if(L1.Head==NULL &&L2.Head==NULL)
        cout<<"List is empty";
    else if(L1.Head==NULL&& L2.Head!=NULL)
            L1.Head=L2.Head;
    else
    {
        L1.Tail->next=L2.Head;
        L1.Tail=L2.Tail;
    }
}
//###INSERT CODE HERE -
int main()
{
    List L1, L2;
    Init(L1);Init(L2);

    int n; cin>>n;
    inputList(L1,n);
    cout<<"Created 1st List: "<<endl;
    outputList(L1);
    cout<<endl;

    cin>>n;
    inputList(L2,n);
    cout<<"Created 2nd List: "<<endl;
    outputList(L2);
    cout<<endl;

    concate(L1,L2); // Noi L2 vao L1
    cout<<"Updated L1: "<<endl;
    outputList(L1);

    return 0;
}
