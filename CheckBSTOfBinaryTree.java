/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*  A Binary Search Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    int isBST(Node root)  
    {
        if(isBSTParam(root, Integer.MIN_VALUE, Integer.MAX_VALUE)){
            return 1;
        }else{
            return 0;
        }
    }
    
    boolean isBSTParam(Node root, int min, int max){
        
        if(root == null){
            return true;
        }
        
        if(root.data < min || root.data > max)
        {
            return false;
        }
        
        return isBSTParam(root.left, min, root.data-1) && isBSTParam(root.right, root.data+1, max);
        
    }
    
}
