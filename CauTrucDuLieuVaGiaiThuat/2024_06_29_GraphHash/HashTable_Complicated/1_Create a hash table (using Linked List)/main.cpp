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
struct Hash
{
    int m; // số địa chỉ
    int n; // số lượng phần từ trong Hash Table
    node **bucket;
};
void initHash(Hash &H)
{
    H.n=0;
    H.bucket=new node*[H.m]; // cấp phát vùng nhớ
    for(int i=0; i<H.m; i++)
        H.bucket[i]=NULL; // bucket[i] là con trỏ đầu của danh sách liên kết thứ i
}
int hashFunc( int x, int m) // tìm địa chỉ cho giá trị
{
    return x%m;
}
node* createnode(int x)
{
    node*p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void insertHash(Hash &H,int x)
{
    int index=hashFunc(x,H.m);
    node*head=H.bucket[index];
    node*tmp=createnode(x);
    // tìm vị trí phù hợp
    if(head==NULL)
    H.bucket[index]=tmp;
    else
    {
        node* p = H.bucket[index];
        node*q;
        while (!(p==NULL||p->info>x))//dừng khi gặp NULL hoặc 1 giá trị lớn hơn
        {
            q=p;
            p=p->next;
        }
        if(p==H.bucket[index])// ngoại lệ thêm vào đầu
        {
            tmp->next=p;
            H.bucket[index]=tmp;
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
    for(int i=0; i<H.m; i++)
    {
        cout<<"Bucket "<<i<<": ";
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

    int n,x;
    cin>>n; // n la so luong gia tri can phai luu tru
    for (int i = 1; i<=n; i++)
    {
        cin>>x;
        insertHash(H,x); // them 1 gia tri du lieu vao bang bam
    }
    cout<<"Created Hash:"<<endl;
    traverseAllHash(H); // Xuat toan bo cac bucket cua Bang bam

    return 0;
}

