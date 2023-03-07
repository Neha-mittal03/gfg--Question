class Solution
{
    int rightLeafSum(Node root)
    {
        // code here
        int sum = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            Node curr = q.peek();
            q.remove();
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                if (curr.right.right == null
                    && curr.right.left == null) {
                    sum += curr.right.data;
                }
                q.add(curr.right);
            }
        }
        return sum;
    }
}
