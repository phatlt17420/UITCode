#include <iostream>

using namespace std;

int main()
{
    int n, a[100];

   cin>>n;

    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    int x;
    cin>>x;
    for(int i=0; i<n; i++)
    {
        int viTri;
        if(x==a[i]&&viTri==0)
        {
            cout<<x<<" xuat hien dau tien tai vi tri thu "<<i<<" trong mang";
            viTri=1;
            break;
        }
        if(viTri==0)
            cout<<"Khong tim thay "<<x;
    }
    return 0;
}
