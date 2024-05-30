#include <iostream>

using namespace std;
struct Diem
{
    int x;
    int y;
};
void Merge (Diem *arr, int left, int mid, int right)
{
    int i=left;
    int j=mid+1;
    Diem *c=new Diem[right-left+1];
    int nc=0;
    while(i<=mid&&j<=right)
    {
        if(arr[i].x>arr[j].y)
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
void MergeSort (Diem *arr, int left, int right)
{

    if (left<right)
    {
        int mid=(left+right)/2;
        MergeSort(arr,left, mid);
        MergeSort(arr,mid + 1,right);
        Merge(arr,left, mid, right);
    }
}

void output(Diem *arr, int n)
{
    for (int i=0;i<n;i++)
        cout<<arr[i].x<<" "<<arr[i].y<<endl;}
int main()
{
    int n;
    cin>>n;
    Diem *arr=new Diem[n];
    for (int i=0; i<n; i++)
    cin>>arr[i].x>>arr[i].y;
    MergeSort(arr,0,n-1);
    int *a=new int[n];
    int na=0;
    int *b=new int[n];
    int nb=0;
    for (int i=0; i<n; i++)
    {
        if (arr[i].x==arr[i+1].x)

        }

    output(arr,n);

    return 0;
}
