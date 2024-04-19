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
    VeMayBay();
    ~VeMayBay();
    void nhapVe();
    void xuatVe();
    float GetGiaVe();
};
VeMayBay::VeMayBay()
{
    this->tenChuyen = "";
    this->ngayBay = "";
    this->giaVe = 0;
}
VeMayBay::~VeMayBay()
{
    cout << "End VeMayBay!";
}
void VeMayBay::nhapVe()
{
    cin.ignore();
    cout << "Nhap Ten Chuyen bay: ";
    fflush(stdin);
    getline(cin, this->tenChuyen);
    cin.ignore();
    cout << "Nhap Ngay Bay: ";
    fflush(stdin);
    getline(cin, this->ngayBay);
    cout << "Nhap Gia Ve: ";
    cin >> this->giaVe;
}
void VeMayBay::xuatVe()
{
    cout << "================================" << endl;
    cout << "Ten chuyen bay: " << this->tenChuyen << endl;
    cout << "Ngay bay: " << this->ngayBay << endl;
    cout << "Gia ve: " << this->giaVe << endl;
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
    Nguoi();
    ~Nguoi();
    void NhapNguoi();
    void XuatNguoi();
};
Nguoi::Nguoi()
{
    this->hoTen = "";
    this->gioiTinh = "";
    this->tuoi = 0;
}
Nguoi::~Nguoi()
{
    cout << "End Nguoi!" << endl;
}
void Nguoi::NhapNguoi()
{
    cin.ignore();
    cout << "Nhap Ho va Ten: ";
    fflush(stdin);
    getline(cin, this->hoTen);
    cin.ignore();
    cout << "Nhap Gioi Tinh: ";
    fflush(stdin);
    getline(cin, this->gioiTinh);
    cout << "Nhap Tuoi: ";
    cin >> this->tuoi;
}
void Nguoi::XuatNguoi()
{
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
    static float tongTien;

public:
    HanhKhach();
    ~HanhKhach();
    void NhapHanhKhach();
    void XuatHanhKhach();
    void TinhTongTien();
};
HanhKhach::HanhKhach()
{
    this->soLuong = 0;
    ve = new VeMayBay[this->soLuong];
    this->tongTien = 0;
}
HanhKhach::~HanhKhach()
{
    this->soLuong = 0;
    delete[] ve;
    this->tongTien = 0;
}
void HanhKhach::NhapHanhKhach()
{
    Nguoi::NhapNguoi();
    cout << "Nhap so luong ve may bay cua Hanh Khach: ";
    cin >> this->soLuong;
    cout << "Nhap lan luot thong tin Ve May Bay của KH: ";
    for (int i = 0; i < this->soLuong; i++)
    {
        cout << "Nhap thong tin ve may bay thu " << i << " : " << endl;
        this->ve->nhapVe();
    }
}
void HanhKhach::XuatHanhKhach()
{
    Nguoi::XuatNguoi();
    cout << "So luong ve may bay: " << this->soLuong << endl;
    cout << "Tong so tien cua Hanh Khach: " << this->tongTien << endl;
}
void HanhKhach::TinhTongTien()
{
    float kq;
    kq = ve->GetGiaVe() * this->soLuong;
    this->tongTien += kq;
}

#pragma endregion
int main()
{
    HanhKhach *p;
    int n;
    cout << "Nhap so luong KH trong danh sach mua ve may bay:";
    cin >> n;
    for (int i = 0; i < n; i++)
    {
    }

    system("pause");
    return 0;
}