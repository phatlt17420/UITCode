/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
###End banned keyword*/

#include <iostream>
#include <cstring>
#include <string>
#include <set>

#define EMP -1 //cho biet vi tri rong
#define DEF -2 //cho biet vi tri da duoc xoa
#define TABLE_SIZE 13// Kich thuoc mang = so dia chi tren bang bam
#define PRIME 7// so nguyen to dung trong ham bam thu 2
using namespace std;

//Dinh nghia cau truc bang bam, xu ly xung dot bang phuong phap bam kep
struct DoubleHash
{
	int* hashTable; //con tro quan ly mang dong
	int curr_size; // so phan tu cua bang bam = so gia tri (khac -1, -2) duoc luu tru trong bang bam
};
//Ham kiem tra bang bam co day chua
bool isFull(DoubleHash h)
{
	return (h.curr_size == TABLE_SIZE); //khi so phan tu bang kich thuoc mang
}

//Ham kiem tra bang bam co rong khong
bool isEmpty(DoubleHash h)
{
    return (h.curr_size == 0); //khi so phan tu bang 0
}

// Ham bam thu 1
int hash1(int key)
{
    return (key % TABLE_SIZE);
}

// Ham bam thu 2
int hash2(int key)
{
    return (PRIME - (key % PRIME));
}
//Ham in bang bam
void displayHash(DoubleHash h)
{
    for (int i = 0; i < TABLE_SIZE; i++)
    {
        //if (h.hashTable[i] != -1)
        if (h.hashTable[i] > -1)
            cout << i << " --> "
                << h.hashTable[i] << endl;
        else
            cout << i << endl;
    }
}
//###INSERT CODE HERE -
void InitDoubleHash(DoubleHash &h)
{
    h.curr_size=0;
    h.hashTable=new int[TABLE_SIZE];
    for (int i=0;i<TABLE_SIZE ;i++ )
    {
    h.hashTable[i]=EMP;
    }
}
void insertDoubleHash(DoubleHash &h,int key)
{
    if (isFull(h))
    {
        cout<<"Hash table is full, ";
        cout << key << " not inserted" << endl;
    }
    else
    {
        int index1=hash1(key);
        int index2=hash2(key);
        if(h.hashTable[index1]==EMP)
            {
            h.hashTable[index1]=key;
            h.curr_size++;
            }
        else
        {
            int i=1;
            int index3;
            do
            {
                index3= (index1+i*index2)%TABLE_SIZE;
                if (h.hashTable[index3]==EMP)
                    break;
                i++;

            } while (1);
            h.hashTable[index3]=key;
            h.curr_size++;

        }

    }
}


//###INSERT CODE HERE -
int main()
{
    DoubleHash h;
    InitDoubleHash(h);

    int n,x;cin>>n; // n la so luong gia tri can phai luu tru
    for (int i = 1; i<=n;i++)
    {
        cin>>x;
        insertDoubleHash(h,x); // them 1 gia tri du lieu vao bang bam
    }

    cout<<"\nDisplay the hash:"<<endl;
    displayHash(h);

    return 0;
}

