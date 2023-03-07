class Solution{
	Node nextRight(Node root, int k)
    {
		//Write your code here
	if (root == null)
            return null;
        Node res = null;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            int s=0;
            for (int i = 0; i < n; i++) {
                Node temp = q.peek();
                q.poll();
                if (temp.data == k){
                    s=1;
                    res=temp;
                }
                if(s==1 && res!= temp){
                    return temp;
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if (temp.right != null){
                    q.add(temp.right);
               }
            }
        }
        return new Node(-1);
    }
}
