#include <iostream>

using namespace std;
// Bài 2:
Node* Search (Tree T, int x)
{
    if (T==NULL)
    return T;
    if (T->info==x)
        return T;
    else if (T->info>x)
        return Search(T->left,x);
    else
        return Search(T->right,x);

}
int maxValue (Tree T)
{
    Node*p=T;
    while (p->right!=NULL)
    {
        p=p->right;
    }
    return p->info;
}
// viết theo dạng đệ quy
//int maxValue (Tree T)
//{
//    int maxValue (Tree T)
//}
int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
