#include <iostream>
using namespace std;
class GCN
{
private:
    string SoGCN;     // Số GCN
    string hoTenCSH;  // họ tên CSH
    string namSinh;   // Năm sinh CSH
    string CMND;      // CMND
    string DiaChiCSH; // Địa chỉ CSH
    int soThua;
    int soToBanDo;
    string diachithuadat; // dia chỉ thửa đất
    float dienTich;       // diện tích thửa đất
    string ngayCapGCN;    // ngày cấp GCN  *

public:
    virtual void Nhap();
    virtual void Xuat();
    virtual void TinhThue() = 0;
    virtual float GetTongTienThue() = 0;
    virtual int GetThoiHanSD() = 0;
    float GetDienTich()
    {
        return this->dienTich;
    }
};
void GCN::Nhap()
{
    cout << "Nhap so GCN: ";
    cin.ignore();
    getline(cin, this->SoGCN);
    cout << "Nhap Ho Ten CSH: ";
    cin.ignore();
    getline(cin, this->hoTenCSH);
    cout << "Nhap nam sinh CSH: ";
    cin.ignore();
    getline(cin, this->namSinh);
    cout << "Nhap CMND CSH: ";
    cin.ignore();
    getline(cin, this->CMND);
    cout << "Nhap dia chi CSH: ";
    cin.ignore();
    getline(cin, this->DiaChiCSH);
    cout << "Nhap so Thua Dat: ";
    cin >> this->soThua;
    cout << "Nhap so To Ban Do: ";
    cin >> this->soToBanDo;
    cout << "Nhap dia chi Thua Dat: ";
    cin.ignore();
    getline(cin, this->diachithuadat);
    cout << "Nhap Dien Tich Thua Dat: ";
    cin >> this->dienTich;
    cout << "Nhap ngay cap GCN: ";
    cin.ignore();
    getline(cin, this->ngayCapGCN);
}
void GCN::Xuat()
{
    cout << endl;
    cout << "=========================================================" << endl;
    cout << "- GCN so: " << this->SoGCN << endl;
    cout << "- Ho Ten CSH: " << this->hoTenCSH << endl;
    cout << "- Nam sinh: " << this->namSinh << endl;
    cout << "- CMND so: " << this->CMND << endl;
    cout << "- Dia chi CSH: " << this->DiaChiCSH << endl;
    cout << "- Thua Dat so: " << this->soThua << endl;
    cout << "- To Ban Do so: " << this->soToBanDo << endl;
    cout << "- Dia Chi thua dat: " << this->diachithuadat << endl;
    cout << "- Dien Tich: " << this->dienTich << endl;
    cout << "- Ngay Cap GCN: " << this->ngayCapGCN << endl;
    cout << endl;
}

class GCNDatNongNghiep : public GCN
{
private:
    int thoiHanSD;      // Thời hạn sử dụng đất nông nghiệp
    float donGiaThue;   // Đơn giá thuê hằng năm
    float tongTienThue; // Tổng tiền thuê

public:
    void Nhap();
    void Xuat();
    void TinhThue();
    float GetDonGiaThue()
    {
        return this->donGiaThue;
    }
    float GetTongTienThue() { return this->tongTienThue; }
    int GetThoiHanSD()
    {
        return this->thoiHanSD;
    }
};
void GCNDatNongNghiep::Nhap()
{
    GCN::Nhap();
    cin.ignore();
    cout << "Nhap thoi han su dung dat (nhap nam): ";
    cin >> this->thoiHanSD;
    cout << "Nhap Don gia tinh thue hang nam: ";
    cin >> this->donGiaThue;
}
void GCNDatNongNghiep::Xuat()
{
    GCN::Xuat();
    cout << "- Thong tin tinh thue Dat Nong Nghiep: " << endl;
    cout << "- Thoi han su dung dat: " << this->thoiHanSD;
    cout << "- Don gia thue phai dong hang nam/m2: " << this->donGiaThue << endl;
    cout << "- Tong tien thue phai dong hang nam: " << this->tongTienThue << endl;
    cout << endl;
}
void GCNDatNongNghiep::TinhThue()
{
    float kq;
    kq = this->GetDonGiaThue() * this->GetDienTich();
}

