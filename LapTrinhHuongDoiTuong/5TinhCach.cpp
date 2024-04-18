#include <iostream>
using namespace std;
class TinhCach
{
private:
    char yeuTo;
    int tyLe;
    string mucCao;
    string khongXD;
    string mucThap;

public:
    TinhCach();
    void Nhap();
    void Xuat();
    void XuatChiTiet();
    char GetYeuTo()
    {
        return this->yeuTo;
    };
    int GetC();
    int GetN();
    int GetE();
    ~TinhCach(){};
};
TinhCach::TinhCach()
{
    this->yeuTo = 'o';
    this->tyLe = 0;
    this->mucCao = "";
    this->khongXD = "";
    this->mucThap = "";
}
void TinhCach::Nhap()
{
    cout << "Nhap ten Yeu To (O, C, E, A, N): ";
    cin >> this->yeuTo;
    cin.ignore();
    cout << "Nhap Ty Le: ";
    cin >> this->tyLe;
    cin.ignore();
    cout << "Nhap muc Cao: ";
    getline(cin, this->mucCao);
    cout << "Nhap khongXD: ";
    getline(cin, this->khongXD);
    cout << "Nhap mucThap: ";
    getline(cin, this->mucThap);
}
void TinhCach::Xuat()
{
    cout << "yeuTo: " << this->yeuTo << "; Ty Le: " << this->tyLe << endl;
}
void TinhCach::XuatChiTiet()
{
    if (this->tyLe > 70)
        cout << this->yeuTo << ", ty le: " << this->tyLe << "Chi tiet: " << this->mucCao << endl;
    else if (this->tyLe > 30)
        cout << this->yeuTo << ", ty le: " << this->tyLe << "Chi tiet: " << this->khongXD << endl;
    else
        cout << this->yeuTo << ", ty le: " << this->tyLe << "Chi tiet: " << this->mucThap << endl;
}

class Nguoi
{
private:
    string name;
    TinhCach tc[5];

public:
    Nguoi(){};
    void NhapNguoi();
    void XuatNguoi();
    ~Nguoi(){};
};
void Nguoi::NhapNguoi()
{
    for (int i = 0; i < 5; i++)
    {
        tc[i].Nhap();
    }
}
void Nguoi::XuatNguoi()
{
    cout << this->name << " co cac tinh cach: " << endl;
    for (int i = 0; i < 5; i++)
    {
        tc[i].Xuat();
    }
}

int main()
{
    // Câu 1:
    // Nguoi a;
    // a.NhapNguoi();
    // a.XuatNguoi();
    // Câu 2:
    Nguoi *p;
    int n;
    do
    {
        cout << "Nhap so luong Nguoi can quan ly: ";
        cin >> n;
    } while (n < 0);
    p = new Nguoi[n];
    for (int i = 0; i < n; i++)
    {
        p[i].NhapNguoi();
    }
    for (int i = 0; i < n; i++)
    {
        p[i].XuatNguoi();
    }


    system("pause");
    return 0;
}