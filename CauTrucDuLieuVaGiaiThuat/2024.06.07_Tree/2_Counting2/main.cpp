#include <iostream>
using namespace std;
struct Node
{
    int info;
    Node *left;
    Node *right;
};
typedef Node* Tree;
Node* getNode(int x)
{
    Node*p=new Node;
    p->info=x;
    p->left=p->right=NULL;
    return p;
}
void addNode (Tree &T, int x)
{
    if (T==NULL)
        T=getNode(x);
    else
    {
        if (T->info==x)
            cout<<"Khong them duoc"<<endl;
        else if (x<T->info)
            addNode(T->left,x);
        else
            addNode(T->right,x);
    }
}

// đếm số node bên nhánh trái, nhánh phải sau đó cộng gốc
void inputTree(Tree &T)
{
    int n,x;
    cin>>n;
    for (int i=0; i<n; i++)
    {
        cin>>x;
        addNode(T,x);
    }
}
void LNR(Tree T)
{
    if(T==NULL)
        return;
    LNR(T->left);
    cout<<T->info<<" ";
    LNR(T->right);

}
int countNodes (Tree T)
{
    if (T==NULL)
        return 0;
    return 1+countNodes(T->left)+countNodes(T->right);
}
int depthOfTree(Tree T)
{
    if(T==NULL)
        return -1;
    // hoặc if(T->left==NULL && T->right==NULL) return 0;
    return 1+max(depthOfTree(T->left),depthOfTree(T->right));
}

/*
ý tưởng:

*/
void countEven(Tree T,int &count_even)
{
    if(T==NULL)
        return ;
    if (T->info%2==0)
        count_even++;
    countEven(T->left,count_even);
    countEven(T->right,count_even);
}
void countOdd(Tree T, int &count_odd)
{
    if(T==NULL)
        return ;
    if (T->info%2!=0)
        count_odd++;
    countOdd(T->left,count_odd);
    countOdd(T->right,count_odd);
}
int countPositive(Tree T)
{
    int dem=0;
    if(T==NULL)
        return 0;
    if (T->info>0)
        dem++;
    return dem+countPositive(T->left)+countPositive(T->right);
}
int countNegative(Tree T)
{
    int dem=0;
    if(T==NULL)
        return 0;
    if (T->info<0)
        dem++;
    return countNegative(T->left) + countNegative(T->right)+dem;
}
bool isPrime(int x)
{
    if (x<=1)
        return false;
    for (int i=2; i<=x/2; i++)
        if(x%i==0)
            return false;
    return true;
}
int countPrime(Tree T)
{
    int dem=0;
    if(T==NULL)
        return 0;
    if (isPrime(T->info))
        dem++;
    return countPrime(T->left) + countPrime(T->right)+dem;
}
void listPrime(Tree T)
{
    if(T==NULL)
        return;
    if (isPrime(T->info))
        cout<<T->info<<" ";
    listPrime(T->left);
    listPrime(T->right);
}
int main()
{
    Tree T = NULL;
    inputTree(T);
    cout<<"LNR: ";
    LNR(T);
    cout<<endl;

    cout<<"Number of nodes: " << countNodes(T)<<endl;
    cout<<"Depth of Tree: "<<depthOfTree(T)<<endl;

    int count_even = 0, count_odd =0;
    countEven(T, count_even);
    countOdd(T, count_odd);
    cout<<"Number of even nodes: "<<count_even<<endl;
    cout<<"Number of odd nodes: "<<count_odd<<endl;

    cout<<"Number of positive nodes: "<<countPositive(T)<<endl;
    cout<<"Number of negative nodes: "<<countNegative(T)<<endl;

    cout<<"Number of prime nodes: "<<countPrime(T)<<endl;
    cout<<"Prime numbers: ";
    listPrime(T);

    return 0;
}
