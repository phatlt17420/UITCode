#include <iostream>
#include <cmath>
using namespace std;
struct Diem
{
    float x;
    float y;
    float z;
};
struct node
{
    Diem info;
    node* next;
};
struct List
{
    node* Head;
    node* Tail;
};
node* createNode()
{
    node* p = new node;
    Diem A;
    cin>>A.x;
    cin>>A.y;
    cin>>A.z;
    p->info=A;
    p->next=NULL;
    return p;
}
void addTail(List &L)
{
    node* p=createNode();
    if(L.Head==NULL)
        L.Head=L.Tail=p;
    else
    {
        L.Tail->next=p;
        L.Tail=p;
    }
}
void output(node* p)
{
    cout<<p->info.x<<" "<<p->info.y<<" "<<p->info.z<<endl;
}
void check(List A, List B)
{
    node* p = B.Head;
    while(p!=NULL)
    {
        node* k = A.Head;
        int dem=0;
        int flag=0;
        while(k!=NULL)
        {
            if((p->info.x==k->info.x)&& (p->info.y==k->info.y)&& (p->info.z==k->info.z))

            {
                cout<<dem<<endl;
                flag=1;
                break;
            }
            dem++;
            k=k->next;
        }
        if(flag==0)
            cout<<"KHONG"<<endl;

        p=p->next;
    }
}
int main()
{
    int n;
    cin>>n;
    List A;
    A.Head=A.Tail=NULL;
    for(int i=0; i<n; i++)
    {
        addTail(A);
    }
    int m;
    cin>>m;
    List B;
    B.Head=B.Tail=NULL;
    for(int i=0; i<m; i++)
    {
        addTail(B);
    }
    check(A,B);

    return 0;
}
