class HeightOfTheTree {
    /*
   Problem of the Day : Height of Binary Tree
   Link : https://www.geeksforgeeks.org/problems/height-of-binary-tree/1
   Topic tags : Tree and Data Structure
   Company tags : Amazon

    Example :

    Input: root[] = [12, 8, 18, 5, 11]
    Output: 2
    Explanation: One of the longest path from the root (node 12) goes through node 8 to node 5,
    which has 2 edges.
   * */

    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    // Function to find the height of a binary tree.
    int height(Node node) {

         if(node == null){
             return -1;
         }

         int leftHeight = height(node.left);
         int rightHeight = height(node.right);

         return Math.max(leftHeight, rightHeight) + 1;
    }
}