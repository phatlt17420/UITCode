/*###Begin banned keyword - each of the following line if appear in code will raise error. regex supported
define
include
using
std
preOrder
###End banned keyword*/

#include <bits/stdc++.h>
using namespace std;


class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

class Solution {
    public:

    void preOrder(Node *root) {
//###INSERT CODE HERE -


    /* SV phai viet ca ham insert
    Node* insert(Node* root, int data);
     */

}; //End of Solution

int main() {

    Solution myTree;
    Node* root = NULL;

    int t;
    int data;

    std::cin >> t;

    while(t-- > 0) {
        std::cin >> data;
        root = myTree.insert(root, data);
    }

    myTree.preOrder(root);

    return 0;
}
