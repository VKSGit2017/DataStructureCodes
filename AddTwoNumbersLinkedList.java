/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/
class GfG
{
	int carryForwardVal = 0;
	Node addTwoLists(Node first, Node second)
	{
	   int sumOfTwoDataNode = 0;
	   if(null == first && null == second){
	       return null;
	   }
	   
	   Node root = null, currNode = null;
	   Node tmpNode;
	   while(first != null && second != null){
	       sumOfTwoDataNode = carryForwardVal + first.data + second.data;
	       carryForwardVal = 0;
	       if(sumOfTwoDataNode/10 > 0){
	           carryForwardVal = sumOfTwoDataNode/10;
	           sumOfTwoDataNode = sumOfTwoDataNode%10;
	       }
	       tmpNode = new Node();
	       tmpNode.data = sumOfTwoDataNode;

	       tmpNode.next = null;
	       if(root != null){
	           currNode.next = tmpNode;
	           currNode = tmpNode;
	       }else{
	          root= tmpNode; 
	          currNode = tmpNode;
	       }
	       
	       
	       first = first.next;
	       second= second.next;
	       sumOfTwoDataNode = 0;
	   }
	   
	   while(first != null){
	       sumOfTwoDataNode = carryForwardVal + first.data;
	       carryForwardVal = 0;
	       
	       if(sumOfTwoDataNode/10 > 0){
	           carryForwardVal = sumOfTwoDataNode/10;
	           sumOfTwoDataNode = sumOfTwoDataNode%10;
	       }
	       tmpNode = new Node();
	       tmpNode.data = sumOfTwoDataNode;
	       tmpNode.next = null;
	       
	        if(root != null){
	           currNode.next = tmpNode;
	           currNode = tmpNode;
	       }else{
	          root= tmpNode; 
	          currNode = tmpNode;
	       }
	       
	       first = first.next;
	       sumOfTwoDataNode =0;
	   }
	   
	   while(second != null){
	       sumOfTwoDataNode = carryForwardVal + second.data;
	       
	       carryForwardVal = 0;
	       if(sumOfTwoDataNode/10 > 0){
	           carryForwardVal = sumOfTwoDataNode/10;
	           sumOfTwoDataNode = sumOfTwoDataNode%10;
	       }
	       tmpNode = new Node();
	       tmpNode.data = sumOfTwoDataNode;
	       tmpNode.next = null;
	       
	        if(root != null){
	           currNode.next = tmpNode;
	           currNode = tmpNode;
	       }else{
	          root= tmpNode; 
	          currNode = tmpNode;
	       }
	       
	       second= second.next;
	       sumOfTwoDataNode =0;
	   }
	   
	   
	   if(carryForwardVal > 0){
	       tmpNode = new Node();
	       tmpNode.data = carryForwardVal;
	       tmpNode.next = null;
	       
	        if(root != null){
	           currNode.next = tmpNode;
	           currNode = tmpNode;
	       }else{
	          root= tmpNode; 
	          currNode = tmpNode;
	       }
	   }
	   
	   return root;
	   
	   
	}
}
