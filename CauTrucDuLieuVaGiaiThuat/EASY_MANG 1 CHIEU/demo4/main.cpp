#include <iostream>
#include <math.h>
using namespace std;

int timMiddle (int arr[100000], int n)
{

    int i1,i2;
    i1=(n-1)/2;
    i2=((n-1)/2)+1;

    int mid=arr[i1]+arr[i2];
    return mid;
}

int main()
{
    int n;
    cin>>n;
    int arr[100000];
    for (int i=0; i<n; i++)
        cin>>arr[i];

    if(n%2!=0)
        for(int i=0; i<n; i++)
            cout<<arr[i]<<" ";
    else
    {
        int mid =timMiddle(arr,n);
        arr[(n-1)/2]=mid;

        for (int i=((n-1)/2)+1; i<n; i++)
        {

            arr[i]=arr[i+1];

        }

        for(int i=0; i<n-1; i++)
            cout<<arr[i]<<" ";
    }
    return 0;
}
