#include <iostream>
using namespace std;
struct Node
{
    int info; // SV info;
    Node *left;
    Node *right;
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
Node* insertTree (Tree &T, int x) // thêm 1 giá trị mới vào cây// con trở thay đổi sẽ làm thay đổi các lần trước.
{
    if (T==NULL)
        T = getNode(x); //
    else
    {
        if (T->info ==x)
            cout<<"Khong them duoc, do trung"<<endl;
        else if ((T->info)>x)
            insertTree(T->left,x);
        else
            insertTree(T->right,x);
    }
}

void inputTree (Tree &T)
{
    int n,x;
    cin>>n;
    for (int i=0; i<n; i++)
    {
        cin>>x;
        insertTree(T,x);
    }

}
void NLR (Tree T)
{
    if (T==NULL) // cách viết khác: T==NULL  -->  !T
        return;
    cout<<T->info<<" ";
    NLR(T->left);
    NLR(T->right);
}
void LRN (Tree T)
{
    if (T==NULL) // cách viết khác: T==NULL  -->  !T
        return;

    LRN(T->left);
    LRN(T->right);
    cout<<T->info<<" ";
}
void LNR (Tree T)
{
    if (T==NULL) // cách viết khác: T==NULL  -->  !T
        return;

    LNR(T->left);
    cout<<T->info<<" ";
    LNR(T->right);
}



int main()
{
	Tree T = NULL;
	inputTree(T);
	cout<<"\nNLR: "; NLR(T);
	cout<<"\nLRN: "; LRN(T);
	cout<<"\nLNR: "; LNR(T);

	return 0;
}
