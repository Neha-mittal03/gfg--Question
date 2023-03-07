class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        if (root == null)
        return 0;
        
         int result = root.data;
          Queue<Node> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) 
    {
          
        
        int count = q.size();
        int sum = 0;
        while (count-- > 0)
        {
            Node temp = q.poll();
            sum = sum + temp.data;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        result = Math.max(sum, result);
    }
    return result;
    }
}
