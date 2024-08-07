/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
###End banned keyword*/
#include <iostream>
#include <string>

#define LOAD 0.7
#define EMPTY 0
#define DELETE -1
using namespace std;

struct Hocsinh
{
    int Maso;
    string Hoten;
    int Namsinh;
    bool Gioitinh;
    double TBK;
};

struct Hashtable
{
    int M; // Kich thuoc bang bam
    int n; // so phan tu trong bang bam
    Hocsinh *table;
};
void Input(Hocsinh &x)
{
    cin >> x.Maso;
    getline(cin>>ws, x.Hoten);
    cin >> x.Namsinh;
    cin >> x.Gioitinh;
    cin >> x.TBK;
}
//###INSERT CODE HERE -
 void CreateHashtable(Hashtable &H, int m)
 {
     H.table=new Hocsinh[m];
     H.n=0;
     H.M=m;
     for (int i=0;i<m ;i++ )
        H.table[i].Maso=0;

 }

void Insert(Hashtable &hashtable, Hocsinh hs)
{
    float hstai=(float)(hashtable.n+1)/hashtable.M;
    if(hstai>0.7)
        return ;
    else
    {
        int index = hs.Maso%hashtable.M;
        if (hashtable.table[index].Maso==0)
        {
            hashtable.table[index]=hs;
            hashtable.n++;
        }
        else
        {
            int dem=1;
            int i=0;
            do
            {
                dem++;
                i++;
                index = (hs.Maso%hashtable.M+i)%hashtable.M;
                if (dem<hashtable.M)
                {
                    if (hashtable.table[index].Maso==0)
                    {
                        hashtable.table[index]=hs;
                        hashtable.n++;
                        break;
                    }
                }
                else
                    break;

            }
            while (1);
        }
    }

}
void PrintHashtable(Hashtable hashtable)
{
    for (int i=0; i<hashtable.M ; i++ )
    {
        if (hashtable.table[i].Maso>0)
            cout << '[' << hashtable.table[i].Maso << ",  " << hashtable.table[i].Hoten << "  , " << hashtable.table[i].Gioitinh << ", " << hashtable.table[i].Namsinh << ", " << hashtable.table[i].TBK << "]\n";
        else
            cout << "[" << hashtable.table[i].Maso <<  ",  " << "  , " << ", " << ", " << "]\n";
    }
}
void DeleteHashtable(Hashtable &hashtable)
{
    delete[] hashtable.table;
    hashtable.n=0;
}


//###INSERT CODE HERE -
int main()
{
    Hashtable hashtable;

    int m, n;
    Hocsinh hs;

    cin >> m;
    CreateHashtable(hashtable, m);
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        Input(hs);
        Insert(hashtable, hs);
    }
    PrintHashtable(hashtable);
    DeleteHashtable(hashtable);
    return 0;
}
