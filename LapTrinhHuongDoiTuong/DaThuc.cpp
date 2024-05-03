/*Xây dựng lớp Đa thức bậc n với các toán tử >>, <<, + (3đ)*/

#include <iostream>
using namespace std;
class DaThuc
{
private:
    int bacDaThuc;
    float *heSo;

public:
    friend istream &operator>>(istream &input, DaThuc &a)
    {
        cout << "Nhap bac cua da thuc: ";
        input >> a.bacDaThuc;
        a.heSo = new float[a.bacDaThuc + 1];
        cout << "Nhap lan luot cac he so tuong ung voi bac cua da thuc:\n ";
        for (int i = 0; i < a.bacDaThuc + 1; i++)
        {
            cout << "He so tuong ung voi bac: " << i << "la: ";
            input >> (a.heSo[i]);
        }
        return input;
    }
    friend ostream &operator<<(ostream &output, DaThuc a)
    {
        for (int i = 0; i < a.bacDaThuc + 1; i++)
        {
            cout << a.heSo[i] << "X^" << i << "+";
        }
        return output;
    }
};

int main()
{
    DaThuc a;
    cin >> a;
    cout << a;
    system("pause");
    return 0;
}