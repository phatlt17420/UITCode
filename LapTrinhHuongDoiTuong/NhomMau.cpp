#include <iostream>
#include <string>
using namespace std;
class Nguoi
{
private:
    string hoTen;
    string nhomMau; // A, B, O, AB
    string Rh;      // +, -

public:
    Nguoi()
    {
        this->hoTen = "";
        this->nhomMau = "";
        this->Rh = "";
    };
    ~Nguoi(){};
    void NhapNguoi();
    void XuatNguoi();
    string GetNhomMau()
    {
        return this->nhomMau;
    }
    string GetRh()
    {
        return this->Rh;
    }
};
void Nguoi::NhapNguoi()
{
    cout << "Nhap ho ten nguoi can quan ly: ";
    cin.ignore();
    getline(cin, this->hoTen);

    cout << "Nhap nhom mau: ";
    cin >> this->nhomMau;

    cout << "Nhap Rh: ";
    cin >> this->Rh;
}
void Nguoi::XuatNguoi()
{
    cout << "==========================" << endl;
    cout << "Ho va Ten: " << this->hoTen << endl;
    cout << "Nhom Mau: " << this->nhomMau << endl;
    cout << "Rh" << this->Rh << endl;
}
class QuanLy
{
private:
    Nguoi *p;
    int soLuong;

public:
    void NhapDanhSach();
    void XuatDanhSach();
    void KiemTraBo3();
    void LietKeDanhSachTuongThich();
    void Menu();
};
void QuanLy::NhapDanhSach()
{
    cout << "Nhap so luong nguoi can quan ly: ";
    cin >> this->soLuong;
    p = new Nguoi[this->soLuong];
    for (int i = 0; i < this->soLuong; i++)
    {
        p[i].NhapNguoi();
    }
}
void QuanLy::XuatDanhSach()
{

    for (int i = 0; i < this->soLuong; i++)
    {
        p[i].XuatNguoi();
    }
}
void QuanLy::KiemTraBo3()
{
    cout << "Nhap lan luot thong tin cua Ba Me va Con: ";
    this->soLuong = 3;
    p = new Nguoi[3];
    for (int i = 0; i < 3; i++)
    {
        (p + i)->NhapNguoi();
    }
    cout << "Thong tin nhom mau cua 3 nguoi" << endl;

    for (int i = 0; i < 3; i++)
    {
        (p + i)->XuatNguoi();
    }

    if (p[0].GetNhomMau() == "A" && p[1].GetNhomMau() == "A" && (p[2].GetNhomMau() == "A" || p[2].GetNhomMau() == "O"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "A" && p[1].GetNhomMau() == "B")
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "A" && p[1].GetNhomMau() == "AB" && (p[2].GetNhomMau() != "O"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "A" && p[1].GetNhomMau() == "O" && (p[2].GetNhomMau() == "A" || p[2].GetNhomMau() == "O"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "B" && p[1].GetNhomMau() == "A")
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "B" && p[1].GetNhomMau() == "B" && (p[2].GetNhomMau() == "B" || p[2].GetNhomMau() == "O"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "B" && p[1].GetNhomMau() == "AB" && (p[2].GetNhomMau() != "O"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "B" && p[1].GetNhomMau() == "O" && (p[2].GetNhomMau() == "B" || p[2].GetNhomMau() == "O"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "AB" && p[1].GetNhomMau() == "A" && p[2].GetNhomMau() != "O")
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "AB" && p[1].GetNhomMau() == "B" && p[2].GetNhomMau() != "O")
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "AB" && p[1].GetNhomMau() == "AB" && p[2].GetNhomMau() != "O")
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "AB" && p[1].GetNhomMau() == "O" && (p[2].GetNhomMau() == "A" || p[2].GetNhomMau() == "B"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "O" && p[1].GetNhomMau() == "A" && (p[2].GetNhomMau() == "A" || p[2].GetNhomMau() == "O"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "O" && p[1].GetNhomMau() == "B" && (p[2].GetNhomMau() == "B" || p[2].GetNhomMau() == "O"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "O" && p[1].GetNhomMau() == "AB" && (p[2].GetNhomMau() == "A" || p[2].GetNhomMau() == "B"))
    {
        cout << "Co quan he huyet thong";
    }
    else if (p[0].GetNhomMau() == "O" && p[1].GetNhomMau() == "O" && (p[2].GetNhomMau() == "O"))
    {
        cout << "Co quan he huyet thong";
    }
    else
    {
        cout << "Khong Co quan he huyet thong";
    }
}
void QuanLy::LietKeDanhSachTuongThich()
{
    cout << "Chon so thu tuong nguoi muon nhan:";
    int chon;
    cin >> chon;
    cout << "Thong tin nguoi muon nhan mau: ";
    p[chon - 1].XuatNguoi();
    if (p[chon - 1].GetNhomMau() == "O" && p[chon - 1].GetRh() == "-")
    {
        cout << "Danh Sach nguoi tuong thich: " << endl;
        for (int i = 0; i < this->soLuong; i++)
        {
            if (i == chon - 1)
                continue;

            if (p[i].GetNhomMau() == "O" && p[i].GetRh() == "-")
            {
                p[i].XuatNguoi();
            }
        }
    }

    if (p[chon - 1].GetNhomMau() == "O" && p[chon - 1].GetRh() == "+")
    {
        cout << "Danh Sach nguoi tuong thich: " << endl;
        for (int i = 0; i < this->soLuong; i++)
        {
            if (i == chon - 1)
                continue;
            if (p[i].GetNhomMau() == "O" && (p[i].GetRh() == "-" || p[i].GetRh() == "+"))
            {
                p[i].XuatNguoi();
            }
        }
    }

    if (p[chon - 1].GetNhomMau() == "A" && p[chon - 1].GetRh() == "-")
    {
        cout << "Danh Sach nguoi tuong thich: " << endl;
        for (int i = 0; i < this->soLuong; i++)
        {
            if (i == chon - 1)
                continue;
            if ((p[i].GetNhomMau() == "O" && p[i].GetRh() == "-") || (p[i].GetNhomMau() == "A" && p[i].GetRh() == "-"))
            {
                p[i].XuatNguoi();
            }
        }
    }

    if (p[chon - 1].GetNhomMau() == "A" && p[chon - 1].GetRh() == "+")
    {
        cout << "Danh Sach nguoi tuong thich: " << endl;
        for (int i = 0; i < this->soLuong; i++)
        {
            if (i == chon - 1)
                continue;
            if (((p[i].GetNhomMau() == "O") && ((p[i].GetRh() == "-") || (p[i].GetRh() == "-"))) || ((p[i].GetNhomMau() == "A") && ((p[i].GetRh() == "-") || (p[i].GetRh() == "-"))))
            {
                p[i].XuatNguoi();
            }
        }
    }

    if (p[chon - 1].GetNhomMau() == "B" && p[chon - 1].GetRh() == "-")
    {
        cout << "Danh Sach nguoi tuong thich: " << endl;
        for (int i = 0; i < this->soLuong; i++)
        {
            if (i == chon - 1)
                continue;
            if ((p[i].GetNhomMau() == "O" && p[i].GetRh() == "-") || (p[i].GetNhomMau() == "B" && p[i].GetRh() == "-"))
            {
                p[i].XuatNguoi();
            }
        }
    }

    if (p[chon - 1].GetNhomMau() == "B" && p[chon - 1].GetRh() == "+")
    {
        cout << "Danh Sach nguoi tuong thich: " << endl;
        for (int i = 0; i < this->soLuong; i++)
        {
            if (i == chon - 1)
                continue;
            if (p[i].GetNhomMau() == "O" || (p[i].GetNhomMau() == "B"))
            {
                p[i].XuatNguoi();
            }
        }
    }

    if (p[chon - 1].GetNhomMau() == "AB" && p[chon - 1].GetRh() == "-")
    {
        cout << "Danh Sach nguoi tuong thich: " << endl;
        for (int i = 0; i < this->soLuong; i++)
        {
            if (i == chon - 1)
                continue;
            if ((p[i].GetNhomMau() == "O" && p[i].GetRh() == "-") || (p[i].GetNhomMau() == "B" && p[i].GetRh() == "-") || (p[i].GetNhomMau() == "O" && p[i].GetRh() == "-"))
            {
                p[i].XuatNguoi();
            }
        }
    }

    if (p[chon - 1].GetNhomMau() == "AB" && p[chon - 1].GetRh() == "+")
    {
        cout << "Danh Sach nguoi tuong thich: " << endl;
        for (int i = 0; i < this->soLuong; i++)
        {
            if (i == chon - 1)
                continue;
            {
                p[i].XuatNguoi();
            }
        }
    }
}
void QuanLy::Menu()
{
    int selection;
    do
    {

        system("pause");
        system("cls");
        cout << "1. Nhap danh sach" << endl;
        cout << "2. Xuat danh sach " << endl;
        cout << "3. Kiem tra bo ba " << endl;
        cout << "4. Liet ke danh sach tuong thich " << endl;
        cout << "5. Thoat thuong trinh " << endl;
        cout << "Nhap chon lua cua ban: ";
        cin >> selection;
        switch (selection)
        {
        case 1:
            NhapDanhSach();
            break;
        case 2:
            XuatDanhSach();
            break;
        case 3:
            KiemTraBo3();
            break;
        case 4:
            LietKeDanhSachTuongThich();
            break;
        case 5:
            exit(1);
        }

    } while (selection > 0 || selection < 5);
}

int main()
{
    QuanLy p;
    p.Menu();

    system("pause");
    return 0;
}