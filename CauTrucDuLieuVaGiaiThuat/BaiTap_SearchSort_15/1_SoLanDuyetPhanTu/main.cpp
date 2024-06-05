#include <iostream>
using namespace std;
int BinarySearch (int *arr, int left, int right, int x, int &k)
{
    int mid = (left+right)/2;

    if(left<=right)
    {

        if (x==arr[mid])
        {
            k++;
            return mid;
        }
        if (x<arr[mid])
        {
            k++;
            return BinarySearch(arr,left,mid-1,x,k);
        }
        if (x>arr[mid])
        {
            k++;
            return BinarySearch(arr,mid+1,right,x,k);
        }
    }
    else
    return -1;
}
int main()
{
    int n;
    cin>>n;
    int *arr=new int[n];
    for (int i=0;i<n;i++)
        cin>>arr[i];
    int x;
    cin>>x;
    int k=0;
    cout<<BinarySearch(arr,0,n-1,x,k)<<endl;
    if(BinarySearch(arr,0,n-1,x,k) !=-1)
    cout<<k/2;

    return 0;
}
