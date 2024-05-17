#include <iostream>
using namespace std;



int main()
{
    int n;
    cin>>n;
    int arr[100];
    for(int i=0; i<n; i++)
        cin>>arr[i];
    int Min=arr[0], Max=arr[0];
    for(int i =0; i<n; i++)
    {
        if(arr[i]>Max)
            Max=arr[i];
        if(arr[i]<Min)
            Min=arr[i];
    }
    int dem=0;
    for(int i =Min; i<=Max; i++)
    {
        int tonTai=0;
        for (int j=0; j<n; j++)
        {
            if(i==arr[j])
                tonTai=1;
        }
        if(tonTai==0)
            dem++;
    }
    cout<<dem;
    return 0;
}
