#include <iostream>
#include <iomanip>
using namespace std;

// template <class T>
// float TinhTong(float a, float b)
// {
//     return a + b;
// }
template <class T> // ví dụ 1 class
T TinhTong(T a, T b)
{
    return a + b;
}
template <class Q, class K> // ví dụ 2 class
Q TinhTong(Q a, K b)
{
    return a + b;
}

// ứng dụng vào class:
template <class A>
class Sort
{
    SinhVien array[100];
    int n;

public:
    void Nhap()
    {
        cout << "Nahp so luong phan tu: ";
        cin >> this->n;
        for (int i = 0; i < this->n; i++)
        {
            cout << "a[" << i << "]: ";
            cin >> array[i];
        }
    }
    void Xuat()
    {
        for (int i = 0; i < this->n; i++)
        {

            cout << setw(10) << array[i];
        }
        cout << endl;
    }
    void IncrementSort()
    {
        A tmp;
        for (int i = 0; i < n - 1; i++)
        {
            if (array[i] > array[i + 1])
            {
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }
    }
};
class SinhVien
{
};
int main()
{
    // ứng dùng sắp xếp trong class SinhVien
    Sort<SinhVien> s;
    // ứng dụng
    Sort<float> s;
    s.Nhap();
    s.Xuat();
    s.IncrementSort();
    s.Xuat();

    // float c;
    // c = TinhTong<float>(10.8, 20);
    // cout << c << endl;

    // c = TinhTong<int, float>(12.5, 8);
    // cout << "Ket qua la: " << c << endl;
    system("pause");
    return 0;
}