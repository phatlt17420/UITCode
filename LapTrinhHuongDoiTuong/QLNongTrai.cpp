#include <iostream>
#include <time.h>
using namespace std;
class DongVat
{
private:
    int SLcon;
    int SLsua;
    string tenConVat;

public:
    DongVat()
    {
        this->SLcon = 1;
        this->SLsua = 0;
        this->tenConVat = "";
    };
    ~DongVat()
    {
        cout << "End Dong Vat" << endl;
    };
    virtual void sinhCon() {};
    virtual void choSua() {};
    virtual void tiengKeu() {};
    int GetSLcon()
    {
        return this->SLcon;
    };
    int GetSLsua()
    {
        return this->SLsua;
    };
    void nhap();
    void xuat();
    void SetSLcon(int SLcon)
    {
        this->SLcon = SLcon;
    }
    void SetSLsua(int SLsua)
    {
        this->SLsua = SLsua;
    }
};
void DongVat::nhap()
{
    cout << "Nhap ten con vat: ";
    cin.ignore();
    getline(cin, this->tenConVat);
}
void DongVat::xuat()
{
    cout << "Con " << this->tenConVat << " co: " << this->SLcon << " con va " << this->SLsua << " lit sua" << endl;
}

class Bo : public DongVat
{
public:
    void sinhCon();
    void choSua();
    void tiengKeu();
};
void Bo::sinhCon()
{
    int tmp;
    tmp = this->GetSLcon();
    this->SetSLcon(tmp + 1);
}
void Bo::choSua()
{
    int tmp;
    tmp = this->GetSLsua() + rand() % 21;
    this->SetSLsua(tmp);
}
void Bo::tiengKeu()
{
    cout << "Tieng keu cua Con Bo" << endl;
}

class Cuu : public DongVat
{
public:
    void sinhCon();
    void choSua();
    void tiengKeu();
};
void Cuu::sinhCon()
{
    int tmp;
    tmp = this->GetSLcon();
    this->SetSLcon(tmp + 1);
}
void Cuu::choSua()
{
    int tmp;
    tmp = this->GetSLsua() + rand() % 6;
    this->SetSLsua(tmp);
}
void Cuu::tiengKeu()
{
    cout << "Tieng keu cua Con Cuu" << endl;
}

class De : public DongVat
{
public:
    void sinhCon();
    void choSua();
    void tiengKeu();
};
void De::sinhCon()
{
    int tmp;
    tmp = this->GetSLcon();
    this->SetSLcon(tmp + 1);
}
void De::choSua()
{
    int tmp;
    tmp = this->GetSLsua() + rand() % 11;
    this->SetSLsua(tmp);
}
void De::tiengKeu()
{
    cout << "Tieng keu cua Con De" << endl;
}

class QuanLy
{
private:
    int SLTrangTrai;
    DongVat **p;

public:
    void nhapTrangTrai();
    void XuatTrangTrai();
    void SinhConTrangTrai();
    void ChoSuaTrangTrai();
    void TiengKeuTrangTrai();
    void ThongKeSoCon();
    void ThongKeSoSua();
    void Menu();
};
void QuanLy::nhapTrangTrai()
{
    cout << "Nhap so luong dong vat can tao: ";
    cin >> this->SLTrangTrai;
    p = new DongVat *[this->SLTrangTrai];
    for (int i = 0; i < this->SLTrangTrai; i++)
    {
        int type; // 1. bo; 2. Cuu; 3. De
        do
        {
            cout << "Nhap con vay muon tao (1. Bo  2.Cuu  3.De): ";
            cin >> type;
        } while (type != 1 && type != 2 && type != 3);

        if (type == 1)
        {
            p[i] = new Bo();
            p[i]->nhap();
        }
        if (type == 2)
        {
            p[i] = new Cuu();
            p[i]->nhap();
        }
        if (type == 3)
        {
            p[i] = new De();
            p[i]->nhap();
        }
    }
}
void QuanLy::XuatTrangTrai()
{
    for (int i = 0; i < this->SLTrangTrai; i++)
    {
        p[i]->xuat();
    }
}
void QuanLy::SinhConTrangTrai()
{
    for (int i = 0; i < this->SLTrangTrai; i++)
    {
        p[i]->sinhCon();
    }
}
void QuanLy::ChoSuaTrangTrai()
{
    for (int i = 0; i < this->SLTrangTrai; i++)
    {
        p[i]->choSua();
    }
}
void QuanLy::TiengKeuTrangTrai()
{
    for (int i = 0; i < this->SLTrangTrai; i++)
    {
        p[i]->tiengKeu();
    }
}
void QuanLy::ThongKeSoCon()
{
    int tongsocon = 0;
    for (int i = 0; i < this->SLTrangTrai; i++)
    {
        tongsocon += p[i]->GetSLcon();
    }
    cout << "Tong so con trong nong trai: " << tongsocon;
}
void QuanLy::ThongKeSoSua()
{
    int tongsosua = 0;
    for (int i = 0; i < this->SLTrangTrai; i++)
    {
        tongsosua += p[i]->GetSLsua();
    }
    cout << "Tong so con trong nong trai: " << tongsosua;
}

void QuanLy::Menu()
{
    int select;
    do
    {
        system("pause");
        system("cls");
        cout << "1. Nhap dan dong vat" << endl;
        cout << "2. Cho dan dong vat keu" << endl;
        cout << "3. Cho dan dong vat sinh con" << endl;
        cout << "4. Cho dan dong vat cho sua" << endl;
        cout << "5. Thong ke tong so con hien co." << endl;
        cout << "6. Thong ke tong so sua hien co" << endl;
        cout << "7. Xuat danh sach dan" << endl;
        cout << "8. Thoat chuong trinh" << endl;
        cout << "Nhap lua chon cua ban: ";
        cin >> select;
        switch (select)
        {
        case 1:
            this->nhapTrangTrai();
            break;
        case 2:
            this->TiengKeuTrangTrai();
            break;
        case 3:
            this->SinhConTrangTrai();
            break;
        case 4:
            this->ChoSuaTrangTrai();
            break;
        case 5:
            this->ThongKeSoCon();
            break;
        case 6:
            this->ThongKeSoSua();
            break;
        case 7:
            this->XuatTrangTrai();
            break;
        case 8:
            exit(1);
            break;
        }
    } while (select > 0 || select < 8);
}

int main()
{
    srand(time(0));
    QuanLy p;
    p.Menu();

    system("pause");
    return 0;
}