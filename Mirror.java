class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if(node==null)
        return;
        
        mirror(node.left);
        mirror(node.right);
        //swap(node.left,node.right);
        Node t;
        t=node.left;
        node.left=node.right;
        node.right=t;
    }
}
