#include <iostream>
#include <string.h>
using namespace std;
class VanDongVien
{
private:
    string hoTen;
    int tuoi;
    string monThiDau;
    float canNang;
    float chieuCao;

public:
    VanDongVien();
    VanDongVien(string, int, string, float, float);
    ~VanDongVien(){};
    // Xây dựng hàm nhập xuất;
    friend istream &operator>>(istream &input, VanDongVien &a);
    friend ostream &operator<<(ostream &output, VanDongVien a);
    // xây dựng so sánh
    bool operator>(VanDongVien); // Chiều cao, cân nặng
};
VanDongVien::VanDongVien()
{
    this->hoTen = "";
    this->tuoi = 0;
    this->monThiDau = "";
    this->canNang = 0;
    this->chieuCao = 0;
}
VanDongVien::VanDongVien(string ten, int tuoi, string monthidau, float cannang, float chieucao)
{
    this->hoTen = ten;
    this->tuoi = tuoi;
    this->monThiDau = monthidau;
    this->canNang = cannang;
    this->chieuCao = chieucao;
}
ostream &operator<<(ostream &output, VanDongVien a)
{
    output << "hoTen: " << a.hoTen << endl;
    output << "tuoi: " << a.tuoi << endl;
    output << "monThiDau: " << a.monThiDau << endl;
    output << "canNang: " << a.canNang << endl;
    output << "chieuCao: " << a.chieuCao << endl;
    return output;
}
istream &operator>>(istream &input, VanDongVien &a)
{
    cin.ignore();
    fflush(stdin);
    cout << "Nhap hoTen: ";
    getline(input, a.hoTen);
    fflush(stdin);
    cout << "Nhap tuoi: ";
    input >> a.tuoi;
    fflush(stdin);
    cout << "Nhap monThiDau: ";
    cin.ignore();
    getline(input, a.monThiDau);
    cout << "Nhap canNang: ";
    input >> a.canNang;
    cout << "Nhap chieuCao: ";
    input >> a.chieuCao;
    return input;
}
bool VanDongVien::operator>(VanDongVien a)
{
    if (this->chieuCao > a.chieuCao)
        return true;
    else if (this->chieuCao == a.chieuCao)
    {
        if (this->canNang > a.canNang)
            return true;
        else
            return false;
    }
    else
        return false;
}
void swap(VanDongVien &a, VanDongVien &b)
{
    VanDongVien tmp;
    tmp = a;
    a = b;
    b = tmp;
}
void Bublesort(VanDongVien arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; i < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
        }
    }
}

int main()
{
    VanDongVien *arr;
    int n;
    cout << "Nhap so VDV can tao: ";
    cin >> n;
    arr = new VanDongVien[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    Bublesort(arr, n);

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << endl;
    }
    // VanDongVien *a;
    // a = new VanDongVien;
    // cin >> *a;
    // cout << *a;

    system("pause");
    return 0;
}