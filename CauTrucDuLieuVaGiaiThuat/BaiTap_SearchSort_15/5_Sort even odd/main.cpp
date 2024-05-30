#include <iostream>
using namespace std;
void output (int *arr, int n)
{
    for (int i=0;i<n;i++)
        cout<<arr[i]<<endl;
}
void Merge (int *arr, int left, int mid, int right)
{
    int i=left;
    int j=mid+1;
    int *c=new int[right-left+1];
    int nc=0;
    while(i<=mid&&j<=right)
    {
        if(arr[i]<arr[j])
        {
            c[nc]=arr[i];
            i++;
            nc++;
        }
        else
        {
            c[nc]=arr[j];
            j++;
            nc++;
        }
    }
    while (i<=mid)
    {
        c[nc]=arr[i];
        i++;
        nc++;
    }
    while (j<=right)
    {
        c[nc]=arr[j];
        j++;
        nc++;
    }
    for (int i=0; i<nc; i++)
        arr[left+i]=c[i];
}
void MergeSort (int *arr, int left, int right)
{

    if (left<right)
    {
        int mid=(left+right)/2;
        MergeSort(arr,left, mid);
        MergeSort(arr,mid + 1,right);
        Merge(arr,left, mid, right);
    }
}

int main()
{
    int n;
    cin>>n;
    int *arrChan=new int[n];
    int nChan=0;
    int *arrLe=new int[n];
    int nLe=0;
    for (int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        if(x%2==0)
        {
            arrChan[nChan]=x;
            nChan++;
        }
        else
        {
            arrLe[nLe]=x;
            nLe++;
        }
    }



    MergeSort(arrChan,0,nChan-1);
    MergeSort(arrLe,0,nLe-1);
    int *arr=new int[nChan+nLe];
    int nkq=0;
    for (int i=0; i<nChan; i++)
    {
        arr[nkq]=arrChan[i];
        nkq++;
    }
    for (int i=0; i<nLe; i++)
    {
        arr[nkq]=arrLe[i];
        nkq++;
    }
    output(arr,nkq);
    return 0;
}
