#include <iostream>
using namespace std;
// hàm kiểm tra số bắt đầu là chữ số 1
int kiemTraSoDauTien (int so)
{
    while (so>=10)
    {
        int sodu;
        sodu=so%10;
        so=so/10;
    }
    return so;
}
int main()
{

    int arra[10];
    int na=10;
    for(int i=0; i<na; i++)
        cin>>arra[i];
    int arrb[10];
    int nb=10;
    for(int i=0; i<na; i++)
        arrb[i]=kiemTraSoDauTien(arra[i]);
    int dem1=0;
    int dem4=0;
    for(int i=0; i<na; i++)
    {
        if(arrb[i]==1)
            dem1++;
        if(arrb[i]==4)
            dem4++;
    }
    if(dem1==3&&dem4==1)
        cout<<"TRUE";
    else
        cout<<"FALSE";
    return 0;
}
