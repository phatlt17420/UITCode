#include <iostream>
#include <cstring>
#include <string>
using namespace std;
//###INSERT CODE HERE -
struct Province
{
    int id;
    string name;
    int pop;
    float area;
};
struct node
{
    Province info;
    node* next;
};
struct List
{
    node* pHead;
    node* pTail;
};
void init(List &L)
{
    L.pHead=L.pTail=NULL;
}
node* createnode()
{
    node* p=new node;
    Province tinh;
    int id;
    cin>>tinh.id;
    string name;
    cin.ignore();
    getline(cin,tinh.name);
    int pop;
    cin>>tinh.pop;
    float area;
    cin>>tinh.area;
    p->info=tinh;
    p->next=NULL;
    return p;
}
void addTail(List&L)
{
    if(L.pHead==NULL)
        L.pHead=L.pTail=createnode();
    else
    {
        node *p= createnode();
        L.pTail->next=p;
        L.pTail=p;
    }
}
void inputList(List &L,int n){
    for(int i=0;i<n;i++)
        addTail(L);
}
void outputTinh (node* p){
cout<<p->info.id<<"\t"<<p->info.name<<"\t"<<p->info.pop<<"\t"<<p->info.area;}
void outputList(List L)
{
    if(L.pHead==NULL)
        cout<<"List is empty";
    else
    {
        cout<<"ID\t|Province\t|Population\t|Area"<<endl;
        node*p=L.pHead;
        while(p!=NULL)
        {
            outputTinh (p);
            cout<<endl;
            p=p->next;
        }
    }

}
node * Search(List L, string tinh)
{if(L.pHead==NULL)
        return NULL;
else {
    node*p=L.pHead;
        while(p!=NULL)
        {
            if(p->info.name==tinh)
                return p;
            p=p->next;
        }
        return NULL;
}
}
void removeHead(List &L)
{
    if(L.pHead==NULL)
        return;
    else

}
void removeTail(L)
void deleteElement(L,deleteTinh)
void removeElement(List &L,string deleteTinh)
{
if(Search(L,deleteTinh)==L.pHead)
    removeHead(L);
else (Search(L,deleteTinh)==L.pTail)
    removeTail(L);
else
    deleteElement(L,deleteTinh);
}
//###INSERT CODE HERE -
int main()
{
    int n; cin>>n;
    List L;init (L);
    inputList(L,n);
    cout<<"List of provinces:"<<endl;
    outputList(L);
    cout<<"Enter the name of the province you want to delete:";
    string deleteTinh;
    cin.ignore();
    getline(cin,deleteTinh);
    removeElement(L,deleteTinh);
    cout<<"Updated List:"<<endl;
    outputList(L);


	return 0;
}


//###INSERT CODE HERE -


