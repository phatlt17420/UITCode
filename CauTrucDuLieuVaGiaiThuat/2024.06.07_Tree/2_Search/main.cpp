#include <iostream>
using namespace std;
// Bài 2:
Node* Search (Tree T, int x)
{
    if (T==NULL)7
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
    Tree T = NULL;
    inputTree(T);
    cout<<"LNR: ";
    LNR(T);
    cout<<endl;


    int x;
    cout<<"\nEnter the element you want to find: ";
    cin>>x;
    Node *p=Search(T,x);
    if (p) cout<< "Found";
    else cout<<"Not found";
    cout<<"\nMinimum value in BTS is "<<minValue(T);
    cout<<"\nMinimax value in BTS is "<<maxValue(T);
    return 0;
}
