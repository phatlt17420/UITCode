#include <iostream>
using namespace std;
struct Node
{
    int info; // SV info;
    int *left;
    int *right;
};
/*
struct Tree
{
    Node *root; //quản lý con trỏ node gốc. chỉ cần con trỏ quản lý node gốc là được, không cần tạo kiểu dữ liệu mới.
};
*/
typedef Node* Tree; // thay Node* thành Tree

// giống danh sách liên kết. tạo node
Node* getNode (int x) // viết hàm tạo node mới
{
    Node *p = new Node; // cấp phát vùng nhớ cho biến động;
    p->info=x;
    p->left=p->right=NULL; // khởi tạo gán con trỏ NULL
    return p;
}
void insertTree (Tree &T, int x) // thêm 1 giá trị mới vào cây// con trở thay đổi sẽ làm thay đổi các lần trước.
{
    if (T==NULL)
       T = getNode(x); //



    if (T->info ==x)
        cout<<"Khong them duoc, do trung";
    else if (T->info>x)
        insertTree(T->left,x);
    else
        insertTree(T->right,x);
}
int main()
{
    Tree T = NULL;

// nhập nhiều số

    int n;
    cin>>n;
    for (int i=0; i<n; i++)
    {
        cin>>x;
        insertTree(T,x);
    }


    return 0;
}
