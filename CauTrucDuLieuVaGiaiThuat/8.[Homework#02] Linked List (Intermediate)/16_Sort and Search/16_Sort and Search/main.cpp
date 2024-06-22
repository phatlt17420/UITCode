#include <iostream>
using namespace std;
//###INSERT CODE HERE -
struct node
{
    int info;
    node* next;
};
struct List {
node* pHead;
node* pTail;};
node* createnode(int x)
{
    node *p=new node;
    p->info=x;
    p->next=NULL;
    return p;
}
void addTail (List &L, int x)
{
    if(L.pHead==NULL)
        L.pHead=L.pTail=createnode(x);
    else
    {
        node *p = createnode(x);
        L.pTail->next=p;
        L.pTail=p;
    }
}
void init(List &L)
{
    L.pHead=L.pTail=NULL;
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
    node *p= L.pHead;
    if(p==NULL)
        cout<<"List is empty";
    else
    {
        while (p!=NULL)
        {
            if(p->next==NULL)
            {
                cout<<p->info;
                p=p->next;
            }
            else
            {
                cout<<p->info<<" ";
                p=p->next;
            }
        }
    }
}
node* Search(List L, int x)
{
    if(L.pHead==NULL)
        return NULL;
    else {
        node*p=L.pHead;
        while(p!=NULL)
        {
            if(p->info==x)
                return p;
            p=p->next;
        }
            return NULL;
    }
}
void MySort(List &L)
{
    if(L.pHead==NULL)
        return ;
    else
    {
        node*p=L.pHead;

        while (p!=NULL)
        {
            node *k =p->next;
            node* Min=p;
            while(k!=NULL)
            {
                if(k->info<Min->info)
                    Min =k;
                k=k->next;
            }
            swap(p->info,Min->info);


            p=p->next;
        }
    }
}
int MySearch(List L,int x)
{
    if(L.pHead==NULL)
        return -1;
    else
    {
        int dem=0;
        node*p=L.pHead;
        while(p!=NULL)
        {
            if(p->info==x)
                return dem;
            dem++;
            p=p->next;
        }
        return -1;
    }
}
//###INSERT CODE HERE -
int main()
{
    int n; cin>>n;
    List L;init (L);
    inputList(L,n);
    MySort(L);
    cout<<"Sorted List: ";
    outputList(L);// liet ke cac phan tu cach nhau boi 1 khoang cach

    cout<< "\nFind an element: ";
    int x; cin>>x;
    cout<<x<<endl;
    int result = MySearch(L,x);
    if (result ==-1) cout<<x<<" is not found";
    else cout<<x<<" is found at the position " << result;

	return 0;
}

