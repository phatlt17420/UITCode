#include <iostream>
#include <utility>
using namespace std;

int main()
{
    // CÚ PHÁP KHAI BÁO
    pair<string,int> pairnames ("Phat",32);
    pair <string, int> Pairnames = make_pair("Phat",20);
    // pair lồng nhau
    pair<int, pair<string, string>> pairLongNhau = make_pair(24,make_pair("Test", "Thu"));
cout<<pairLongNhau.first<<endl;
cout<<pairLongNhau.second.second<<endl;
  //  cout<<pairnames.first<<" "<<pairnames.second;
    return 0;
}
