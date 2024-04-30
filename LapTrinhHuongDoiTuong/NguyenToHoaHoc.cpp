#include <iostream>
using namespace std;
class ChatHoaHoc
{
private:
    string tenNguyenTo;
    int hoaTri;
    int soLopDienTu;
    int tongSoDienTu;
    string hopChat;

public:
    void Nhap();
    void Xuat();
};
void ChatHoaHoc::Nhap()
{
    cout << "Nhap Ten Nguyen To: ";
    cin.ignore();
    getline(cin, this->tenNguyenTo);
    cout << "Nhap Hoa Tri: ";
    cin >> this->hoaTri;
    cout << "Nhap So Lop Dien Tu: ";
    cin >> this->soLopDienTu;
    cout << "Nhap Tong So Dien Tu: ";
    cin >> this->tongSoDienTu;
    cout << "Nhap ten Hop Chat: ";
    cin.ignore();
    getline(cin, this->hopChat);
}
void ChatHoaHoc::Xuat()
{
    cout << "Ten Nguyen To: " << this->tenNguyenTo << endl;
    cout << "Hoa Tri: " << this->hoaTri << endl;
    cout << "So lop dien tu: " << this->soLopDienTu << endl;
    cout << "Tong so dien tu: " << this->tongSoDienTu << endl;
    cout << "Hop Chat: " << this->hopChat << endl;
}
class BangTuanHoan
{
private:
    ChatHoaHoc *p;
    int soLuong;

public:
    void NhapDanhSach();
    void XuatDanhSach();
    // void PhanUng();
};
void BangTuanHoan::NhapDanhSach()
{
    cout << "Nhap so luong chat can nhap: ";
    cin >> this->soLuong;
    p = new ChatHoaHoc[this->soLuong];
    for (int i = 0; i < this->soLuong; i++)
    {
        (p + i)->Nhap();
    }
}
void BangTuanHoan::XuatDanhSach()
{

    for (int i = 0; i < this->soLuong; i++)
    {
        cout << "==============================" << endl;
        (p + i)->Xuat();
    }
}

int main()
{
    BangTuanHoan k;
    k.NhapDanhSach();
    k.XuatDanhSach();

    system("pause");
    return 0;
}