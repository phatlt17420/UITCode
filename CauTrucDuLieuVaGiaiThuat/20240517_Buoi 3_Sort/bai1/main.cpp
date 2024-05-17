#include <iostream>
using namespace std;
int BinarySort(int *&arr, int left, int right, int x)
{
    while (left<=right)
    {
        int mid = (left+right)/2;
        if(x==arr[mid])
            return mid;
        if(x<arr[mid])
        {
            right=mid-1;
            return BinarySort(arr,left,right,x);
        }
        if(x>arr[mid])
        {
            left=mid+1;
            return BinarySort(arr,left,right,x);
        }
        return mid;
    }
    return -1;
}

int main()
{
    int n;
    cin>>n;
    int *arr=new int[n];
    for (int i=0; i<n; i++)
        cin>>arr[i];

    int m;
    cin>>m;
    int *arr1=new int[m];
    for (int i=0; i<m; i++)
        cin>>arr1[i];
    for (int i=0; i<m; i++)

        cout<<BinarySort(arr,0,n-1,arr1[i])<<endl;

    return 0;
}
