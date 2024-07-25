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
    int* HashTable;
    int n;// số lượng phần tử của bảng
    int m; // số nút có trên bảng băm
};
void initHash(Hash & H)
{
    H.n=0;
    H.HashTable=new int [M];
    for (int i=0;i<M ;i++ )
         H.HashTable[i]=NULLKEY;
    H.m=M;
}
int indexFunc (int x)
{
    return x%M;
}
void insertHash(Hash & H,int x)
{
    int index = indexFunc(x);
    if(H.HashTable[index]==-1)
    {
        cout<<"Insert "<<x<<endl;
        H.HashTable[index]=x;
    }
    else
    {
        int i=1;
        while(H.HashTable[index]!=-1)
        {
            index=(index+i*i)%M;
            i++;
            int flag=1;
            for (int j=0;j<M ;j++ )
                if(H.HashTable[j]==-1)
                    flag=0;
            if (flag==1)
                break;
        }
        cout<<"Insert "<<x<<endl;
        H.HashTable[index]=x;


    }

}
void traverseAllHash(Hash H)
{
    for (int i=0;i<M ;i++ )
        {
        if(H.HashTable[i]==-1)
            cout<<i<<endl;
        else
            cout<<i<<" --> "<<H.HashTable[i]<<endl;
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

