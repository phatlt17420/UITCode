/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
sort
stable_sort
partial_sort
partial_sort_copy
sort_heap
set
vector
###End banned keyword*/


#include<map> // ánh xạ
#include<iostream>
using namespace std;

int main()
{
//###INSERT CODE HERE -
    /*
    map <int, string>  a;// khai báo kiểu đầu vào, đầu ra tương ứng

    a[7]="abc"; // tạo ra ánh xạ từ 7 sang "abc";
    // cout đầu ra của 7;
    cout<<a[7];
    */
    int n,x;
    cin>>n;

    map <int, int>  mapping;// khai báo kiểu đầu vào, đầu ra tương ứng // map là cây nhị phân tìm kiếm

    for(int i=0;i<n;i++)
    {
        cin>>x;
        mapping[x]=1;
    }
    for(int i=0; ; i++)
    {
        if(mapping[i]!=1)
        {
            cout<<i;
            break;
        }
    }




//###INSERT CODE HERE -
    return 0;

}

