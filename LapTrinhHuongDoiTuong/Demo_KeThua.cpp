#include <iostream>
using namespace std;
class Cha
{
private:
    int iprivate;

protected:
    int iprotected;

public:
    int ipublic;
};

int main()
{

    Cha p;
    p.publicCha();

    system("pause");
    return 0;
}