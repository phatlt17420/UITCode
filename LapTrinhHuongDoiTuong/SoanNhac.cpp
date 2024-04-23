#include <iostream>
#include <string>
using namespace std;
class Nhac
{
private:
    char caoDo;
    int truongDo; // Nhap tu 1-7 tuong ung tron, moc ....
    int loai;

public:
    Nhac();
    ~Nhac();
    virtual void Nhap() = 0;
    virtual void Xuat() = 0;
    char GetCaoDo();
    int GetTruongDo();
    void SetCaoDo(char);
    void SetTruongDo(int);
};
Nhac::Nhac()
{
    this->caoDo = ' ';
    this->truongDo = 0;
    this->loai = 0;
}
Nhac::~Nhac()
{
    cout << "End! Nhac." << endl;
}
char Nhac::GetCaoDo()
{
    return this->caoDo;
}
int Nhac::GetTruongDo()
{
    return this->truongDo;
}
void Nhac::SetCaoDo(char caoDo)
{
    this->caoDo = caoDo;
}
void Nhac::SetTruongDo(int truongDo)
{
    this->truongDo = truongDo;
}
class NotNhac : public Nhac
{
public:
    void Nhap();
    void Xuat();
};
void NotNhac::Nhap()
{
    char caoDo;
    int truongDo;
    cout << "Nhap Cao Do: ";
    cin >> caoDo;

    cout << "Nhap Truong Do: ";
    cin >> truongDo;
    Nhac::SetCaoDo(caoDo);
    Nhac::SetTruongDo(truongDo);
}
void NotNhac::Xuat()
{
    cout << this->GetCaoDo() << this->GetTruongDo() << "-";
}
class DauLang : public Nhac
{
public:
    void Nhap();
    void Xuat();
};
void DauLang::Nhap()
{
    int truongDo;
    char caoDo = 'Z';
    cout << "Nhap truong do dau lang: ";
    cin >> truongDo;
    Nhac::SetTruongDo(truongDo);
    Nhac::SetCaoDo(caoDo);
}
void DauLang::Xuat()
{
    cout << this->GetCaoDo() << this->GetTruongDo() << "-";
}

class BanNhac
{
private:
    Nhac **p;
    int soLuong;

public:
    void NhapBanNhac();
    void XuatBanNhac();
    void TimDauLangDen();
    void Menu();
    void TimCaoDoMax();
};
void BanNhac::NhapBanNhac()
{
    int type;
    cout << "Nhap so luong: ";
    cin >> this->soLuong;
    p = new Nhac *[this->soLuong];
    for (int i = 0; i < this->soLuong; i++)
    {
        cout << "Nhap loai can nhap: (1. Not Nhac; 2.Dau lang)";
        cin >> type;
        if (type == 1)
        {
            p[i] = new NotNhac();
            p[i]->Nhap();
        }
        if (type == 2)
        {
            p[i] = new DauLang();
            p[i]->Nhap();
        }
    }
}
void BanNhac::XuatBanNhac()
{
    for (int i = 0; i < this->soLuong; i++)
    {
        p[i]->Xuat();
    }
}
void BanNhac::TimDauLangDen()
{
    int dem;
    for (int i = 0; i < this->soLuong; i++)
    {
        if (p[i]->GetCaoDo() == 'Z' && p[i]->GetTruongDo() == 3)
        {
            dem++;
            cout << "Vi tri cua dau lang den: " << i << endl;
        }
    }
    cout << "Co " << dem << " dau lang den" << endl;
}
void BanNhac::TimCaoDoMax()
{
    char max;
    int numMax = 0;
    int number;
    for (int i = 0; i < this->soLuong; i++)
    {
        if (p[i]->GetCaoDo() == 'Z')
            number = 0;
        if (p[i]->GetCaoDo() == 'C')
            number = 1;
        if (p[i]->GetCaoDo() == 'D')
            number = 2;
        if (p[i]->GetCaoDo() == 'E')
            number = 3;
        if (p[i]->GetCaoDo() == 'F')
            number = 4;
        if (p[i]->GetCaoDo() == 'G')
            number = 5;
        if (p[i]->GetCaoDo() == 'A')
            number = 6;
        if (p[i]->GetCaoDo() == 'B')
            number = 7;
        if (number > numMax)
        {
            numMax = number;
            max = p[i]->GetCaoDo();
        }
    }
    cout << "Cao do cao nhat: " << max;
}

void BanNhac::Menu()
{
    int chon;
    do
    {

        system("pause");
        system("cls");
        cout << "1. Nhap ban nhac" << endl;
        cout << "2. Xuat ban nhac" << endl;
        cout << "3. Tim Dau Lang Den" << endl;
        cout << "4. Tim cao do CAo Nhat" << endl;
        cout << "5. Thoat chuong trinh" << endl;
        cout << "Nhap lua chon cua ban: ";
        cin >> chon;
        switch (chon)
        {
        case 1:
            this->NhapBanNhac();
            break;
        case 2:
            this->XuatBanNhac();
            break;
        case 3:
            this->TimDauLangDen();
            break;
        case 4:
            this->TimCaoDoMax();
            break;
        case 5:
            exit(1);
        }

    } while (chon > 0 || chon < 5);
}

int main()
{
    BanNhac p;
    p.Menu();

    system("pause");
    return 0;
}