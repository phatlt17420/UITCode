#include  <iostream>
using namespace std;

struct DNode
{
    int info;
    DNode *pNext, *pPrev;
};

struct DList
{
    DNode *pHead, *pTail;
};
/////////////////////////////////////////////////////////
void init(DList &L)
{
    L.pHead=L.pTail=NULL;
}
DNode* getDNode(int x)
{
    DNode*p=new DNode;
    p->info=x;
    p->pNext=NULL;
    p->pPrev=NULL;
    return p;
}
void addTail (DList &L, int x)
{
    DNode*p=getDNode(x);
    if (L.pHead==NULL)
        L.pHead=L.pTail=p;
    else
    {
        p->pPrev=L.pTail;
        L.pTail->pNext=p;
        L.pTail=p;
    }
}
void addHead(DList &L, int x)
{
    DNode*p=getDNode(x);
    if (L.pHead==NULL)
        L.pHead=L.pTail=p;
    else
    {
        p->pNext=L.pHead;
        L.pHead->pPrev=p;
        L.pHead=p;
    }
}
void createList(DList &L)
{
    while (1)
    {
        int x;
        cin>>x;
        if (x!=-1)
            addTail(L,x);
        else
            break;

    }
}

void printList(DList L)
{

    if (L.pHead==NULL)
        cout << "List is empty" << endl;
    else
    {
        DNode *p= L.pHead;
        while (p!=NULL)
        {
            cout<<p->info<<" ";
            p=p->pNext;
        }
    }


}
void addAfter (DList &L, int x, int y)
{
    DNode* p =L.pHead;
    while (p!=NULL)
    {
        if (p->info==x)
            break;
        p=p->pNext;
    }
    if (p==NULL)
        cout << "\nCan't find the value "<<x;
    else
    {
        DNode* py = getDNode(y);
        py->pNext=p->pNext;
        py->pPrev = p;
        if(p==L.pTail)
            L.pTail = py;
        else
            p->pNext->pPrev = py;
        p->pNext = py;
    }
}

void addBefore(DList &L, int x, int y)
{
    DNode* p =L.pHead;
    while (p!=NULL)
    {
        if (p->info==x)
            break;
        p=p->pNext;
    }
    if (p==NULL)
        cout << "\nCan't find the value "<<x;
    else
    {
        DNode* py = getDNode(y);

        py->pNext=p;
        py->pPrev=p->pPrev;
        if(p==L.pHead)
            L.pHead=py;
        else

            p->pPrev->pNext=py;
        p->pPrev=py;
    }
}


/////////////////////////////////////////////////////////
int main()
{
    DList L;
    init(L);
    int x,y,choice;

    cout<<"MENU:";
    cout<<"\n1. Create a DList";
    cout<<"\n2. Print the DList";
    cout<<"\n3. Insert a value at the front";
    cout<<"\n4. Insert a value at the end";
    cout<<"\n5. Insert a value after a given value (only for the first value found)";
    cout<<"\n6. Insert a value before a given value (only for the first value found)";
    cout<<"\n7. Insert a value after a given value (for all the same values)";
    cout<<"\n8. Insert a value before a given value (for all the same values)";
    cout<<"\n20. Exit"<<endl;

    while(true)
    {
        cout<<"\n\t\tPLEASE SELECT YOUR CHOICE: ";
        cin>>choice;
        switch(choice)
        {
        case 1:
            cout<<"\nEnter your positive integers until you enter -1 to finish: ";
            createList(L);
            break;
        case 2:
            cout<<"\nYour current DList: ";
            printList(L);
            break;
        case 3:
            cout<<"\nEnter a number: ";
            cin>>x;
            addHead(L,x);
            break;
        case 4:
            cout<<"\nEnter a number: ";
            cin>>x;
            addTail(L,x);
            break;
        case 5:
            cout<<"\nEnter two numbers: ";
            cin>>x>>y;
            addAfter(L,x,y);
            break;
        case 6:
            cout<<"\nEnter two numbers: ";
            cin>>x>>y;
            addBefore(L,x,y);
            break;
        case 20:
            cout<<"\nGOOD BYE";
            return 0;

        }
    }

    return 0;
}
