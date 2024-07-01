#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
void print_vector(vector <int> arr)
{
    for(int i:arr)
        cout<<i<<" ";
        cout<<endl;
}
int main()
{
    vector <int> arr;
    arr.push_back(10); // thêm phần tử vào vector
    arr.push_back(20);
    arr.push_back(30);
    // Các cách duyệt phần tử trong vector
////CÁCH 1:
//    for(int i=0; i<arr.size(); i++)
//        cout<<arr[i]<<" ";

////CÁCH 2:
//    for(auto i=arr.begin(); i!=arr.end(); i++)
//        cout<<*i<<" ";


////CÁCH 3:
//    for(int i:arr)
//        cout<<i<<" ";

    // vector bool;
    //    vector<bool> bools(100,false); // khai báo vector có giá trị boolean
//    bools[1]=true;
//    for(bool i:bools)
//        cout<<i<<" ";
    //  print_vector(arr);
// lệnh assign
//    arr.assign(5,10); // gán 2 giá trị 10 vào vector
//    print_vector(arr);
//    // lệnh pop_back();
//    arr.pop_back();
//    print_vector(arr);
//// câu lênh insert
//    auto i=arr.begin();
//    arr.insert(i+2,5); // chèn giá trị 5 trước vị trí số 2;// có thể khai báo trực tiếp i= arr.begin();
//    print_vector(arr);
//// lệnh erase
//    arr.erase(arr.begin()+1); // xoá phần tử tại vị trí thứ 1;
//    print_vector(arr);
//// lệnh swap
//    vector<int> another_vector={1,2,3,4,5};
//    arr.swap(another_vector);
//    print_vector(arr);
//    print_vector(another_vector);
// clear
//arr.clear();
//print_vector(arr);
cout<<arr. size()<<endl;
cout<<arr.capacity()<<endl;

    return 0;
}
