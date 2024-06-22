#include <iostream>
using namespace std;
//###INSERT CODE HERE -
void inputMatrix(int arr[50][50],int &n,int &m)
{
    cin>>n>>m;
    int x;
    for(int i=0; i<n; i++)
        for(int j=0; j<m; j++)
        {
            cin>>x;
            arr[i][j]=x;
        }

}
void outputMatrix(int arr[50][50],int n,int m)
{

    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
            cout<<arr[i][j]<<" ";
        cout<<endl;
    }
}
void uniqueElements(int arr[50][50],int n,int m)
{
    //B1: tìm max;
    int MaxArr=arr[0][0];
    for(int i=0; i<n; i++)
        for(int j=0; j<m; j++)
            if(MaxArr<arr[i][j])
                MaxArr=arr[i][j];
    // B2: tạo mảng chứa max +1 phần tử
    int *brr= new int[MaxArr+1];
    // gán phần tử:
    for(int i=0; i<MaxArr+1; i++)
        brr[i]=0;
    //B3: đánh dấu số lần xuất hiện
    for(int i=0; i<n; i++)
        for(int j=0; j<m; j++)
            brr[arr[i][j]]++;

    int kt=0;
    for(int i=0; i<MaxArr+1; i++)
        if(brr[i]==1)
        {
            kt=1;
            break;
        }
    if(kt==1)
    {
        cout<<"Unique elements in the matrix:"<<endl;
        for(int i=0; i<MaxArr+1; i++)
            if(brr[i]==1)
                cout<<i<<" ";
    }
    else
        cout<<"No unique element in the matrix";
}

//###INSERT CODE HERE -
int main()
{
    int m,n,a[50][50];
    inputMatrix(a,n,m);
    cout<<"Matrix:\n";
    outputMatrix(a,n,m);
    uniqueElements(a,n,m);
    return 0;
}



