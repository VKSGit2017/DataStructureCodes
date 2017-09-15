class Node{
    char data;
    Node left;
    Node right;
    
    Node(char data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    Node(){

    }
}

public class BinaryTreeFromInorderAndPreorder{
    
    private static int preOrderIndex = 0;
    
    public static void main(String[] arg){
        
        char[] inOrderBT = {'D', 'B','E', 'A', 'F','C'};
        char[] preOrderBT = {'A','B','D','E','C','F'};
        
        Node rootBT = buildTreeFromInorderAndPreorder(inOrderBT, preOrderBT, 0, (inOrderBT.length-1) );
        if(rootBT != null){
            printTree(rootBT);
        }else{
            System.out.println("Not able to form tree using InOrder and PreOrder");
        }
        
    }
    public static Node buildTreeFromInorderAndPreorder(char[] inOrderBTArr, char[] preOrderBT, int stIndex, int endIndex){
        Node rootNode = null;
        if(stIndex > endIndex){
            return null;
        }
        
        if(preOrderIndex < preOrderBT.length){
            rootNode = new Node(preOrderBT[preOrderIndex++]);
            
            if(stIndex == endIndex){
                return rootNode;
            }
            
            int inOrderIndex = findInorderIndex(inOrderBTArr, stIndex, endIndex, rootNode.data);
            
            rootNode.left = buildTreeFromInorderAndPreorder(inOrderBTArr, preOrderBT, stIndex , inOrderIndex-1);
            rootNode.right = buildTreeFromInorderAndPreorder(inOrderBTArr, preOrderBT, inOrderIndex+1 , endIndex);
        }
        return rootNode;
        
    }
    
    public static int findInorderIndex(char[] inOrderBTArr, int stIndex, int endIndex, char data){
        int inOrderIndex = -1;
        for(int i = stIndex; i<endIndex; i++){
            if(inOrderBTArr[i] == data){
                inOrderIndex = i;
                return inOrderIndex;
            }
        }
        return inOrderIndex;
    }
    
    public static void printTree(Node rootBT){
        if(rootBT != null){
            printTree(rootBT.left);
            System.out.print(rootBT.data + " ");
            printTree(rootBT.right);
        }
    }
}
