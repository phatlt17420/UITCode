#include <iostream>
using namespace std;
//###INSERT CODE HERE -
struct node
{
    int info;
    node* left;
    node* right;
};
typedef node* Tree;
node* getNode(int x)
{
    node* p =new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
node* Search(Tree T,int b)
{
    if(T==NULL)
        return NULL;
    if(T->info==b)
        return T;
    node* p= Search(T->left,b);
    if(p==NULL)
        p= Search(T->right,b);
    return p;
}
void SetLeft(node* T,int c)
{
    if(T==NULL)
        return ;
    else
    {
        if(T->left!=NULL)
            return ;
        else
            T->left=getNode(c);
    }
}
void SetRight(node* T,int c)
{
    if(T==NULL)
        return ;
    else
    {
        if(T->right!=NULL)
            return ;
        else
            T->right=getNode(c);
    }
}

void LNR(Tree T)
{
    if(T==NULL)
        return ;
    else
    {
        LNR(T->left);
        cout<<T->info<<" ";
        LNR(T->right);
    }
}
// thao tác xoá
void DeleteLeft(node* p)
{
    if(p==NULL)
    {
        cout<<"Node khong ton tai\n";
        return ;
    }
    if(p->left==NULL)
    {
        cout << "Khong co node ben trai\n";
        return;
    }
    node*q = p->left;
    if(q->left==NULL && q->right==NULL)
    {
       p->left=NULL;
        delete q;
    }
    else
    {
        cout << "Khong la node la nen khong xoa duoc\n";
    }
}
void DeleteRight(node* p)
{
    if(p==NULL)
    {
        cout<<"Node khong ton tai\n";
        return ;
    }
    if(p->right==NULL)
    {
        cout << "Khong co node ben phai\n";
        return ;
    }
    node* q= p->right;
    if(q->left==NULL &&q->right==NULL)
    {
        p->right=NULL;
        delete q;


    }
    else
    {
        cout << "Khong la node la nen khong xoa duoc\n";
    }
}
//###INSERT CODE HERE -
int main()
{
    Tree T = NULL;
    int x,b,c;
    char a;
    cin>>x;
    T=getNode(x); // tao nut goc
    while(true)
    {
        cin>>a; // Ky tu cho biet chen vao trai hay phai
        if(a!='L'&& a!='R') break;
        cin>>b>>c;
        if(a=='L') SetLeft(Search(T,b),c);
        else if (a=='R') SetRight(Search(T,b),c);

    }
    cout<<"LNR: ";
    LNR(T);
    cout<<"\nDelete some nodes:\n";
    string s;
    while(true)
    {
        cin>>s; // Chuoi cho biet xoa ben trai hay ben phai
        if(s!="DL"&& s!="DR") break;
        cin>>b;
        if(s=="DL") DeleteLeft(Search(T,b));
        else if(s=="DR") DeleteRight(Search(T,b));

    }
    cout<<"\nLNR: ";
    LNR(T);

    return 0;
}
