/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
###End banned keyword*/

#include <iostream>
#include <vector>
using namespace std;

// ###INSERT CODE HERE -
void inputGraph(vector<vector<int>> &G, int v, int e)
{
    G = vector<vector<int>>(v, vector<int>(v, 0)); // cấp phát vùng nhớ
    for (int i = 0; i < e; i++)
    {
        int x, y;
        cin >> x >> y;       // nhập 2 cạnh (x,y)
        G[x - 1][y - 1] = 1; // lưu thông tin cạnh vào ma trận kề (bài yêu cầuquy ước bắt đầu bằng 1)
        G[y - 1][x - 1] = 1;
    }
}
void process(vector<vector<int>> G, int v, int n)
{
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        if (x == 1) // kiem tra 2 đỉnh có kề
        {
            int y, z;
            cin >> y >> z; // kiểm tra z có kề với y không
            if (G[y - 1][z - 1] == 1)
                cout << "TRUE";
            else
                cout << "FALSE";
        }
        else // liệt kê các đỉnh kề của đỉnh cho trước là y
        {
            int y;
            cin >> y;
            int flag = 0;
            for (int i = 0; i < v; i++)
                if (G[y - 1][i] == 1)
                {
                    flag = 1;
                    cout << i + 1 << " "; // là đỉnh kề của y.
                }
            if (flag == 0)
                cout << "NONE";
        }
        cout << endl;
    }
}
// ###INSERT CODE HERE -
int main()
{

    int v, e, n;
    cin >> v >> e >> n; // v: số đỉnh, e: số cạnh, n: số thao tác
    vector<vector<int>> G;

    inputGraph(G, v, e);
    process(G, v, n);

    return 0;
}
