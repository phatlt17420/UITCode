#include <iostream>

using namespace std;
void InsertionSort (int arr[],int n)
{
    for (int i=1; i<n; i++)
    {
        int x =arr[i];
        int j=i-1;
        for (j; j>=0; j--)
        {
            if(x<arr[j])
            {
                arr[j+1]=arr[j];
            }
            else break;
        }
        arr[j+1]=x;
    }

}
int main()
{
    int arr[]={5,8,4,1,9,8,6,3,2};
    int n=9;
    InsertionSort(arr,n);
    for (int i=0;i<n;i++)
        cout<<arr[i]<< " ";
    return 0;
}
