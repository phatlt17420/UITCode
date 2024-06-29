#include<iostream>
using namespace std;
void inputGraph(bool*[], int);
void process(bool*[], int, int);
int main()
{
    int v, e, n; //v: số đỉnh, e: số cạnh, n: số thao tác
    cin >> v >> e >> n;
    bool **G; // ma trận toàn số 0, 1 nên kiểu bool hay int đều được

    //###INSERT CODE HERE -
// Bước 1: cấp phát bộ nhớ cho ma trận kề
    G=new bool*[v]; // cấp phát bộ nhớ cho mảng các con trỏ.
    for(int i=0; i<v; i++)
        G[i]=new bool[v]; // cấp phát bộ nhớ cho mảng 2 chiều
    for(int i=0; i<v; i++)
    for(int j=0; j<v; j++)
        G[i][j]=0;
////Bước 3: nhập e cạnh:
    inputGraph(G,e);
//    for (int i=0; i<e; i++)
//    {
//        int x,y;
//        cin>>x>>y; // nhập 2 cạnh (x,y)
//        G[x-1][y-1]=1;//lưu thông tin cạnh vào ma trận kề (bài yêu cầuquy ước bắt đầu bằng 1)
//    }
////Bước 4: Xuất ma trận kề
//    for(int i=0; i<v; i++)
//    {
//        for(int j=0; j<v; j++)
//            cout<<G[i][j]<< " " ;
//        cout<<endl;
//    }
process(G, v,n);



    return 0;
}
void inputGraph(bool*G[], int e)
{
    //Bước 3: nhập e cạnh:
    for (int i=0; i<e; i++)
    {
        int x,y;
        cin>>x>>y; // nhập 2 cạnh (x,y)
        G[x-1][y-1]=1;//lưu thông tin cạnh vào ma trận kề (bài yêu cầuquy ước bắt đầu bằng 1)
    }
}
void process(bool*G[], int v, int n)
{
    for (int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        if(x==1) // kiem tra 2 đỉnh có kề
        {
            int y,z;
            cin>>y>>z; // kiểm tra z có kề với y không
            if (G[y-1][z-1]==1)
                cout<<"TRUE";
            else
                cout<<"FALSE";
        }
        else // liệt kê các đỉnh kề của đỉnh cho trước là y
        {
            int y;
            cin>>y;
            int flag=0;
            for(int i=0; i<v; i++)
                if(G[y-1][i]==1)
                {
                    flag=1;
                    cout<<i+1<<" "; // là đỉnh kề của y.
                }
            if(flag==0)
                cout<<"NONE";

        }
        cout<<endl;
    }
}

//###INSERT CODE HERE -
