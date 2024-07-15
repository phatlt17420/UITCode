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
    int hashtable[M];
    int N;//N : số phần tử có trong bảng hashtable
};
void initHash(Hash &H)
{
    H.N=0;
    for(int i=0; i<M; i++)
        H.hashtable[i]=NULLKEY;
}
bool isFull(Hash H)
{
    for(int i=0;i<M;i++)
    {
        if(H.hashtable[i]==-1)
            return false;
    }
    return true;
}
int hashfunc(int x, int &dem)
{
    return (x+dem)%M;
}
void insertHash(Hash &H,int x)
{
    if (isFull(H))
        cout<<"\nBang bam bi day, khong them duoc";
   int dem=0;
   int i= hashfunc(x,dem);
   while(H.hashtable[i]!=NULLKEY)
   {
       dem++;

   }

}
void traverseAllHash(Hash H)
{
    for(int i=0; i<M; i++)
        cout<<H.hashtable[i]<<" ";
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

