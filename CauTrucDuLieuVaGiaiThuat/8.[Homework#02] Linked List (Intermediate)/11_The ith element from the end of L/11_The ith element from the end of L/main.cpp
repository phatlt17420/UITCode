#include <iostream>
#include <cstring>
#include <string>
using namespace std;
//###INSERT CODE HERE -
struct node {
string info;
node* next;};
struct List {
node* Head;
node* Tail;};
void Init(List &L)
{
    L.Head=L.Tail=NULL;
}
node* creatnode(string x)
{
    node*p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addTail(List &L, string x)
{
    if(L.Head==NULL)
        L.Head=L.Tail=creatnode(x);
    else
    {
        node*p=creatnode(x);
        L.Tail->next=p;
        L.Tail=p;
    }
}
void inputList(List &L,int n)
{
    string x;

    for(int i=0;i<n;i++)
    {
        cin>>x;
        addTail(L,x);
    }
}
void outputList(List L)
{
    node*p=L.Head;
    if(p==NULL)
        {
            cout<<"List is empty";

        }
    else
    {

        while (p!=NULL)
        {
            cout<<p->info<<" ";
            p=p->next;
        }
    }
}
node * findElementFromEnd(List L,int i)
{
    if (L.Head==NULL)
    {
        node* p= new node;
        p->info="List is empty";
        return p;
    }
    else
    {
        int dem=0;
        node*p=L.Head;
        while(p!=NULL)
        {
            dem++;
            p=p->next;
        }

        p=L.Head;
        int k=0;
        if(i>dem)
        {
            p->info="The index is invalid";
        }

        else
        {
            while(k!=(dem-i))
            {
                k++;
                p=p->next;
            }
        }
        return p;
    }
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

    int i; cout<<"\nEnter a number: "; cin>>i;
    cout<<"\nThe element at index "<<i<<" (from the end of L): ";
    node *p = findElementFromEnd(L,i);
    if(p) cout<<p->info;


    return 0;
}
