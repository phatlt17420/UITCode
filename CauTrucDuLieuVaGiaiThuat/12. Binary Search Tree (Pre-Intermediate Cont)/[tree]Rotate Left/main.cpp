#include <iostream>

using namespace std;
struct node {
int info;
node* left;
node * right;};
typedef node* Tree;
node* creatnode (int x)
{
    node*p = new node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void addnode(Tree &T, int x)
{
    if(T==NULL)
        T=creatnode(x);
    else
    {
        if(x==T->info)
            cout<<"Khong the them";
        else if(x<T->info)
            addnode(T->left,x);
        else
            addnode(T->right,x);
    }
}
void NLR(Tree T)
{
    if(T==NULL)
        return;
    else
    {
        cout<<T->info<<" ";
        NLR(T->left);
        NLR(T->right);
    }
}
// Cách 1: return gốc mới
//node* rotateLeft(Tree &T)
//{
//    node*p=T->right;
//    T->right=p->left;
//    p->left=T; //cập nhật lại bên trái 20 là 15
//    // cắt nhánh 18 gắn vào bên phải 15
//    return p;
//}
//cách 2
void RotateLeft (Tree &T)
{
    if(T==NULL)
        cout<< "\nKhong the xoay vi cay rong";
    else if (T->right==NULL)
        cout<< "\nKhong the xoay trai vi khong co nut con ben phai";
    else
    {
         node*p=T->right;
    T->right=p->left;
    p->left=T; //cập nhật lại bên trái 20 là 15
    // cắt nhánh 18 gắn vào bên phải 15
    T=p;
    }
}
int main()
{
    Tree T;
    T=NULL;
    int n,x;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>x;
        addnode(T,x);
    }
    cout<<"NLR: ";
    NLR(T);

    RotateLeft(T);
cout<<endl;
cout<<"NLR: ";
    NLR(T);
    return 0;
}
