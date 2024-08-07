/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
->
###End banned keyword*/

#include <iostream>
#include <cstring>
#include <string>
#define M 10		// M là số nút có trên bảng băm, đủ để chứa các nút nhập vào bảng băm
#define NULLKEY -1
using namespace std;
//###INSERT CODE HERE -
struct Hash
{
    int hashtable[10];
    int m; // số địa chỉ giá trị của hashtable
    int n;//số phần tử của hashtable
};
void initHash(Hash &H)
{
    H.n=0;
    H.m=M;
    for (int i=0; i<M ; i++ )
        H.hashtable[i]=NULLKEY;
}
void insertHash(Hash &H,int x)
{
    int index=x%M;
    int j=index;
    if (H.hashtable[index]==-1)
    {
        H.hashtable[index]=x;
    }
    else
    {
        int flag=1;
        for (int i=0; i<M ; i++ )
        {
            if(H.hashtable[i]==-1)
                flag=0;
        }
        if(flag==1)
            cout<<"\nBang bam bi day, khong them duoc"<<endl;
        else
        {
            int k=1;
            while(H.hashtable[index]!=-1)
            {
                index=(j+k*k)%M;
                k++;
            }
            H.hashtable[index]=x;
        }
    }
}


void traverseAllHash(Hash H)
{
    for (int i=0; i<H.m ; i++ )
    {
        if(H.hashtable[i]==-1)
            cout<<i<<endl;
        else
            cout<<i<<" --> "<<H.hashtable[i]<<endl;
    }
}
//###INSERT CODE HERE -
int main()
{
    Hash H;
    initHash(H);

    int n,x;
    cin>>n; // n la so luong gia tri can phai luu tru
    for (int i = 1; i<=n; i++)
    {
        cin>>x;
        cout<<"\nInsert "<<x;
        insertHash(H,x); // them 1 gia tri du lieu vao bang bam
    }
    cout<<"\nCreated Hash:"<<endl;
    traverseAllHash(H);

    return 0;
}

