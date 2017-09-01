/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
    void levelOrder(Node node) 
    {
        if(null == node){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        Node tempNode;
        while(!q.isEmpty()){
            
            tempNode = q.poll();
            System.out.print(tempNode.data + " ");
            
            if(tempNode.left != null){
                q.add(tempNode.left);
            }
            
            if(tempNode.right != null){
                q.add(tempNode.right);
            }
            
        }
    }
}
