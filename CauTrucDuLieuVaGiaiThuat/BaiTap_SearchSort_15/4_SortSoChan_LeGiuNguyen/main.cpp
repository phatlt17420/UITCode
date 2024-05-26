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

void sort(int *arr, int n)
{
    int na=0;
    int nb=0;
    int *a=new int[n];
    int *b=new int[n];
    for(int i=0; i<n; i++)
    {
        if(arr[i]%2==0)
        {
            a[na]=arr[i];
            na++;
            b[nb]=i;
            nb++;
        }
    }
    QuickSort(a,0,na-1);
    for(int i=0;i<nb;i++)
    {
        int k = b[i];
        arr[k]=a[i];
    }


}

int main()
{
    int *a, n;
    cin >> n;
    a = new int [n];

    for(int i = 0; i < n; i ++)
    {
        cin >> a[i];
    }

    sort(a, n);

    for(int i = 0; i < n; i ++)
    {
        cout << a[i] << " ";
    }
}
