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
    node *pHead;
    node * pTail;
};
void Init(List &L)
{
    L.pHead=L.pTail=NULL;
}
node* creatnode (int x)
{
    node *p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addTail(List &L, int x)
{
    node *p=creatnode(x);
    if (L.pHead==NULL)
        L.pHead=L.pTail=p;
    L.pTail->next=p;
    L.pTail=p;
}
void inputList(List &L,int n)
{
    int x;
    for (int i=0;i<n;i++)
    {
        cin>>x;
        addTail(L,x);
    }
}
void outputList(List L)
{
    if (L.pHead==NULL)
        cout<<"List is empty";
    for(node *p=L.pHead; p!=NULL; p=p->next)
        cout<<p->info<<" ";
}
void outputGreaterThan(List L,int m)
{
    if (L.pHead==NULL)
        cout<<"List is empty";
    else
    {
        node*p=L.pHead;
        bool kiemTra=true;
        while (p!=NULL)
        {
            if(p->info>m)
            {
                cout<<p->info<<" ";
                kiemTra=false;
            }
            p=p->next;
        }
        if(kiemTra)
            cout<<"None";
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


    cout<<"\nEnter a number: "; int m; cin>>m;
    cout<<"\nValues greater than "<<m<<": ";
    outputGreaterThan(L,m);
    /*Xuat tat ca cac gia tri duoc luu trong ds lon hon m.
     Neu ds rong thi xuat thong bao "List is empty".
     Neu ds khong rong nhung khong co gia tri thoa yeu cau thi xuat "None"*/

    return 0;
}
