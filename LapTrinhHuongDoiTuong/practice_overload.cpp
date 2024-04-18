#include <iostream>
using namespace std;
/*và các phép toán cần thiết (+, -, ==, !=, >, >=, <, <=), hàm xuất,
nhập. Lưu ý viết theo dạng hàm: cong, tru, ...; không dùng overloading operator*/

class PhanSo
{
private:
    int tuSo, mauSo;

public:
    PhanSo(int t, int m);
    void NhapPhanSo();
    void XuatPhanSo();
    PhanSo operator+(PhanSo);
    PhanSo operator-(PhanSo);
    bool operator==(PhanSo);
    bool operator!=(PhanSo);
    bool operator>(PhanSo);
    bool operator<(PhanSo);
    bool operator<=(PhanSo);
    bool operator>=(PhanSo);
    // Xây dựng nhập, xuất:
    friend ostream &operator<<(ostream &out, PhanSo a);
    friend istream &operator>>(istream &in, PhanSo &a);
};
PhanSo::PhanSo(int t = 0, int m = 1)
{
    this->tuSo = t;
    this->mauSo = m;
}
void PhanSo::NhapPhanSo()
{
    cout << "Nhap Tu So: ";
    cin >> this->tuSo;
    cout << "Nhap Mau So: ";
    cin >> this->mauSo;
}
void PhanSo::XuatPhanSo()
{
    cout << this->tuSo << "/" << this->mauSo << endl;
}
#pragma region Đa năng hoá toán tử
// Đa năng hoá toán tử
PhanSo PhanSo::operator+(PhanSo a)
{
    PhanSo result;
    result.tuSo = this->tuSo * a.mauSo + this->mauSo * a.tuSo;
    result.mauSo = this->mauSo * a.mauSo;
    return result;
}
PhanSo PhanSo::operator-(PhanSo a)
{
    PhanSo result;
    result.tuSo = this->tuSo * a.mauSo - this->mauSo * a.tuSo;
    result.mauSo = this->mauSo * a.mauSo;
    return result;
}
bool PhanSo::operator==(PhanSo a)
{
    return ((this->tuSo / (float)this->mauSo) == (a.tuSo / (float)a.mauSo));
}
bool PhanSo::operator!=(PhanSo a)
{
    return ((this->tuSo / (float)this->mauSo) != (a.tuSo / (float)a.mauSo));
}
bool PhanSo::operator<(PhanSo a)
{
    return ((this->tuSo / (float)this->mauSo) < (a.tuSo / (float)a.mauSo));
}
bool PhanSo::operator>(PhanSo a)
{
    return ((this->tuSo / (float)this->mauSo) > (a.tuSo / (float)a.mauSo));
}
bool PhanSo::operator<=(PhanSo a)
{
    return (this->tuSo / (float)this->mauSo) <= (a.tuSo / (float)a.mauSo);
}
bool PhanSo::operator>=(PhanSo a)
{
    return (this->tuSo / (float)this->mauSo) >= (a.tuSo / (float)a.mauSo);
}
#pragma endregion
ostream &operator<<(ostream &out, PhanSo &a)
{
    out << a.tuSo << "/" << a.mauSo << endl;
    return out;
}
istream &operator>>(istream &in, PhanSo &a)
{
    cout << "Nhap Tu So: ";
    cin >> a.tuSo;
    cout << "Nhap Mau So: ";
    cin >> a.mauSo;

    return in;
}
int main()
{
    PhanSo a(1, 3), b(1, 2), c;
    cin >> c;

    cout << c;

    // if (a >= b)
    //     cout << "PhanSo a <= PhanSo b";
    // else
    //     cout << "PhanSo a > PhanSo b";
    // // c.XuatPhanSo();
    // cout << endl;

    system("pause");
    return 0;
}