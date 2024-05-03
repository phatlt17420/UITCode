#include <iostream>
using namespace std;
class A
{
private:
    int iprivateCha;

protected:
    int iprotectedCha;

public:
    int ipublicCha;
};
class B : private A
{
private:
protected:
public:
};

int main()
{

    system("pause");
    return 0;
}