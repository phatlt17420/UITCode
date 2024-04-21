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
    int GetGiaVe();
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
    cin.ignore();
    cout << "Nhap tenChuyen: ";
    getline(cin, this->tenChuyen);
    cout << "Nhap ngayBay: ";
    getline(cin, this->ngayBay);
    cout << "Nhap giaVe: ";
    cin >> this->giaVe;
}
void VeMayBay::XuatVeMayBay()
{
    cout << "=============================================================" << endl;
    cout << "Ten Chuyen: " << this->tenChuyen << endl;
    cout << "Ngay bay: " << this->ngayBay << endl;
    cout << "Gia ve: " << this->giaVe << endl;
}
int VeMayBay::GetGiaVe()
{
    return this->giaVe;
}
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
    cout << "Nhap ten Nguoi: ";
    getline(cin, this->hoTen);
    cout << "Nhap gioi tinh: ";
    getline(cin, this->gioiTinh);
    cout << "Nhap tuoi: ";
    cin >> this->tuoi;
}
void Nguoi::XuatNguoi()
{
    cout << "=========================================" << endl;
    cout << "Ho va Ten: " << this->hoTen << endl;
    cout << "Gioi tinh: " << this->gioiTinh << endl;
    cout << "Tuoi: " << this->tuoi << endl;
}
class HanhKhach : public Nguoi
{
private:
    VeMayBay ve[1000];
    int soLuong;
    int tongTien;

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
    ve[this->soLuong];
    this->tongTien = 0;
}
HanhKhach::~HanhKhach()
{
    this->soLuong = 0;
    // delete[] ve;
    this->tongTien = 0;
}
void HanhKhach::NhapHanhKhach()
{
    Nguoi::NhapNguoi();
    cout << "Nhap So Luong ve may bay: ";
    cin >> this->soLuong;
    cout << "=Nhap chi tiet ve may bay=" << endl;
    for (int i = 0; i < this->soLuong; i++)
    {
        ve[i].NhapVeMayBay();
    }
}
void HanhKhach::XuatHanhKhach()
{
    Nguoi::XuatNguoi();
    cout << "So Luong ve da mua: " << this->soLuong << endl;
    cout << "Tong so Tien: " << this->tongTien << endl;
}
void HanhKhach::TinhTongTien()
{
    int result;
    for (int i = 0; i < this->soLuong; i++)
    {
        result += ve[i].GetGiaVe();
    }
    this->tongTien = result;
}
class QuanLyHanhKhach
{
private:
    HanhKhach *p;
    int soLuongHK;

public:
    void Nhap();
    void tinhTienMoiHK();
    void Xuat();
    void Menu();
};
void QuanLyHanhKhach::Nhap()
{
    cout << "Nhap so luong Hanh Khach can quan ly: ";
    cin >> this->soLuongHK;
    p = new HanhKhach[this->soLuongHK];
    for (int i = 0; i < this->soLuongHK; i++)
    {
        (p + i)->NhapHanhKhach();
    }
}
void QuanLyHanhKhach::tinhTienMoiHK()
{
    for (int i = 0; i < this->soLuongHK; i++)
    {
        (p + i)->TinhTongTien();
    }
}
void QuanLyHanhKhach::Xuat()
{
    for (int i = 0; i < this->soLuongHK; i++)
    {
        (p + i)->XuatHanhKhach();
    }
}
void QuanLyHanhKhach::Menu()
{
    int selection;
    do
    {
        system("pause");
        system("cls");
        cout << "1. Nhap Hanh Khach" << endl;
        cout << "2. Tinh tien moi Hanh Khach: " << endl;
        cout << "3. Xuat danh sach Hanh Khach" << endl;
        cout << "4. Thoat chuong trinh" << endl;
        cout << "Nhap lua chon cua ban: ";
        cin >> selection;
        switch (selection)
        {
        case 1:
            this->Nhap();
            break;
        case 2:
            this->tinhTienMoiHK();
            break;
        case 3:
            this->Xuat();
            break;
        case 4:
            exit(1);
        }
    } while (selection > 0 || selection < 4);
}
int main()
{
    QuanLyHanhKhach f;
    f.Menu();
    system("pause");
    return 0;
}
