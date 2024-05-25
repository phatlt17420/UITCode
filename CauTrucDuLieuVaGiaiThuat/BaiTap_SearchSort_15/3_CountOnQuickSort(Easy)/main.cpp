#include <iostream>
/*MÔ TẢ BÀI TOÁN:
Sắp xếp mảng số nguyên theo thứ tự GIẢM DẦN và đếm số lần hoán vị (đổi chỗ 2 số) trong qúa trình sắp xếp mảng dùng thuật toán QuickSort. Yêu cầu chọn phần tử chính giữa làm trục.
INPUT:
Dòng đầu tiên chứa số nguyên dương n (n < 1.000.000) là độ dài mảng cần sắp xếp
Dòng tiếp theo chứa n số nguyên cách nhau bởi khoảng trắng (giá trị không quá 2 tỷ), là các giá trị trong mảng
OUTPUT:
- Xuất theo format trong ví dụ
- Xuất ra trên một dòng n số nguyên trong mảng đã sắp xếp theo thứ tự giảm dần
- Cho biết số lần thực hiện thao tác hoán vị (đổi chỗ) giữa 2 số trong quá trình sắp xếp.
*/
using namespace std;
void QuickSort (int *arr, int left, int right,int &k)
{
    int mid=arr[(left+right)/2];
    int i=left;
    int j=right;

    while (i<=j)
    {
        while (mid<arr[i])
            i++;
        while (mid>arr[j])
            j--;
        if(i<=j)
        {
            swap(arr[i],arr[j]);
            k++;
            i++;
            j--;
        }
    }
    if (i<right)
        QuickSort(arr,i,right,k);
    if(j>left)
        QuickSort(arr,left,j,k);
}
int main()
{
    int n;
    cin>>n;
    int *arr=new int[n];
    for(int i=0; i<n; i++)
        cin>>arr[i];
    int k=0;
    QuickSort(arr,0,n-1,k);
    cout<<"Sorted Array: ";
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";
        cout<<endl;
        cout<<"Number of times to swap 2 numbers: "<<k;
    return 0;
}
