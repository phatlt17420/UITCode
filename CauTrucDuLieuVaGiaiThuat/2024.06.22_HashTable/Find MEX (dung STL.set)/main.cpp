/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
sort
stable_sort
partial_sort
partial_sort_copy
sort_heap
map
vector
###End banned keyword*/


#include<set>
#include<iostream>
using namespace std;

int main()
{
    set<int> b; // tập hợp
    //###INSERT CODE HERE -

    int n,x;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>x;
        b.insert(x); // bỏ giá trị x vào set b
    }
    for(int i=0;i<=n;i++)
    {
        if(b.find(i)==b.end())  // tra trên Cplusplus // trả về là con trỏ : end()

        {
            cout<<i;
            break;
        }
    }


    //###INSERT CODE HERE -
    return 0;

}



