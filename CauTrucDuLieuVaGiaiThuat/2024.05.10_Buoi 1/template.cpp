#include <iostream>
using namespace std;
int main()
{

    int n;
    cin>>n;
    int *a=new int[n];
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }

    int m;
    cin>>m;

    for (int i=0; i<m; i++)
    {
        int x;
        cin>>x;
        int flag=0;
        for (int j=0; j<n; j++)
        {
            if (x==a[j])
            {
                cout<<j<<endl;
//                flag = 1;
                break;
            }
        }
        if (i==m-1)
            cout<<-1<<endl;

    }



    return 0;
}
