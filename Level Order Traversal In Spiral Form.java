class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        if(root == null)
        return new ArrayList<>();
        // Your code here
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        int c=0;
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> tempList=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
                tempList.add(temp.data);            }
            if(c%2==0){
                Collections.reverse(tempList);
                result.addAll(tempList);
            }
            else{
                result.addAll(tempList);
            }
            c++;
        }
        return result;
    }
}
