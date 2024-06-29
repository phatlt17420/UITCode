#include <iostream>
#include <math.h>

using namespace std;

//###INSERT CODE HERE -
void inputArray(int *arr,int &n)
{
    int x;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>x;
        arr[i]=x;
    }
}
void printArray(int *arr,int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
void removeDups(int *arr,int n)
{
    //B1: tìm max:
    int Max=arr[0];
    for(int i=0; i<n;i++)
    {
        if(Max<arr[i])
            Max=arr[i];
    }
    //B2: tạo mảng brr có Max +1 phần tử
    int * brr= new int [Max +1];
    //B3: gán tất cả các phần tử bằng 0
    for(int i=0;i<Max+1;i++)
        brr[i]=0;
// B4: duyệt mảng arr, gán giá trị 1 vào b tương ứng
    for(int i=0;i<n;i++)
    {
        brr[arr[i]]=1;
    }
    //B5: xuất chỉ số của phần tử
    for(int i=0;i<Max+1;i++)
        if(brr[i]==1)
        cout<<i<<" ";
}


//###INSERT CODE HERE -
int main()
{
    int a[100],n;
    inputArray(a,n);

    // In mang ban dau
    printArray(a, n);

    /* Goi ham thuc hien xuat mang nhung chi xuat nhung gia tri xuat hien lan dau tien,
    *  khong xuat nhung gia tri bi lap lai/bi trung
    */


    cout << "After removing the duplicate elements:" << endl;

    removeDups(a, n);

    return 0;
}
