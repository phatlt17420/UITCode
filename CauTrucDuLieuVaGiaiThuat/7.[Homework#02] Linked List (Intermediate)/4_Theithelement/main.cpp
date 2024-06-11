#include <iostream>
#include <cstring>
#include <string>
using namespace std;
//###INSERT CODE HERE -
struct node
{
    string info;
    node* next;
};
struct List
{
    node *pHead;
    node *pTail;
};
node* creatnode(string x)
{
    node*p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addTail(List &L, string x)
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
    string x;
    for (int i=0; i<n; i++)
    {
        cin>>x;
        addTail(L,x);
    }
}
void outputList(List L)
{
    if (L.pHead==NULL)
        cout<<"List is empty";
    else
    {
        for (node*p=L.pHead; p!=NULL; p=p->next)
            cout<<p->info<<" ";
    }
}

node* findElement(List L,int i)
{
    node *kq=new node;
    int dem=1;
    if (L.pHead==NULL)
        dem=0;
    else
    {
        for(node*ptemp=L.pHead; ptemp!=NULL; ptemp=ptemp->next)
        {
            if (dem==i)
            {
                kq=ptemp;
                return kq;
            }
            dem++;
        }
    }
    if(dem==0)
    {
        kq->info="List is empty";
        return kq;
    }
    else
    {
        kq->info="The index is invalid";
        return kq;
    }

}
void Init(List&L)
{
    L.pHead=L.pTail=NULL;
}
//###INSERT CODE HERE -
    int main()
{
    List L;
    Init(L);
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    cout<<"\nEnter a sequence of "<<n<<" numbers: ";
    inputList(L,n);
    cout<<"\nThe created Linked List: ";
    outputList(L);

    int i; cout<<"\nEnter a number: "; cin>>i;
    cout<<"\nThe element at index "<<i<<": ";
    node *p = findElement(L,i);
    if(p) cout<<p->info;


    return 0;
}
