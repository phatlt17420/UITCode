#include <iostream>
using namespace std;
/*và các phép toán cần thiết (+, -, ==, !=, >, >=, <, <=), hàm xuất,
nhập. Lưu ý viết theo dạng hàm: cong, tru, ...; không dùng overloading operator*/
class PhanSo
{
private:
    int tuSo, mauSo;

public:
    void NhapPhanSo();
    void XuatPhanSo();
    void SetPhanSo(PhanSo a);
    PhanSo cong(PhanSo);
};
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
PhanSo PhanSo::cong(PhanSo a)
{
    PhanSo result;
    result.tuSo = this->tuSo * a.mauSo + this->mauSo * a.tuSo;
    result.mauSo = this->mauSo * a.mauSo;
    return result;
}
void PhanSo::SetPhanSo(PhanSo a)
{
    this->tuSo = a.tuSo;
    this->mauSo = a.mauSo;
}
int main()
{
    PhanSo a, b, c;
    a.NhapPhanSo();
    b.NhapPhanSo();
    a.XuatPhanSo();
    b.XuatPhanSo();
    c.SetPhanSo(a.cong(b));
    c.XuatPhanSo();
    system("pause");
    return 0;
}