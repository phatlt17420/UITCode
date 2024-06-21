#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

struct Node{
    int val;
    Node* next;
};

struct List{
    Node *head, *tail;
};

void list_initializing(List &l){
    l.head = l.tail = NULL;
}
//###INSERT CODE HERE -
Node* createnode(int x)
{
    Node *p=new Node;
    p->val=x;
    p->next=NULL;
    return p;
}
void add_tail(List &L, int x)
{
    if(L.head==NULL)
        L.head=L.tail=createnode(x);
    else
    {
        Node *p = createnode(x);
        L.tail->next=p;
        L.tail=p;
    }
}
void copy(List l1, List l2)
{

}

//###INSERT CODE HERE -
int main()
{
    cin.tie(NULL);
    std::ios_base::sync_with_stdio(false);

    List l; list_initializing(l);
    //Read list
    int x;
    do{
        cin >> x;
        add_tail(l, x);
    } while(x != 0);

    List l2; list_initializing(l2);
    copy(l, l2);

    Node*p = l.head, *q = l2.head;
    while(p != NULL){
    	if (p == q || p->val != q->val) cout << "WRONG";
    	cout << p->val << endl;
    	p = p->next;
    	q = q->next;
    }

    return 0;
}
