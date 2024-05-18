#include <iostream>

using namespace std;
void out(int a[], int n)
{
    for(int i =0; i<n; i++)
        cout<<a[i]<<" ";

}
void insertionSort (int a[],int n)
{
    for (int i = 1; i<n; i++)
    {
        int tmp=a[i];
        int j=i-1;
        for (j ; j>=0; j--)
        {
            if (tmp<a[j])
            {
                a[j+1]=a[j];
                out(a,n);
                cout<<endl;
            }
            else
                break;
        }
        a[j+1]=tmp;
        out(a,n);
        cout<<endl;
    }
}



int main()
{
    int n;
    cin>>n;
    int *a=new int[n];
    for (int i=0;i<n;i++)
        cin>>a[i];

//    int a[]= {83530,64425,48217,20995};
//    int n=4;

    insertionSort(a,n);


    return 0;
}
