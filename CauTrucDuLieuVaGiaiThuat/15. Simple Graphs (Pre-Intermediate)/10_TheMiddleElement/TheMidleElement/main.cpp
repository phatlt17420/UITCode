
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
node* creatnode (int x)
{
    node *p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
struct List
{
    node* pHead;
    node* pTail;
};
void addTail(List &L, int x)
{
    if(L.pHead==NULL)
        L.pHead=L.pTail=creatnode(x);
    else
    {
        node*p=creatnode(x);
        L.pTail->next=p;
        L.pTail=p;
    }
}
void inputList(List & L,int n)
{
    for (int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        addTail(L,x);
    }
}

void outputList(List L)
{
    if(L.pHead==NULL)
        cout<<"List is empty";
    else
    {
        node *p =L.pHead;
        while(p!=NULL)
        {
            cout<<p->info<<" ";
            p=p->next;
        }
    }
}
node* findMiddle(List L)
{
    node*p=L.pHead;
    int dem=0;
    while (p!=NULL)
    {
        dem++;
        p=p->next;
    }
    p=L.pHead;
    int k=0;
//    if(dem%2==0)
//    {
        while(k!=(dem/2))
        {
            k++;
            p=p->next;
        }
        return p;
//    }

//    else
//    {
//        while(k!=(dem/2))
//        {
//            k++;
//            p=p->next;
//        }
//        return p;
//    }

}
//###INSERT CODE HERE -
    int main()
    {
        List L;
        L.pHead=L.pTail=NULL;
        int n;
        cin>>n;
        inputList(L,n);
        cout<<"Created List: "<<endl;
        outputList(L);
        cout<<endl;
        findMiddle(L);

        node *p=findMiddle(L); //Neu so phan tu chan thi co 2 phan tu chinh giua, chi xuat phan tu chinh giua thu 2
        if(p)cout<<"The middle element is "<<p->info;

        return 0;
    }