class GCNDatPhiNongNghiep : public GCN
{
private:
    float donGiaThue;   // Đơn giá thuê hằng năm
    float tongTienThue; // Tổng tiền thuê
    int thoiHanSD;      // khong su dung

public:
    void Nhap();
    void Xuat();
    void TinhThue();
    float GetDonGiaThue()
    {
        return this->donGiaThue;
    }
    float GetTongTienThue() { return this->tongTienThue; }
    int GetThoiHanSD()
    {
        return this->thoiHanSD;
    }
};
void GCNDatPhiNongNghiep::Nhap()
{
    GCN::Nhap();
    cout << "Nhap Don gia tinh thue hang nam: ";
    cin >> this->donGiaThue;
}
void GCNDatPhiNongNghiep::Xuat()
{
    GCN::Xuat();
    cout << "- Thong tin tinh thue Dat Phi Nong Nghiep" << endl;
    cout << "- Don gia thue phai dong hang nam/m2: " << this->donGiaThue << endl;
    cout << "- Tong tien thue phai dong hang nam: " << this->tongTienThue << endl;
}
void GCNDatPhiNongNghiep::TinhThue()
{
    float kq;
    kq = this->GetDonGiaThue() * this->GetDienTich();
}

class QuanLy
{
private:
    GCN **p;
    int soLuong; // Nhap so luong GCN can quan ly

public:
    void NhapGCN();
    void XuatGCN();
    void TinhTienDat();
    void ThuaDatMaxThue();
    void DSHetThoiHan();
    void Menu();
};
void QuanLy::NhapGCN()
{
    cout << "Nhap so luong GCN can quan ly: ";
    cin >> this->soLuong;
    p = new GCN *[this->soLuong];
    int type; // loại đất
    for (int i = 0; i < this->soLuong; i++)
    {

        cout << "1. GCN dat Nong Nghiep   2. GCN dat Phi Nong Nghiep :";
        cin >> type;

        if (type == 1)
        {
            p[i] = new GCNDatNongNghiep();
            p[i]->Nhap();
        }
        if (type == 2)
        {
            p[i] = new GCNDatPhiNongNghiep();
            p[i]->Nhap();
        }
    }
}
void QuanLy::XuatGCN()
{
    for (int i = 0; i < this->soLuong; i++)
    {
        p[i]->Xuat();
    }
}
void QuanLy::TinhTienDat()
{
    for (int i = 0; i < this->soLuong; i++)
    {
        p[i]->TinhThue();
    }
}
void QuanLy::ThuaDatMaxThue()
{

    int tmp = 0;

    for (int i = 0; i < this->soLuong; i++)
    {
        if (p[i]->GetTongTienThue() > p[tmp]->GetTongTienThue())
        {
            tmp = i;
        }
    }
    cout << "Thua dat co tien su dung dat lon nhat: ";
    cout << endl;
    p[tmp]->Xuat();
}
void QuanLy::DSHetThoiHan()
{
    int namhientai;
    cout << "Nhap nam hien tai: ";
    cin >> namhientai;
    cout << "Cac thua dat het thoi han su dung: ";
    for (int i = 0; i < this->soLuong; i++)
    {
        if (!((p[i]->GetThoiHanSD() - namhientai) > 0))
        {
            p[i]->Xuat();
        }
    }
}
void QuanLy::Menu()
{

    int select;
    do
    {
        system("pause");
        system("cls");
        cout << "1. Nhap GCN" << endl;
        cout << "2. Xuat GCN" << endl;
        cout << "3. Tinh tien thue" << endl;
        cout << "4. Thua dat co thue dong nhieu nhat" << endl;
        cout << "5. Thua dat het thoi han su dung." << endl;
        cout << "6. Thoat chuong trinh" << endl;
        cout << "Nhap lua chon cua ban: ";
        cin >> select;
        switch (select)
        {
        case 1:
            this->NhapGCN();
            break;
        case 2:
            this->XuatGCN();
            break;
        case 3:
            this->TinhTienDat();
            break;
        case 4:
            this->ThuaDatMaxThue();
            break;
        case 5:
            this->DSHetThoiHan();
            break;

        case 6:
            exit(1);
            break;
        }
    } while (select > 0 || select < 6);
}

int main()
{
    QuanLy p;
    p.Menu();

    system("pause");
}
