class Solution{
     public int minLeafSum(Node root){
        //code here
        if (root == null)
        return 0;
        if (root.left == null && root.right == null)
        return root.data;
      
      Queue<Node> q = new LinkedList<>();
    int sum = 0;
    boolean f = false;
    q.add(root);
 
    while (f == false)
    {
        int n = q.size();
        while (n-- >0)
        {
            Node top = q.peek();
            q.remove();
            if (top.left == null &&
                top.right == null)
            {
                sum += top.data;
                f = true;
            }
            else
            {
                if (top.left != null)
                    q.add(top.left);
                if (top.right != null)
                    q.add(top.right);
            }
        }
    }
    return sum;
    }
}
