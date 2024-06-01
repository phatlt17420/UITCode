/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
###End banned keyword*/

#include <iostream>

#define MAX 2000
#define NULLDATA -1

using namespace std;
struct Stack
{
    int arr[MAX];
    int n; // so luong phan tu cua stack
};
void Init(Stack& S)
{
    S.n=0; // Khởi tạo n=0;
    for (int i=0; i<S.n; i++)
        S.arr[i]=NULLDATA; //
}
bool isFull (Stack S)
{
    return (S.n==MAX);
}
bool isEmpty (Stack S)
{

    return (S.n==0);
}
void Push (Stack& S, int x)
{
    if(isFull(S)==true)
        return;
    else
    {
        S.arr[S.n]=x;
        S.n++;
        //S.arr[S.n++]=x;
    }
}
void printStack(Stack S)
{
    if (isEmpty(S))
        cout<<"Stack is empty";
    else
    {
        for (int i=S.n-1; i>=0; i--)
            cout<<S.arr[i];
    }
}
int Top (Stack S)
{
    if (isEmpty(S))
        return NULLDATA;
    return S.arr[S.n-1];
}
void Pop(Stack & S)
{
    if (isEmpty(S))
        return;
    S.arr[S.n-1]=NULLDATA;
    S.n--;
}
void DecimaltoBinary2(int n,Stack& S)
{
    if (n==0)
        Push(S,0);
    while (n!=0)
    {
        int k = n%2;
        Push(S,k);
        n=n/2;
    }

}





//###INSERT CODE HERE -

int main()
{
    Stack S;
    Init(S);
    int n,x;
    cin>>n;
    DecimaltoBinary2(n,S);
    printStack(S);
    return 0;
}




