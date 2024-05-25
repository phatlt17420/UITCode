#include <iostream>
#include <math.h>
using namespace std;
int BinarySearch (int *arr, int left, int right, int x)
{
    while (left<=right)
    {
        int mid =(left +right)/2;
        if(arr[mid]<x)
            return BinarySearch(arr,mid+1,right,x);
        if(arr[mid]>x)
            return BinarySearch(arr,left,mid-1,x);
        else
            return mid;
    }
    return -1;
}
void BinarySearch(int *arr,int n, int x)
{
    int dem=1;
    int left=0;
    int right=n-1;
    while (left<=right)
    {
        int mid=floor((left+right)/2);
        if (arr[mid]<x)
        {
            left=mid+1;
            dem++;
        }
        if (arr[mid]>x)
        {
            right=mid-1;
            dem++;
        }
        else
        {
            cout<<mid<<endl;
            cout<<dem<<endl;
        }
    }
return -1;
}


int main()
{

    int n;
    cin>>n;
    int *arr=new int[n];
    for(int i=0; i<n; i++)
        cin>>arr[i];
    int x;
    cin>>x;
    cout<<BinarySearch(arr,0,n-1,x);
    cout<<endl;
    if(demSoLan(arr,n,x)!=-1)
    cout<<demSoLan(arr,n,x);
    return 0;
}
