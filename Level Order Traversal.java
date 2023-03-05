class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node)
   
    
    {
          ArrayList<Integer> result=new ArrayList<>();
    Queue<Node> q=new LinkedList<>();
        // Your code here
        q.add(node);
        while(!q.isEmpty()){
            int s= q.size();
            for(int i=0;i<s;i++){
                Node t=q.poll();
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



