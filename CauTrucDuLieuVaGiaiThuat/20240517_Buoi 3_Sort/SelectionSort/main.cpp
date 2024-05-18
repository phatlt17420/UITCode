#include <iostream>

using namespace std;
void SelectionSort (int arr[], int n)
{for (int j = 0;j<n-1;j++)
{
    int Min = j;
    for (int i=j+1;i<n;i++)
    {
        if(arr[Min]>arr[i])
            Min=i;

    }
    swap(arr[j], arr[Min]);
}

}
int main()
{
    int arr[]={1,5,2,4,6};
    int n =5;
    SelectionSort(arr,n);
    for(int i=0;i<n;i++)
        cout<<arr[i]<<" ";
    return 0;
}
