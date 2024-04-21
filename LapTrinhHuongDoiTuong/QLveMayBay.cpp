#include <bits/stdc++.h>
using namespace std;
class VeMayBay
{
private:
    string tenChuyen;
    string ngayBay;
    int giaVe;

public:
    VeMayBay();
    ~VeMayBay();
    void NhapVeMayBay();
    void XuatVeMayBay();
    void GetGiaVe();
};
VeMayBay::VeMayBay()
{
    this->tenChuyen = "";
    this->ngayBay = "";
    this->giaVe = 0;
}
VeMayBay::~VeMayBay()
{
    cout << "End VeMayBay!" << endl;
}
void VeMayBay::NhapVeMayBay()
{
    cout << "Nhap tenChuyen: ";
    cin >> this->tenChuyen;
}

int main()
{

    system("pause");
    return 0;
}
