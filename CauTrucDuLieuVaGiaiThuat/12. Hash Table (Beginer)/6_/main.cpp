#include<vector>
#include<iostream>
using namespace std;

int main()
{
//###INSERT CODE HERE -
    int n;
    cin>>n;
    if(n<=0)
        return 0;
    int x;
    vector <int> vectorA;

    for(int i=0; i<n; i++)
    {
        cin>>x;
        vectorA.push_back(x);
    }
    vector<bool> bools(n+1,false);
    for(int i:vectorA)
        if(i>=0)
            bools[i]=true;
    for(int i=0; i<bools.size(); i++)
    {
        if(bools[i]==false)
        {
            cout<<i;
            return 0;
        }
    }
    cout<<n+1;
//###INSERT CODE HERE -
    return 0;

}




//
//
//#include <vector>
//#include <iostream>
//using namespace std;
//
//int main() {
//    int n;
//    cin >> n;
//
//    if (n <= 0) {
//        cout << 0 << endl;
//        return 0;
//    }
//
//    int* a = new int[n];
//    for (int i = 0; i < n; i++) {
//        cin >> a[i];
//    }
//    vector<bool> present(n + 1, false);
//
//    for (int i = 0; i < n; i++) {
//        if (a[i] >= 0 && a[i] <= n) {
//            present[a[i]] = true;
//        }
//    }
//
//    for (int i = 0; i <= n; i++) {
//        if (!present[i]) {
//            cout << i << endl;
//            return 0;
//        }
//    }
//
//    cout << n + 1 << endl;
//    return 0;
//}
