#include <iostream>

using namespace std;
void saoChep(int a[], int &na,int b[],int nb){
    for(int i=0;i<nb;i++)
        {a[i]=b[i];
    na++;}
}
int main()
{
    int a[1000];
    int na;
    int b[]={1,2,3,4,5};
    int nb=5;
    saoChep(a,na,b,nb);
    for(int i=0;i<na;i++)
    cout<<a[i]<<" ";
    return 0;
}
