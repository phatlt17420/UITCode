#include <iostream>
using namespace std;
void QuickSort (int *arr, int left, int right)
{
    int mid =arr[(left+right)/2];
    int i=left;
    int j=right;
    while (i<=j)
    {
        while (arr[i]<mid)
            i++;
        while (arr[j]>mid)
            j--;
        if (i<=j)
        {
            swap(arr[i],arr[j]);
            i++;
            j--;
        }
    }
    if(i<right)
        QuickSort(arr,i,right);
    if(j>left)
        QuickSort(arr,left,j);

}
int MEX (int *arr, int n)
{
    if (n==0)
        return 0;
    else
    {
        int MEX=arr[0];
            for (int i =0; i<n; i++)
            {
                if(arr[i]==MEX)
                    MEX++;
            }
        return MEX;
    }
}
int main()
{
    int n;
    cin>>n;

    int *arr=new int[n];
    for (int i =0; i<n; i++)
        cin>>arr[i];
    QuickSort(arr,0,n-1);
    cout<<MEX(arr,n);



    return 0;
}
