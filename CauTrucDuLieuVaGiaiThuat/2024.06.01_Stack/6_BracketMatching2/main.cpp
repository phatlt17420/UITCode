#include<string>
#include<cstring>
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
    for (int i=0;i<S.n;i++)
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
            for (int i=0; i<S.n; i++)
                cout<<S.arr[i]<<" ";

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
bool isValid(string s)
{
    Stack S;
    Init(S);
    for(int i=0; i<s.size(); i++)
    {
        if (s[i]=='(')
            Push(S,s[i]);
        if ((s[i]==')'))
        {
            if(isEmpty(S))
                return false;
            Pop(S); // lưu ý trường hợp xóa nhưng stack rỗng.
        }
        if (s[i]=='[')
            Push(S,s[i]);
        if ((s[i]==']'))
        {
            if(isEmpty(S))
                return false;
            Pop(S); // lưu ý trường hợp xóa nhưng stack rỗng.
        }
        if (s[i]=='{')
            Push(S,s[i]);
        if ((s[i]=='}'))
        {
            if(isEmpty(S))
                return false;
            Pop(S); // lưu ý trường hợp xóa nhưng stack rỗng.
        }
    }
    if (!(isEmpty(S)))
        return false;
    return true;
}
//###INSERT CODE HERE -

int main()
{
	string expr; cin>>expr;
	cout<< isValid(expr);

	return 0;
}



