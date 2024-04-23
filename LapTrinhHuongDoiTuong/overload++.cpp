#include <iostream>
using namespace std;
const int SOGIAY_NGAY = 86400;
class ThoiDiem
{
    long tsgiay;
    static bool HopLe(int g, int p, int gy); // Giờ, phút, giây
public:
    ThoiDiem(int g = 0, int p = 0, int gy = 0);
    void Set(int g, int p, int gy);
    int LayGio() const { return tsgiay / 3600; } // 1h = 3600s
    int LayPhut() const { return (tsgiay % 3600) / 60; }
    int LayGiay() const { return tsgiay % 60; }
    void Tang();
    void Giam();
    ThoiDiem &operator++();
};
void ThoiDiem::Tang()
{
    tsgiay = ++tsgiay % SOGIAY_NGAY;
    // SOGIAY_NGAY = 86.400s
}
void ThoiDiem::Giam()
{
    if (--tsgiay < 0)
        tsgiay = SOGIAY_NGAY - 1;
}
ThoiDiem &ThoiDiem::operator++()
{
    Tang();
    return *this;
}
int main()
{
    ThoiDiem t(23, 59, 59), t1, t2;
    cout << "t = " << t << "\n";
    t1 = ++t;                                        // t.operator ++();
    cout << "t = " << t << "\t t1 = " << t1 << "\n"; // t = 0:00:00, t1 = 0:00:00
    t1 = t++;                                        // Báo lỗi
    cout << "t = " << t << "\t t1 = " << t1 << "\n";

    system("pause");
    return 0;
}