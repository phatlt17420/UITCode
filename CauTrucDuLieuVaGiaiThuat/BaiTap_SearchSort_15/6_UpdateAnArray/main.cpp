#include <iostream>

using namespace std;
void Merge (int *arr, int left, int mid, int right)
{
    int i=left;
    int j=mid+1;
    int *c=new int[right-left+1];
    int nc=0;
    while(i<=mid&&j<=right)
    {
        if(arr[i]>arr[j])
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
void add(int *arr, int &n,int x)
{
    n++;
    arr[n-1]=x;
}
void removeMax(int *arr, int &n)
{
    int Max=arr[0];
    for (int i=0; i<n; i++)
    {
        if (Max<arr[i])
            Max=arr[i];
    }
    for (int i=0; i<n; i++)
    {
        while (Max==arr[i])
        {
            for (int j=i; j<n; j++)
            {
                arr[j]=arr[j+1];
            }
            n--;
        }
    }
}
void output(int *arr, int n)
{
    for (int i=0;i<n;i++)
        cout<<arr[i]<<endl;
}
int main()
{
    int *arr=new int [100000];
    int n=0;

    while (1)
    {
        int opt;
        cin>>opt;
        if (opt==-1)
            removeMax(arr,n);
        else if (opt==-2)
        {
            cout<<n<<endl;
            MergeSort(arr,0,n-1);
            break;
        }
        else
            add(arr,n,opt);
    }
    output(arr,n);





    return 0;
}
