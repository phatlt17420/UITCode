#include <iostream>
#include <string>
using namespace std;
//###INSERT CODE HERE -
struct Product
{
    int id;
    string name;
    string type;
    int year;
    int warranty;
};
struct Node
{
    Product info;
    Node* pLeft;
    Node* pRight;
};
typedef Node* Tree;
Node* createnode()
{
    Product P;
    cin>>P.id;
    cin.ignore();
    getline(cin,P.name);

    getline(cin,P.type);
    cin>>P.year;
    cin>>P.warranty;
    Node*p=new Node;
    p->info=P;
    p->pLeft=p->pRight=NULL;
    return p;
}
void addnode(Tree &T, Node*p)
{
    if(T==NULL)
        T=p;
    else
    {
        if(T->info.id==p->info.id)
            cout<<"Khong them duoc do trung ID"<<endl;
        if(T->info.id>p->info.id)
            addnode(T->pLeft,p);
        else
            addnode(T->pRight,p);
    }
}
void inputTree(Tree &T)
{
    int n;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        Node*p=createnode();
        addnode(T,p);
    }
}
void outnode(Node* p)
{
    cout<<p->info.id<<"\t"<<p->info.name<<"\t"<<p->info.type<<"\t"<<p->info.year<<"\t"<<p->info.warranty<<"\n";
}
void LNR (Tree T)
{
    if(T==NULL)
        return;
    else
    {
        LNR(T->pLeft);
        outnode(T);
        LNR(T->pRight);
    }
}
void listProduct(Tree T,string type)
{
    if(T==NULL)
        return;
    else
    {
        listProduct(T->pLeft, type);
        if(T->info.type==type)
            outnode(T);
        listProduct(T->pRight,type);
    }
}
int countProduct(Tree T,int year)
{
    if(T==NULL)
        return 0;
    else
    {
        if(T->info.warranty>year)
            return 1+countProduct(T->pLeft,year)+ countProduct(T->pRight,year);
        else
            return countProduct(T->pLeft,year)+ countProduct(T->pRight,year);
    }
}
//###INSERT CODE HERE -
int main()
{
    Tree T = NULL;
    inputTree(T);
    string type;
    cin.ignore();
    getline(cin,type);
    cout<<"List of products whose type is  "<<type<<": ";
    cout<<"\nID\tName\tType\tYear\tWarranty\n";
    listProduct(T,type);

    int year;
    cin>>year;
    cout<<"Number of products with more than "<<year<<" years of warranty: "<<countProduct(T,year)<<endl;


    return 0;
}

