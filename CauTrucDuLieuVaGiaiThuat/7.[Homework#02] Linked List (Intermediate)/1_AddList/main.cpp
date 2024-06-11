/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
###End banned keyword*/

#include <iostream>
#include <cstring>
#include <string>
using namespace std;
//###INSERT CODE HERE -
struct node
{
    int info;
    node *next;
};
struct List
{
    node* pHead;
    node* pTail;
};
void Init (List &L)
{
    L.pHead=L.pTail=NULL;
}
node* creatnode (int x)
{
    node* p =new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addTail (List &L, int x)
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

    for(int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        addTail(L,x);
    }
}
void outputList(List L)
{
    node *p=L.pHead;
    if(L.pHead==NULL)
        cout<<"List is empty"<<endl;

    while (p!=NULL)
    {
        cout<<p->info<<" ";
        p=p->next;
    }
}
void addHead (List &L, int x)
{
    node *p=creatnode(x);
    if (L.pHead==NULL)
        L.pHead=L.pTail=p;
    else
    {
        p->next=L.pHead;
        L.pHead=p;
    }

}
void addList(List &L,int n)
{

    for(int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        addHead(L,x);
    }
}
//###INSERT CODE HERE -
int main()
{
    List L; // Khai bao 1 danh sach
    Init(L); // Khoi tao danh sach
    int n; cout<<"Enter a number: "; cin>>n; // Nhap so luong phan tu cua ds
    cout<<"\nEnter a sequence of "<<n<<" numbers: ";
    inputList(L,n); // Nhap 1 day gom n so va luu vao ds. Phan tu moi duoc them vao cuoi ds
    cout<<"\nThe created Linked List: ";
    outputList(L); // Xuat ds. Neu ds rong thi xuat thong bao "List is empty"

    cout<<"\nEnter a number: "; int m; cin>>m; // Nhap so luong phan tu them vao dau ds
    cout<<"\nEnter a sequence of "<<m<<" numbers: ";
    addList(L,m); // Nhap 1 day gom m so va them phan tu moi vao dau ds
    cout<<"\nThe updated Linked List: ";
    outputList(L); // Xuat ds. Neu ds rong thi xuat thong bao "List is empty"

    return 0;
}
