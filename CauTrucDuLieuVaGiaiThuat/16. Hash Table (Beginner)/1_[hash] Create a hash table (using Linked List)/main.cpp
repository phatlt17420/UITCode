#include <iostream>
#include <cstring>
#include <string>
#define MAX 1000
using namespace std;
//###INSERT CODE HERE -
struct node
{
    int info;
    node* next;
};
node* createnode (int x)
{
    node* p =new node;
    p->info=x;
    p->next=NULL;
    return p;
}
struct Hash {
    int m;// m: số địa chỉ có trong bảng băm
    int n; // số phần tử có trong bảng băm
    node** bucket;
};
void initHash(Hash &H)
{
    H.n=0;
    H.bucket=new node*[H.m];
    for(int i=0;i<H.m;i++)
        H.bucket[i]=NULL;
}
void insertHash(Hash &H, int x)
{
    int k = x%H.m;

    if(H.bucket[k]==NULL)
    {
        H.bucket[k]=createnode(x);
    }
    else
    {
        // tìm vị trí gắn x;
        node* p = H.bucket[k];
        node *q;
        node* tmp=createnode(x);
        while(!(p==NULL || p->info>x))
        {
            q=p;
            p=p->next;
        }
        if(p==H.bucket[k])
        {
            tmp->next=H.bucket[k];
            H.bucket[k]=tmp;
        }
        else
        {
            tmp->next=p;
            q->next=tmp;
        }



    }
}
void traverseAllHash(Hash H)
{
    for(int i=0;i<H.m;i++)
    {
        cout<<"Bucket"<<i<<" :";
        node*p=H.bucket[i];
        while(p!=NULL)
        {
            cout<<p->info<<" ";
            p=p->next;
        }
        cout<<endl;
    }
}
//###INSERT CODE HERE -
int main()
{
    Hash H;
    cin>>H.m; // m la so dia chi co trong bang bam
    initHash(H); //khoi tao cac bucket

    int n,x;cin>>n; // n la so luong gia tri can phai luu tru
    for (int i = 1; i<=n;i++)
    {
        cin>>x;
        insertHash(H,x); // them 1 gia tri du lieu vao bang bam
    }
    cout<<"Created Hash:"<<endl;
    traverseAllHash(H); // Xuat toan bo cac bucket cua Bang bam

    return 0;
}

