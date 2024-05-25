#include <iostream>

using namespace std;
void SelectionSort(int *arr, int n)
{
    for(int i=0; i<n; i++)
    {
        int Min=i;
        for(int j = i+1; j<n; j++)
        {
            if (arr[j]<arr[Min])
                Min=j;
        }
        swap(arr[i],arr[Min]);
    }
}
int main()
{
    int arr[]= {5,2,3,7,9,8,1,0,15,13};
    int n=10;
    SelectionSort(arr,n);
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";
}
