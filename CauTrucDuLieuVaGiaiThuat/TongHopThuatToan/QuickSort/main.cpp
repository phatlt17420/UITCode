#include <iostream>

using namespace std;
void QuickSort (int*arr, int left, int right)
{
    int mid =arr[(left+right)/2];
    int i= left;
    int j=right;
    while (i<=j)
    {
        while(mid>arr[i])
            i++;
        while (mid<arr[j])
            j--;
        if (i<=j)
        {
            swap(arr[i],arr[j]);
            i++;
            j--;
        }

    }
    if (i<right)
        QuickSort(arr,i,right);
    if (j>left)
        QuickSort(arr,left,j);
}
int main()
{
    int arr[]= {5,2,3,7,9,8,1,0,15,13};
    int n=10;
    QuickSort(arr,0,n-1);
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";


    return 0;
}
