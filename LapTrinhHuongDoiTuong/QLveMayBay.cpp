#include <iostream>
using namespace std;
#pragma region AirlineTicket
class VeMayBay
{
private:
    string tenChuyen;
    string ngayBay;
    float giaVe;

public:
    VeMayBay()
    {
        this->tenChuyen = "";
        this->ngayBay = "";
        this->giaVe = 0;
    };
    ~VeMayBay(){};
    void nhapVe();
    void xuatVe();
    float GetGiaVe();
};
void VeMayBay::nhapVe()
{
    cout << "Nhap ten chuyen bay: ";
    cin >> this->tenChuyen;
    cout << "Nhap ngay bay: ";
    cin >> this->ngayBay;
    cout << "Nhap Gia Ve: ";
    cin >> this->giaVe;
}
void VeMayBay::xuatVe()
{
    cout << "==================================================" << endl;
    cout << "Ten Chuyen Bay: " << this->tenChuyen << endl;
    cout << "Ngay Bay: " << this->ngayBay << endl;
    cout << "Gia Ve: " << this->giaVe << endl;
}
float VeMayBay::GetGiaVe()
{
    return this->giaVe;
}

#pragma endregion
#pragma region Person
class Nguoi
{
private:
    string hoTen;
    string gioiTinh;
    int tuoi;

public:
    Nguoi()
    {
        this->hoTen = "";
        this->gioiTinh = "";
        this->tuoi = 0;
    };
    ~Nguoi();
    void NhapNguoi();
    void XuatNguoi();
};
void Nguoi::NhapNguoi()
{
    cout << "Nhap Ho va Ten: ";
    cin >> this->hoTen;
    cout << "Nhap Gioi Tinh: ";
    cin >> this->gioiTinh;
    cout << "Nhap Tuoi: ";
    cin >> this->tuoi;
}
void Nguoi::XuatNguoi()
{
    cout << "==================================================" << endl;
    cout << "Ho va Ten: " << this->hoTen << endl;
    cout << "Gioi tinh: " << this->gioiTinh << endl;
    cout << "Tuoi: " << this->tuoi << endl;
}
#pragma endregion

#pragma region Passenger
class HanhKhach : public Nguoi
{
private:
    VeMayBay *ve;
    int soLuong;

public:
    HanhKhach();
    ~HanhKhach();
    void NhapHanhKhach();
    void XuatHanhKhach();
    float TongTien();
};
HanhKhach::HanhKhach()
{
    this->soLuong = 0;
    this->ve = new VeMayBay[soLuong];
}

#pragma endregion

int main()
{

    system("pause");
    return 0;
}