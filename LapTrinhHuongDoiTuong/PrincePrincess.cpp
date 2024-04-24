#include <iostream>
using namespace std;
class Gate
{
private:
    int money;
    int intelligent;
    int strength;

public:
    Gate();
    virtual void InputGate();
    virtual void OutputGate();
    void SetMoney(int);
    void SetIntelligent(int);
    void SetStrength(int);
    int GetMoney();
    int GetIntelligent();
    int GetStrength();
};
Gate::Gate()
{
    this->money = 0;
    this->intelligent = 0;
    this->strength = 0;
}
void Gate::InputGate() {};

void Gate::OutputGate()
{
    cout << "So tien can thiet: " << this->money << endl;
    cout << "So thong minh can thiet: " << this->intelligent << endl;
    cout << "So suc manh can thiet: " << this->strength << endl;
}
void Gate::SetMoney(int a)
{
    this->money = a;
}
void Gate::SetIntelligent(int a)
{
    this->intelligent = a;
}
void Gate::SetStrength(int a)
{
    this->strength = a;
}
int Gate::GetMoney()
{
    return this->money;
}
int Gate::GetIntelligent()
{
    return this->intelligent;
}
int Gate::GetStrength()
{
    return this->strength;
}

#pragma region Commercial Gate
class BusinessGate : public Gate
{
private:
    int donGia;
    int soHang;

public:
    void InputGate();
    void OutputGate();
};
void BusinessGate::InputGate()
{
    cout << "Nhap So Hang: ";
    cin >> this->soHang;
    cout << "Nhap Don Gia: ";
    cin >> this->donGia;
    int a = this->donGia * this->soHang;
    SetMoney(a);
}
void BusinessGate::OutputGate()
{
    cout << "Money cua Cong:" << this->GetMoney() << endl;
    cout << "Intelligent cua Cong:" << this->GetIntelligent() << endl;
    cout << "Strength cua cong:" << this->GetStrength() << endl;
}
#pragma endregion
#pragma region Academic Gate
class AcademicGate : public Gate
{
private:
public:
    void InputGate();
};
void AcademicGate::InputGate()
{
    int a;
    cout << "Nhap Intelligent cua Gate: ";
    cin >> a;
    this->SetIntelligent(a);
}
#pragma endregion
#pragma region Power Gate
class PowerGate : public Gate
{
private:
public:
    void InputGate();
};
void PowerGate::InputGate()
{
    cout << "Nhap Strength cua Cong: ";
    int a;
    cin >> a;
    this->SetStrength(a);
}

#pragma endregion

#pragma region Prince
class Prince
{
private:
    int moneyPrince;
    int intelligentPrince;
    int strenghtPrince;

public:
    Prince();
    void InputPrince();
    void OutPrince();
    void SetmoneyPrince(int);
    void SetintelligentPrince(int);
    void SetstrengthPrince(int);
    int GetmoneyPrince();
    int GetintelligentPrince();
    int GetstrengthPrince();
};
Prince::Prince()
{
    this->moneyPrince = 0;
    this->intelligentPrince = 0;
    this->strenghtPrince = 0;
}
void Prince::InputPrince()
{
    cout << "Nhap chi So Money cua Prince: ";
    cin >> this->moneyPrince;
    cout << "Nhap chi so intelligent cua Prince: ";
    cin >> this->intelligentPrince;
    cout << "Nhap chi so Strength cua Prince: ";
    cin >> this->strenghtPrince;
}
void Prince::SetmoneyPrince(int a)
{
    this->moneyPrince = a;
}
void Prince::SetintelligentPrince(int a)
{
    this->intelligentPrince = a;
}
void Prince::SetstrengthPrince(int a)
{
    this->strenghtPrince = a;
}
int Prince::GetmoneyPrince()
{
    return this->moneyPrince;
}
int Prince::GetintelligentPrince()
{
    return this->intelligentPrince;
}
int Prince::GetstrengthPrince()
{
    return this->strenghtPrince;
}

void Prince::OutPrince()
{
    cout << "So money cua Prince: " << this->moneyPrince;
    cout << "So intelligent cua Prince: " << this->intelligentPrince;
    cout << "So strength cua Prince: " << this->strenghtPrince;
}
#pragma endregion

class GamesStart
{
private:
    Gate **g;
    Prince p;
    int n;

public:
    void GreatGate();
    void GreatPrince();
    void Do();
};
void GamesStart::GreatGate()
{

    cout << "Nhap so Gate can tao: ";
    cin >> this->n;
    g = new Gate *[n];

    for (int i = 0; i < n; i++)
    {
        cout << "(1: CommercicalGate; 2: IntelligentGate; 3: PowerGate). Nhap loai cong can tao: ";
        int TypeGate;
        cin >> TypeGate;
        if (TypeGate == 1)
        {
            g[i] = new BusinessGate();
            g[i]->InputGate();
        }
        else if (TypeGate == 2)
        {
            g[i] = new AcademicGate();
            g[i]->InputGate();
        }
        else if (TypeGate == 3)
        {
            g[i] = new PowerGate();
            g[i]->InputGate();
        }
    }
}
void GamesStart::GreatPrince()
{
    p.InputPrince();
}
void GamesStart::Do()
{
    bool a = true;
    for (int i = 0; i < n; i++)
    {
        p.SetmoneyPrince(p.GetmoneyPrince() - g[i]->GetMoney());
        p.SetstrengthPrince(p.GetstrengthPrince() - g[i]->GetStrength());
        if (g[i]->GetIntelligent() > p.GetintelligentPrince())
            a = false;
    }
    if (p.GetstrengthPrince() > 0 && p.GetmoneyPrince() > 0 && a == true)
        cout << "Hoang Tu Cuu duoc cong chua" << endl;
    else
        cout << "Khong cuu duoc" << endl;
}

int main()
{
    GamesStart p1;

    p1.GreatGate();
    p1.GreatPrince();
    p1.Do();

    system("pause");
    return 0;
}