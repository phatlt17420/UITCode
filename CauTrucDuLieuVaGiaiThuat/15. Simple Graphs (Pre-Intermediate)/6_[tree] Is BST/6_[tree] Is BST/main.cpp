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
node* getNode (int x)
{
    node* p = new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
node* Search(Tree T,int b)
{
    if(T==NULL)
        return NULL;
    else
    {
        node*p=T;
        if(p->info==b)
            return p;
        else
        {
            p=Search(T->left,b);
            if(p==NULL)
                p=Search(T->right,b);
            return p;
        }
    }
}
void SetLeft(node* p,int c)
{
    if(p==NULL)
        cout<<"Node khong ton tai\n";
    else if (p->left!=NULL)
        cout << "Da co node con ben trai\n";
    else
    {
        p->left=getNode(c);
    }
}
void SetRight(node* p,int c)
{
    if(p==NULL)
        cout<<"Node khong ton tai\n";
    else if (p->right!=NULL)
        cout << "Da co node con ben phai\n";
    else
    {
        p->right=getNode(c);
    }
}
void LNR(Tree T)
{
    if (T==NULL)
        return ;
    else
    {
        LNR(T->left);
        cout<<T->info<<" ";
        LNR(T->right);
    }
}
bool checkNode (Tree T, int Min, int Max)
{
    if (T==NULL)
        return true;
    else if (T->info<Min || T->info>Max)
        return false;
    else
        return checkNode(T->left,Min,T->info) && checkNode(T->right,T->info,Max);
}
int MinTree (Tree T)
{
        node*p = T->left;
        while(p->left!=NULL)
        {
            p=p->left;
        }
        return p->info;
}
int MaxTree (Tree T)
{
        node*p = T->right;
        while(p->right!=NULL)
        {
            p=p->right;

        }
        return p->info;

}
bool isBST(Tree T)
{
    if(T==NULL)
        return true;
    return checkNode(T,MinTree(T),MaxTree(T));
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
        if(a!='L'&& a!='R') break; // Neu khong phai L hoac R thi ket thuc viec tao cay
        cin>>b>>c;
        if(a=='L') SetLeft(Search(T,b),c); // chen c vao ben trai b
        else if (a=='R') SetRight(Search(T,b),c); // chen c vao ben phai b
    }
    cout<<"\nLNR: ";
    LNR(T);
    cout<<endl;
    if(isBST(T)) cout<<"\Cay vua tao la cay BST";
    else cout<<"\Cay vua tao khong phai la cay BST";

    return 0;
}
