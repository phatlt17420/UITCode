#include <iostream>
using namespace std;
struct Node
{
    int info;
    Node*left;
    Node*right;
};
typedef Node* Tree;
Node* getNode (int x)
{
    Node* p =new Node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void LNR (Tree T)
{
    if (T==NULL)
        return;
    LNR(T->left);
    cout<<T->info<< " ";
    LNR(T->right);
}
Node* Search(Tree T, int b)
{
    if (T==NULL)
        return NULL;   // kiểm tra tình huống T rỗng
    if (T->info==b)
        return T;
    Node *p=Search(T->left,b); // tìm x bên nhánh trái
    if (p==NULL) // không thấy trái tìm tiếp bên phải
        p=Search(T->right,b);
    return p;
}
void SetLeft(Node* p, int x)
{
    if (p==NULL)
        cout<<"Node khong ton tai\n";
    else if(p->left!=NULL) // p đã có con bên trái
        cout << "Da co node con ben trai\n";
    else
        p->left=getNode(x);
}
void SetRight(Node* p, int x)
{
    if (p==NULL)
        cout<<"Node khong ton tai\n";
    else if(p->right!=NULL) // p đã có con bên trái
        cout << "Da co node con ben phai\n";
    else
        p->right=getNode(x);
}

int main()
{
    	Tree T = NULL;
	int x,b,c; char a;
	cin>>x;	T=getNode(x); // tao nut goc
	while(true)
    {
        cin>>a; // Ky tu cho biet chen vao trai hay phai
        if(a!='L'&& a!='R') break; // Neu khong phai L hoac R thi ket thuc viec tao cay
        cin>>b>>c;
        if(a=='L') SetLeft(Search(T,b),c); // chen c vao ben trai b
        else if (a=='R') SetRight(Search(T,b),c); // chen c vao ben phai b
    }
	cout<<"\nLNR: "; LNR(T); cout<<endl;

	return 0;
}
