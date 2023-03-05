class Tree
{
    //Function to return list containing elements of left view of binary tree.
    
    ArrayList<Integer> leftView(Node root){
    ArrayList<Integer> result=new ArrayList<>();
    Queue<Node> q=new LinkedList<>();
  
    
          q.add(root);
      // Your code here
      if(root==null){
          return result;
      }
      while(!q.isEmpty()){
          int s=q.size();
          for(int i=0;i<s;i++){
              Node t=q.poll();
              if(i==0)
              result.add(t.data);
              if(t.left!=null)
              q.add(t.left);
              if(t.right!=null)
              q.add(t.right);
          }
      }
      return result;
    }
}
