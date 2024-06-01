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
int main()
{
    int n;
    cin>>n;
    if (n==0)
        cout<<0;
    if (n!=0)
    {
        int *arr=new int[n];
        for (int i =0; i<n; i++)
        {
            cin>>arr[i];
        }
        QuickSort(arr,0,n-1);
        if (arr[0]!=0)
            cout<<0;
        else


        {
            int MEX=arr[0];
            for (int i =0; i<n; i++)
            {
                if(arr[i]==MEX)
                    MEX++;
            }
            cout<<MEX;
        }


    }
    return 0;
}


//
//    for (int i =0; i<n; i++)
//    {
//        if (arr[i]==arr[i+1])
//            continue;
//        if((arr[i] +1 )!= arr[i+1])
//        {
//            cout<<arr[i]+1;
//            break;
//        }
//        if(i==n-1)
//            cout<<arr[n-1] +1;
//    }



