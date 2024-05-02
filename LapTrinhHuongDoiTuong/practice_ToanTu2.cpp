#include <iostream>
using namespace std;
class ThoiGian
{
private:
    int gio;
    int phut;
    int giay;

public:
    ThoiGian(int g = 1, int p = 1, int gy = 1) : gio(g), phut(p), giay(gy){};
    friend ostream &operator<<(ostream &output, ThoiGian a)
    {
        output << a.gio << " gio " << a.phut << " phut " << a.giay << " giay ";
        return output;
    }
    friend istream &operator>>(istream &input, ThoiGian &a)
    {
        cout << "Nhap Gio: ";
        input >> a.gio;
        cout << "Nhap Phut: ";
        input >> a.phut;
        cout << "Nhap Giay: ";
        input >> a.giay;
        return input;
    }
    ThoiGian &operator++()
    {
        giay += 1;
        if (giay > 59)
        {
            giay = 0;
            phut += 1;
        }
        if (phut > 59)
        {
            gio += 1;
            phut = 0;
        }
        return *this;
    }
    ThoiGian operator++(int)
    {
        ThoiGian temp(gio, phut, giay);
        giay += 1;
        if (giay > 59)
        {
            giay = 0;
            phut += 1;
        }
        if (phut > 59)
        {
            gio += 1;
            phut = 0;
        }
        return temp;
    }
};
int main()
{
    ThoiGian time(2, 59, 59);
    // cin >> time;
    cout << time++;
    cout << time;
    system("pause");
    return 0;
}