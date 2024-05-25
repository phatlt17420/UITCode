#include <iostream>

using namespace std;
void MergeArray(int a[],int na,int b[],int nb)
{
    int i=0;
    int j=0;
    int *c=new int[na+nb];
    int nc=0;
    while (i<na&&j<nb)
    {
        if (a[i] <b[j])
        {
            c[nc]=a[i];
            nc++;
            i++;
        }
        else
        {
            c[nc]=b[j];
            nc++;
            j++;
        }
    }

    while (j<nb)
    {
        c[nc]=b[j];
        nc++;
        j++;
    }
    while (i<na)
    {
        c[nc]=a[i];
        nc++;
        i++;
    }
    int *d=new int [nc];
    for (int i=0; i<nc; i++)
        d[i]=c[i];
    for (int i=0; i<nc; i++)
        cout<<d[i]<< " ";

}


int main()
{
    int na;
    cin>>na;
    int *a=new int[na];
    for(int i=0;i<na;i++)
        cin>>a[i];
    int nb;
    cin>>nb;
    int *b=new int[nb];
    for(int i=0;i<nb;i++)
        cin>>b[i];
    MergeArray(a,na,b,nb);

    return 0;
}
