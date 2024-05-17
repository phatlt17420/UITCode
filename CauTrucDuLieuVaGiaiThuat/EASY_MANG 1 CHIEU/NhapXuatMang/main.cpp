#include <iostream>

using namespace std;

int main()
{
    int *arr,n;
cin>>n;
arr= new int [n];
for (int i=0;i<n;i++){
    cin>>arr[i];
}
int Min=arr[0];
int soLan=0;
for (int i=0; i<n;i++){
    if(Min>arr[i])
    {
        Min=arr[i];

    }
}
for (int i=0; i<n;i++){
    if(Min==arr[i])
    {
        soLan++;

    }
}

cout<<Min<<" "<<soLan;

    return 0;
}
