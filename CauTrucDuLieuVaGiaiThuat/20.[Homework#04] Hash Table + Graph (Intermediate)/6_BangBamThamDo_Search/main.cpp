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

struct Hocsinh {
    int Maso;
    string Hoten;
    int Namsinh;
    bool Gioitinh;
    double TBK;
};

struct Hashtable {
    int M; // Kich thuoc bang bam
    int n; // so phan tu trong bang bam
    Hocsinh *table;
};
void Input(Hocsinh &x) {
    cin >> x.Maso;
    getline(cin>>ws, x.Hoten);
    cin >> x.Gioitinh;
    cin >> x.Namsinh;
    cin >> x.TBK;
}
//###INSERT CODE HERE -
void CreateHashtable(Hashtable &hashtable, int m)
{
    hashtable.table=new Hocsinh[m];
    hashtable.M=m;
    hashtable.n=0;
    for (int i=0;i<m ;i++ )
    {
        hashtable.table[i].Maso=0;
    }
}
//int Search(Hashtable &hashtable, int k, int &nprob)
//{
//    int index = k%hashtable.M;
//    if (hashtable.table[index].Maso==k)
//        return 1;
//    else
//    {
//        for (int i=0; i<hashtable.M ; i++ )
//        {
//            nprob++;
//            index = (k%hashtable.M+i*i)%hashtable.M;
//            if (hashtable.table[index].Maso==k)
//                return 1;
//            if (hashtable.table[index].Maso==0)
//                return -1;
//        }
//    }
//}
int hashFunction(int key, int M) {
    return key % M;
}
int quadraticProbing(int key, int i, int M)
{
    return (hashFunction(key, M) + i * i) % M;
}
int Search(Hashtable &ht, int k, int &nprob)
{
    nprob = 0;
    int M = ht.M;
    for (int i = 0; i < M; ++i)
    {

        int index = quadraticProbing(k, i, M);
        if (ht.table[index].Maso == k)
        {
            nprob=i;
            return 1;
        }
        if (ht.table[index].Maso == EMPTY)
        {
            return -1;
        }
    }
    return -1;
}



void DeleteHashtable(Hashtable &hashtable)
{
    delete []hashtable.table;
    hashtable.n=0;
}
void PrintHashtable(Hashtable hashtable)
{
    for (int i=0; i<hashtable.M ; i++ )
    {
        if (hashtable.table[i].Maso>0)
            cout<<i<<"-" << '[' << hashtable.table[i].Maso << ",  " << hashtable.table[i].Hoten << "  , " << hashtable.table[i].Gioitinh << ", " << hashtable.table[i].Namsinh << ", " << hashtable.table[i].TBK << "]\n";
        else
            cout<<i<<"-" <<"[" << hashtable.table[i].Maso <<  ",  " << "  , " << ", " << ", " << "]\n";
    }
}
//###INSERT CODE HERE -
int main()
{
    Hashtable hashtable;

    int m, n, k, nprob;
    Hocsinh hs;

    cin >> m;
    CreateHashtable(hashtable, m);
    for (int i = 0; i < m; i++) {
        Input(hs);
        hashtable.table[i] = hs;
        if (hs.Maso > 0)
            hashtable.n++;
    }
//    PrintHashtable(hashtable);



    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> k;
        if (Search(hashtable, k, nprob) >- 1) {
            cout<<"THAM DO " << nprob << endl;
        }
        else {
            cout<<"KHONG TIM THAY" << endl;
        }
    }
    DeleteHashtable(hashtable);
    return 0;
}
