package vk.code.linkedList.javaCode;

public class InsertIntoSortedLinkedList {

	
	
	
	static class Node
	{
		int data;
		Node next;
	}
	
	public static void main(String[] args){
		
        Node new_node;
        new_node = createNewNode(5);
        
        sortedInsert(new_node, 10);        
        sortedInsert(new_node,7);       
        sortedInsert(new_node,3);  
        sortedInsert(new_node,1);
        sortedInsert(new_node,9);

        System.out.println("Created Linked List");
        printList(new_node);
	}
	public static void sortedInsert(Node head, int data)
	{
	   Node newNode = createNewNode(data);
	   if(head == null){
	       head = newNode;
	   }else{
	       Node prevNode = null, nextNode = head;
	       while(nextNode != null && nextNode.data < data){
	           prevNode = nextNode;
	           nextNode= nextNode.next;
	       }
	       if(prevNode != null){
	    	   newNode.next = nextNode;
	    	   prevNode.next = newNode;
	       }
	       
	   }
	   
	}

	public static Node createNewNode(int data){
	    Node newNode = new Node();
	    newNode.data = data;
	    newNode.next=null;
	    return newNode;
	}
	
	public static void printList(Node head){
		while(head != null){
			if(head.next != null){
				System.out.print(head.data + "->");
			}else{
				System.out.print(head.data);
			}
			
			head= head.next;
		}
		
		
	}
	


}
