class Solution {
  public static int maxDepth(Node root) {
    // code here
if(root==null){
return 0;
}
if(root.left==null && root.right==null){
return 1;
}
if(root.left==null){
return maxDepth(root.right)+1;
}
if(root.right==null){
return maxDepth(root.left)+1;
}
return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
  }
}
    
