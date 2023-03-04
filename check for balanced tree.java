class Tree
{
    boolean isBalanced(Node root)
    {
	if(root==null)
	return true;
	int m= height(root.left);
	int n=height(root.right);
	if(Math.abs(m-n)<=1 && isBalanced(root.left) && isBalanced(root.right)){
	return true;
    }
	return false;
    }
     int height(Node node) 
    {
        
        if(node==null)
        return 0;
        return Math.max(height(node.left)+1,height(node.right)+1);
    }
}
