import java.util.ArrayList;

class InorderTraversal {

    /*
   Problem of the Day :Inorder Traversal
   Link : https://www.geeksforgeeks.org/problems/inorder-traversal/1
   Topic tags : Tree and Data Structure
   Company tags : Amazon, SnapDeal and Adobe

    Example :

    Input: root[] = [1, 2, 3, 4, 5]
    Output: [4, 2, 5, 1, 3]
    Explanation: The in-order traversal of the given binary tree is [4, 2, 5, 1, 3].
   * */

    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    static void inOrder(Node root, ArrayList<Integer> result){
         if(root == null){
             return;
         }

         inOrder(root.left, result);
         result.add(root.data);
         inOrder(root.right, result);
    }
}