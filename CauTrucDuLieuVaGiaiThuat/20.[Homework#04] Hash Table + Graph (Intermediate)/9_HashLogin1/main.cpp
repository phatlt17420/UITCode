#include <iostream>
#include <map>
#include <string.h>
using namespace std;

int main()
{
    int N,Q;
    cin>>N>>Q;
    cin.ignore();
    map<string,string> mapping;
    string user;
    string password;
    for (int i=0;i<N ;i++ )
    {
cin>>user>>password;
        mapping[user]=password;
    }

//    for(auto &it: mapping)
//    {
//        cout<<it.first<<" " <<it.second<<endl;
//    }


     for (int i=0;i<Q;i++ )
     {
        string check_pass;
        getline(cin>>ws,check_pass);
        if(mapping.find(check_pass)!=mapping.end())
            cout<<mapping[check_pass]<<endl;
        else
            cout<<"Chua Dang Ky! "<<endl;
     }



    return 0;
}
