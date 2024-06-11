#include <iostream>
#include <string.h>
using namespace std;
bool timPhanTu (string *arr, int n, string x)
{
    for(int i=0; i<n; i++)
        if(arr[i]==x)
            return 1;
    return 0;
}
int main()
{
    int n;
    cin>>n;
    string *arr=new string[n];
    cin.ignore();
    for (int i =0; i<n; i++)
        getline(cin,arr[i]);
string kq[n];
kq[0]=arr[0];
int k=1;
for (int i =0;i<n;i++)


if() timPhanTu(kq,k,arr[i]);


    return 0;
}
