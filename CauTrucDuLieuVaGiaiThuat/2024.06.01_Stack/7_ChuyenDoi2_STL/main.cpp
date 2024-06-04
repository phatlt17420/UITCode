/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
###End banned keyword*/

#include <iostream>
#include <stack>
using namespace std;
int main()
{
    stack<int> S;
    int n;
    cin>>n;
    if (n==0)
        S.push(0);
    while (n!=0)
    {
        int k = n%2;
        S.push(k);
        n=n/2;
    }


    while (!(S.empty()))
    {
        cout<<S.top();
        S.pop();
    }

    return 0;
}




