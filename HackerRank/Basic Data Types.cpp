#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> so = {1, 2, 3, 4, 5};
    vector<int>::iterator it = so.begin();
    // for (vector<int>::iterator it = so.rbegin(); it != so.rend(); it++)
    // {
    //     cout << *it << " ";
    // }
    it += 2;
    cout << it - so.begin() << endl;
    cout << distance(so.begin(), it);

    cout << endl;
    system("pause");
    return 0;
}