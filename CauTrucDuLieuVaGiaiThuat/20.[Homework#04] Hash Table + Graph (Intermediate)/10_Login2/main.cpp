#include <iostream>
#include <map>
#include <string.h>
using namespace std;

int main()
{
    int N,Q;
    cin>>N>>Q;
    cin.ignore();
    multimap<string,string> mapping;
    string user;
    string password;
    for (int i=0; i<N ; i++ )
    {
        cin>>user>>password;
        mapping.insert({user,password});
    }

//    for(auto &it: mapping)
//    {
//        cout<<it.first<<" " <<it.second<<endl;
//    }


    for (int i=0; i<Q; i++ )
    {
        string check_pass;
        cin>>check_pass;
        if(mapping.find(check_pass)!=mapping.end())
        {
            auto range = mapping.equal_range(check_pass);
            for (auto it=range.first; it!=range.second; it++)
                cout<<it->second<<" ";
            cout<<endl;
        }
        else
            cout<<"Chua Dang Ky!"<<endl;
    }



    return 0;
}
