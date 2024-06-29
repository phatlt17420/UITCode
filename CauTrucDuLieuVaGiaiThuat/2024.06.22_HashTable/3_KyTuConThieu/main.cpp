#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    char *arr=new char[n];
    char x;
    for(int i=0; i<n; i++)
    {
        cin>>x;
        arr[i]=x;
    }
    int *brr=new int[256];
    for(int i=0; i<256; i++)
        brr[i]=0;
    for(int i=0; i<n; i++)
        brr[(int) arr[i]]=1;
//    for(int i=0; i<256; i++)
//        cout<<i<<" "<<brr[i]<<endl;

    int *crr=new int [27];
    for(int i=1; i<27; i++)
        crr[i]=0;
    for(int i=97; i<123; i++)
    {
        if(brr[i]==1)
            crr[i-97+1]=1;
    }
    for(int i=65; i<91; i++)
    {
        if(brr[i]==1)
            crr[i-65+1]=1;
    }
//    for(int i=1; i<27; i++)
//        cout<<crr[i]<<" ";


    int dem=0;
    for(int i=1; i<27; i++)
        if(crr[i]==1)
            dem++;
    cout<<26-dem;
    return 0;
}
