#include <iostream>
using namespace std;
class Nhac
{
private:
    char caoDo;   // C: Do, D: Re,E: Mi,F: fa, G: Sol, A: La, B: Si; Z: Dau lang
    int truongDo; // 1-7 tuong ung note tron den note moc tu

public:
    Nhac(){};
    ~Nhac(){};
    // void Nhap();
    void Xuat();
    void Nhap();
    char GetCaoDo()
    {
        return this->caoDo;
    }
    int GetTruongDo()
    {
        return this->truongDo;
    }
};
void Nhac::Nhap()
{
    cout << "Nhap Cao Do (tuong ung: C: Do, D: Re,E: Mi,F: fa, G: Sol, A: La, B: Si; Z: Dau lang )";
    cin >> this->caoDo;
    cout << "Nhap truong do 1-7 tuong ung note tron den note moc tu";
    cin >> truongDo;
}
void Nhac::Xuat()
{
    cout << this->caoDo << this->truongDo << "-";
}
class BanNhac
{
private:
    Nhac p[10000];
    int soLuong;

public:
    void nhap()
    {
        cout << "Nhap so luong note nhac: ";
        cin >> this->soLuong;

        for (int i = 0; i < this->soLuong; i++)
        {
            p[i].Nhap();
        }
    }
    void xuat()
    {
        for (int i = 0; i < this->soLuong; i++)
        {
            p[i].Xuat();
        }
    }
    void Menu()
    {
        int selection;
        do
        {
            system("pause");
            system("cls");
            cout << "1. Nhap ban nhac" << endl;
            cout << "2. Xuat ban nhac" << endl;
            cout << "3. Tim va dem dau lang den" << endl;
            cout << "4. Not nhac co cao do  cao nha" << endl;
            cout << "5. Thoat chuong trinh" << endl;
            cout << "Nhap lua chon cua ban: ";
            cin >> selection;
            switch (selection)
            {
            case 1:
                this->nhap();
                break;
            case 2:
                this->xuat();
                break;
            case 3:
                this->timDauLangDen();
                break;
            case 5:
                exit(1);
            }
        } while (selection > 0 || selection < 4);
    }
    int timDauLangDen()
    {
        int dem;
        for (int i = 0; i < this->soLuong; i++)
        {
            cout << p[i].GetCaoDo();
        }
    }
};
int main()
{
    BanNhac p;
    p.Menu();

    system("pause");
    return 0;
}