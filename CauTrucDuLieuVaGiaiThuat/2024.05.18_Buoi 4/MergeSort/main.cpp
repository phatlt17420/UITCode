#include <iostream>

using namespace std;

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
//    c = NULL;

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
    int a[]= {8,2,2,5,12,4,17,0,7};
    int na=9;
    for(int i = 0; i< na;i++)
    cout<<a[i]<<" ";
    cout<<endl;
MergeSort(a,0,na-1);
for(int i = 0; i< na;i++)
    cout<<a[i]<<" ";
    return 0;
}
