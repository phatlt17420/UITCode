#include <iostream>

using namespace std;
void out(int a[],int n)
{
    for (int i = 0; i<n; i++)
        cout<<a[i]<<" ";
}
void MergeSort (int a[], int na,int b[], int nb)
{
    int i=0;
    int j=0;
    int *c=new int [na+nb];
    int nc=0;
    while (i<na &&j<nb)
    {
        if (a[i]<b[j])
        {
            c[nc]=a[i];
            nc++;
            i++;
        }
        else
        {
            c[nc]=b[j];
            nc++;
            j++;
        }
    }
    while (i<na)
    {
        c[nc]=a[i];
        nc++;
    }
    while (j<nb)
    {
        c[nc]=b[j];
        nc++;
    }
//
//    out(c,nc);
}

int main()
{
    int a[]= {3,5,6,7,8,3,4};
    int na=7;
    int b[]= {6,8,2,5,6};
    int nb=5;

    MergeSort(a,na,b,nb);



    return 0;
}
