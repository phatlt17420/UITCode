#include <iostream>
using namespace std;
struct node
{
    int info;
    node* next;
};
struct Hash
{
    int m; //số địa chỉ có trong HashTable
    int n; // số phần tử có trong HashTable
    node** bucket;
};
node* createnode (int x)
{
    node* p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void Init(Hash& H)
{
    H.n=0;
    H.bucket=new node*[H.m];
    for (int i=0; i<H.m ; i++ )
    {
        H.bucket[i]=NULL;
    }
}
void insertElement(Hash &H, int x)
{
    int index = x%H.m;
    H.n++;
    if(H.bucket[index] == NULL)
        H.bucket[index] = createnode(x);
    else
    {
        node* p = createnode(x);
        node* q=NULL;
        node* tmp=H.bucket[index];
        while (!(tmp==NULL||x<tmp->info))
        {
            q=tmp;
            tmp=tmp->next;
        }
        if (tmp==H.bucket[index])
        {
            p->next=H.bucket[index];
            H.bucket[index]=p;
        }
        else
        {
            p->next=tmp;
            q->next=p;
        }
    }
}
void travesal (Hash H)
{
    for (int i=0; i<H.m ; i++ )
    {
        cout<<"Bucket "<<i<<": ";
        node* p=H.bucket[i];
        if (H.bucket[i] ==NULL)
            cout<<endl;
        else
        {
            while(p!=NULL)
            {
                cout<<p->info<<" ";
                p=p->next;
            }
            cout<<endl;
        }
    }
}
void DeleteElement(Hash &H, int x)
{
    int index = x%H.m;
    if(H.bucket[index]==NULL)
        cout<<"Khong co phan tu co khoa "<<x<<endl;
    else
    {
        node* p = H.bucket[index];
        node* q = NULL;
        while (! (p == NULL || p->info == x))
        {
            q = p;
            p = p->next;
        }
        if (p==NULL)
            cout<<"Khong co phan tu co khoa "<<x<<endl;
        else
        {
            if(p==H.bucket[index])
            {
                H.bucket[index]=p->next;
                delete p;
            }
            else
            {
                q->next=p->next;
                delete p;
            }
            H.n--;
        }
    }
}

int main()
{
    Hash H;

    int m; // số địa chỉ có trên hashTable
    cin>>m;
    H.m=m;
    int n;// số phần tử có trong hashTable
    cin>>n;
        Init(H);
    for (int i=0; i<n ; i++ )
    {
        int x;
        cin>>x;
        insertElement(H,x);
    }
    cout<<"Created Hash:"<<endl;
    travesal(H);

    while(1)
    {
        int opt;
        cin>>opt;
        if (opt==1)
        {
            int x;
            cin>>x;
            cout<<"Insert "<<x<<endl;
            insertElement(H,x);
        }
        else if (opt==2)
        {
            int x;
            cin>>x;
            cout<<"Delete "<<x<<endl;
            DeleteElement(H,x);
        }
        else
            break;
    }
    cout<<"Updated Hash:"<<endl;
    travesal(H);




    return 0;
}
