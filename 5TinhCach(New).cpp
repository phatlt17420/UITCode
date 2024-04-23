#include <iostream>
#include <string>
using namespace std;

class TamLy
{
private:
    char loaiTamLy;
    int chiSo;
    string noiDung;

public:
    TamLy()
    {
        this->loaiTamLy = ' ';
        this->chiSo = 0;
        this->noiDung = "";
    };
    ~TamLy()
    {
        cout << "End! TamLy";
    };
    void Nhap();
    void XuLy();
    void Xuat();
    void XuatChiTiet();
};

void TamLy::Nhap()
{
    cout << "Nhap loai Tam Ly (O-C-E-A-N): ";
    cin >> this->loaiTamLy;
    cout << "Nhap chi so: ";
    cin >> this->chiSo;
}
void TamLy::XuLy()
{

    // Tam ly: 0
    if (this->loaiTamLy == 'O' && this->chiSo > 70)
    {
        this->noiDung = "Tam ly O. Chi So Cao";
    }
    else if (this->loaiTamLy == 'O' && this->chiSo < 30)
    {
        this->noiDung = "Tam ly O. Chi So Thap";
    }
    else if (this->loaiTamLy == 'O' && this->chiSo > 30 && this->chiSo < 70)
    {
        this->noiDung = "Tam ly O. Khong Dua ra nhan dinh";
    }
    // Tam ly: C
    if (this->loaiTamLy == 'C' && this->chiSo > 70)
    {
        this->noiDung = "Tam ly C. Chi So Cao";
    }
    else if (this->loaiTamLy == 'C' && this->chiSo < 30)
    {
        this->noiDung = "Tam ly C. Chi So Thap";
    }
    else if (this->loaiTamLy == 'C' && this->chiSo > 30 && this->chiSo < 70)
    {
        this->noiDung = "Tam ly C. Khong Dua ra nhan dinh";
    }
    // Tam ly: E
    if (this->loaiTamLy == 'E' && this->chiSo > 70)
    {
        this->noiDung = "Tam ly E. Chi So Cao";
    }
    else if (this->loaiTamLy == 'E' && this->chiSo < 30)
    {
        this->noiDung = "Tam ly E. Chi So Thap";
    }
    else if (this->loaiTamLy == 'E' && this->chiSo > 30 && this->chiSo < 70)
    {
        this->noiDung = "Tam ly E. Khong Dua ra nhan dinh";
    }
    // Tam ly: A
    if (this->loaiTamLy == 'A' && this->chiSo > 70)
    {
        this->noiDung = "Tam ly A. Chi So Cao";
    }
    else if (this->loaiTamLy == 'A' && this->chiSo < 30)
    {
        this->noiDung = "Tam ly A. Chi So Thap";
    }
    else if (this->loaiTamLy == 'A' && this->chiSo > 30 && this->chiSo < 70)
    {
        this->noiDung = "Tam ly A. Khong Dua ra nhan dinh";
    }
    // Tam ly: N
    if (this->loaiTamLy == 'N' && this->chiSo > 70)
    {
        this->noiDung = "Tam ly N. Chi So Cao";
    }
    else if (this->loaiTamLy == 'N' && this->chiSo < 30)
    {
        this->noiDung = "Tam ly N. Chi So Thap";
    }
    else if (this->loaiTamLy == 'N' && this->chiSo > 30 && this->chiSo < 70)
    {
        this->noiDung = "Tam ly N. Khong Dua ra nhan dinh";
    }
}
void TamLy::Xuat()
{
    cout << this->loaiTamLy << this->chiSo << "-";
}
void TamLy::XuatChiTiet()
{
    cout << this->loaiTamLy << this->chiSo << ": " << this->noiDung << endl;
}

class Nguoi
{
private:
    string hoTen;
    TamLy arr[5];

public:
    Nguoi()
    {
        this->hoTen = "";
    }
    void Nhap();
    void Xuat();
    void XuatChiTiet();
    ~Nguoi()
    {
        cout << "End! Nguoi";
    }
};
void Nguoi::Nhap()
{

    cout << "Nhap ho ten: ";
    cin.ignore();
    getline(cin, this->hoTen);

    for (int i = 0; i < 5; i++)
    {
        arr[i].Nhap();
        arr[i].XuLy();
    }
}
void Nguoi::Xuat()
{
    cout << "Ho Ten: " << this->hoTen << endl;
    for (int i = 0; i < 5; i++)
    {
        arr[i].Xuat();
    }
}
void Nguoi::XuatChiTiet()
{
    cout << "Ho Ten: " << this->hoTen << endl;
    for (int i = 0; i < 5; i++)
    {
        arr[i].XuatChiTiet();
    }
}

class QuanLy
{
private:
    Nguoi *p;
    int soLuong;

public:
    QuanLy()
    {
        this->soLuong = 0;
        p = new Nguoi[this->soLuong];
    }
    ~QuanLy()
    {
        delete p;
        this->soLuong = 0;
    }
    void Nhap();
    void Xuat();
    void XuatChiTiet();
    void Menu();
};
void QuanLy::Nhap()
{
    cout << "Nhap so luong nguoi can quan ly: ";
    cin >> this->soLuong;
    p = new Nguoi[this->soLuong];
    for (int i = 0; i < this->soLuong; i++)
    {

        (p + i)->Nhap();
    }
}
void QuanLy::Xuat()
{

    for (int i = 0; i < this->soLuong; i++)
    {
        p[i].Xuat();
    }
}
void QuanLy::XuatChiTiet()
{
    int index;
    cout << "Nhap so thu tu cua nguoi can lay thong tin: ";
    cin >> index;
    index--;
    (p + index)->XuatChiTiet();
}
void QuanLy::Menu()
{
    {
        int selection;
        do
        {

            system("pause");
            system("cls");
            cout << "1. Nhap danh sach nguoi can quan ly" << endl;
            cout << "2. Ket qua danh gia tam ly" << endl;
            cout << "3. Chon nguoi trong danh sach can danh gia chi tiet" << endl;
            cout << "4. Thoat chuong trinh" << endl;
            cout << "Nhap lua chon cua ban :";
            cin >> selection;
            switch (selection)
            {
            case 1:
                Nhap();
                break;
            case 2:
                Xuat();
                break;
            case 3:
                XuatChiTiet();
                break;
            case 4:
                exit(1);
            }

        } while (selection > 0 || selection < 4);
    }
}

int main()
{
    QuanLy p;
    p.Menu();
    // p.Nhap();
    // p.Xuat();
    // p.XuatChiTiet();

    system("pause");
    return 0;
}