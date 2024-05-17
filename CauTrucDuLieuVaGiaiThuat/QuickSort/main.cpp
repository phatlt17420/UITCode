#include <iostream>

using namespace std;
void QuickSort(int arr[],int left, int right)
{
    int mid = arr[(right+left)/2];
    int i=left;
    int j = right;
    while (i<=j)
    {
        while (arr[i]<mid)
            i++;
        while (arr[j]>mid)
            j--;
        if(i<=j)
           {
               swap(arr[i],arr[j]);
               i++;
               j--;
           }
    }
    if(left<j)
        QuickSort(arr,left,j);
    if(i<right)
        QuickSort(arr,i,right);


}
void out(int arr[],int n)
{

    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";
}
int main()
{
    int n;
    cin>>n;
    int *arr=new int[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];

    QuickSort(arr,0,n-1);
    out(arr,n);
    return 0;
}
