#include <iostream>
using namespace std;
class PhanSo
{
private:
    int tuSo;

    int mauSo;

public:
    PhanSo(int tu = 0, int mau = 1) : tuSo(tu), mauSo(mau){};
    friend PhanSo operator+(PhanSo a, PhanSo b)
    {
        PhanSo result;
        result.tuSo = b.tuSo * a.mauSo + b.mauSo * a.tuSo;
        result.mauSo = b.mauSo * a.mauSo;
        return result;
    }

    friend ostream &operator<<(ostream &output, PhanSo a)
    {
        output << a.tuSo << "/" << a.mauSo;
        return output;
    }
    friend istream &operator>>(istream &input, PhanSo &a)
    {
        cout << "Nhap tu so";
        input >> a.tuSo;
        cout << "Nhap mau so";
        input >> a.mauSo;
        return input;
    }
    // PhanSo operator+(PhanSo a)
    // {
    //     PhanSo result;
    //     result.tuSo = this->tuSo * a.mauSo + this->mauSo * a.tuSo;
    //     result.mauSo = this->mauSo * a.mauSo;
    //     return result;
    // }
};
int main()
{
    PhanSo a, b, c;
    cin >> a;
    cin >> b;
    cout << a;
    cout << b;
    c = a + b + 5;
    cout << c;
    system("pause");
    return 0;
}
