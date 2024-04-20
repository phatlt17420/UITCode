/*Xây dựng lớp đơn thức có bậc trong khoảng từ 1 đến 100.
F(x)= ax^n (a luôn khác 0, 1<=n<=100)
Xây dựng các phương thức: (3 điểm)
a. Phương thức cho phép xác định giá trị của đơn thức ứng với x=x0 (tính F(x0) )
b. Phương thức tính nghiệm đơn thức khi F(x) = b (b  R)
c. Phép toán cộng (operator +) để cộng hai đơn thức*/
#include <iostream>
#include <math.h>
using namespace std;
class DonThuc
{
private:
    float a;
    float x;
    int n;

public:
    DonThuc()
    {
        this->x = 1;
        this->a = 1;
        this->n = 1;
    }
    void Nhap()
    {
        do
        {
            cout << "Nhap a = ";
            cin >> this->a;
        } while (a == 0);
        do
        {
            cout << "Nhap n = ";
            cin >> this->n;
        } while (n < 1 || n > 100);
        cout << "Nhap x =  ";
        cin >> this->x;
    }
    float TinhGiaTri()
    {
        return this->a * pow(this->x, this->n);
    }
    void tinhNghiem()
    {
        float b;
        cout << "Nhap b= ";
        cin >> b;
        float result;
        result = pow(((float)b / this->a), 1 / ((float)this->n));
        cout << result;
    }
};

int main()
{
    // a. Phương thức cho phép xác định giá trị của đơn thức ứng với x=x0 (tính F(x0) )
    DonThuc d;
    d.Nhap();
    // cout << "Gia tri don thuc = ";
    // cout << d.TinhGiaTri() << endl;
    // b. Phương thức tính nghiệm đơn thức khi F(x) = b (b thuộc R)
    d.tinhNghiem();

    system("pause");
    return 0;
}