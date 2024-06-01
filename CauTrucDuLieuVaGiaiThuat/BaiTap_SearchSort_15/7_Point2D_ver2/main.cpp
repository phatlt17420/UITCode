#include <iostream>

using namespace std;
struct Diem
{
    int x;
    int y;
};
void QuickSortUp(Diem *arr, int left, int right)
{
    int i= left;
    int j=right;

    int mid =arr[(left+right)/2].x;
    while (i<=j)
    {
        while (arr[i].x<mid)
            i++;
        while (arr[j].x>mid)
            j--;
        if (i<=j)
        {
            swap(arr[i],arr[j]);
            i++;
            j--;
        }
    }
if (left<j)
    QuickSortUp(arr,left,j);
if (right>i)
    QuickSortUp(arr,i,right);

}
void QuickSortDown(Diem *arr, int left, int right)
{
    int i= left;
    int j=right;
    int mid =arr[(left+right)/2].y;
    while (i<=j)
    {
        while (arr[i].y>mid)
            i++;
        while (arr[j].y<mid)
            j--;
        if (i<=j)
        {
            swap(arr[i],arr[j]);
            i++;
            j--;
        }
    }
if (left<j)
    QuickSortDown(arr,left,j);
if (right>i)
    QuickSortDown(arr,i,right);

}

void output(Diem *arr, int n)
{
    for (int i=0;i<n;i++)
        cout<<arr[i].x<<" "<<arr[i].y<<endl;}
int main()
{

    int n;
    cin>>n;
    Diem *arr=new Diem[n];
    for (int i=0; i<n; i++)
    cin>>arr[i].x>>arr[i].y;
    QuickSortUp(arr,0,n-1);

    int k=0;
    for (int i = 1; i<n; i++)
    {
        int tmp;



    }
//
//    for (int i=0; i<n; i++)
//    {
//        int left=i;
//        int right;
//        if (arr[i].x==arr[i+1].x)
//        {
//
//            for (int j=left; j<n-1; j++)
//            {
//
//
//                if((arr[j].x!=arr[j+1].x))
//                {
//                    right=j;
//                    break;
//                }
//            }
//        }
//        QuickSortDown(arr,left,right);
//    }
//
//    output(arr,n);

    return 0;
}
