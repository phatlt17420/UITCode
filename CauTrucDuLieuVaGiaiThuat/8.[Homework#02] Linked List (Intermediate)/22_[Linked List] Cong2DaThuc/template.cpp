/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
[
]
define
include
###End banned keyword*/
#include<iostream>
#include <iomanip>
using namespace std;


struct DONTHUC{
	int somu;
	double heso;
};


struct Node{
	DONTHUC* data;
	Node* next;

};

typedef struct DATHUC{
	Node* head;
	Node* tail;
}List;


//###INSERT CODE HERE -



int main() {
    DATHUC A, B;
    Nhap(A);
    Nhap(B);
    cout << "Da thuc A: "; Xuat(A);
    cout << "\nDa thuc B: "; Xuat(B);
    cout << "\nA+B = "; Xuat(Tong2DaThuc(A, B));
    return 0;
}
