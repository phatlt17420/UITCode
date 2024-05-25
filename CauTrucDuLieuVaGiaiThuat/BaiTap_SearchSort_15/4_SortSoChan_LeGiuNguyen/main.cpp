#include <iostream>
using namespace std;
void sort(int *arr, int n)
{
    for(int i=0; i<n; i++)
    {
        if (!(arr[i]%2!=0))
        {
            int Min=i;
            for(int j = i+1; j<n; j++)
            {
                if (!(arr[j]%2!=0))
                {
                    if (arr[j]<arr[Min])
                        Min=j;
                }
            }
            swap(arr[i],arr[Min]);
        }
    }
}

int main()
{
    int *a, n;
    cin >> n;
    a = new int [n];

    for(int i = 0; i < n; i ++)
    {
        cin >> a[i];
    }
    sort(a, n);

    for(int i = 0; i < n; i ++)
    {
        cout << a[i] << " ";
    }
}
