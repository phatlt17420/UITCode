

#include <iostream>
using namespace std;

void inputArray(int *&a,int n)
{
    for (int i=0; i<n; i++)
        cin>>a[i];
}
void outputArray(int *&a,int n)
{
    for (int i=0; i<n; i++)
        cout<<a[i]<<" ";
}
int binarySearch (int *&a, int n,   int left, int right, int x)
{
    if (left<=right)
    {
        int mid=(left+right)/2;
        if (a[mid]==x)
            return mid;
        if (x<a[mid])
            return binarySearch(a,n,left,mid-1,x);
        return binarySearch(a,n,mid+1,right,x);
    }
    return -1;
}
void Merge(int *a,int left, int mid,int right)
{
    int i=left;
    int j=mid+1;
    int *c=new int[right - left +1];
    int nc=0;
    while (i<=mid&&j<=right)
    {
        if(a[i]<a[j])
        {
            c[nc]=a[i];
            nc++;
            i++;
        }
        else
        {
            c[nc]=a[j];
            nc++;
            j++;
        }
    }
    while (i<=mid)
    {
        c[nc]=a[i];
        nc++;
        i++;
    }
    while (j<=right)
    {
        c[nc]=a[j];
        nc++;
        j++;
    }
    for(int i=0; i<nc; i++)
        a[i+left]=c[i];
        delete[] c;


}
void MergeSort(int *a,int left, int right)
{
    if(left<right)
    {
        int mid=(left+right)/2;
        MergeSort(a,left,mid);
        MergeSort(a,mid+1,right);
        Merge(a,left,mid,right);
    }
}


int main()
{
    int n; cin>>n;
    int *a = new int[n];
    inputArray(a,n);
    MergeSort(a,0,n-1);
    cout<<"Sorted Array: ";
    outputArray(a,n);// liet ke cac phan tu cach nhau boi 1 khoang cach

    cout<< "\nFind an element: ";
    int x; cin>>x;
    cout<<x<<endl;
    int result = binarySearch(a,n,0,n-1,x);
    if (result ==-1) cout<<x<<" is not found";
    else cout<<x<<" is found at the position " << result;

	return 0;
}

