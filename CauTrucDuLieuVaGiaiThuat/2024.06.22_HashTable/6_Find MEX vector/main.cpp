
#include<vector>
#include<iostream>
using namespace std;

int main()
{

    //###INSERT CODE HERE -
    int n,x;
    cin>>n;
    vector <int> arr(n,-1);
    for(int i=0; i<n; i++)
    {
        cin>>x;
        arr[i]=x;
    }
    int Max=arr[0];
    for(int i=0; i<n; i++)
        if(arr[i]>Max)
            Max=arr[i];
vector

//###INSERT CODE HERE -
    return 0;

}



