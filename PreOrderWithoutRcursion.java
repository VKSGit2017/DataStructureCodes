package vk.code.trees.traversal;

import java.util.Stack;

public class PreOrderWithoutRcursion {

	static class BinaryTreeNode{
		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;
		
		public BinaryTreeNode(int data,BinaryTreeNode left, BinaryTreeNode right){
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	public static void main(String[] args) {
		
		
		BinaryTreeNode leafNode = new BinaryTreeNode(4, null, null);
		BinaryTreeNode leafNode1 = new BinaryTreeNode(5, null, null);
		BinaryTreeNode leafNode2 = new BinaryTreeNode(6, null, null);
		BinaryTreeNode leafNode3 = new BinaryTreeNode(7, null, null);
		
		BinaryTreeNode levelNode1 = new BinaryTreeNode(2, leafNode, leafNode1);
		BinaryTreeNode levelNode2 = new BinaryTreeNode(3, leafNode2, leafNode3);
		
		BinaryTreeNode rootNode = new BinaryTreeNode(1, levelNode1, levelNode2);
		
		PreOrderWithoutRecursion(rootNode);	

	}
	
	public static void PreOrderWithoutRecursion(BinaryTreeNode root){
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			BinaryTreeNode currentNode = s.pop();
			System.out.print(currentNode.data + " ");
			if(currentNode.right != null){
				s.push(currentNode.right);
			}
			if(currentNode.left != null){
				s.push(currentNode.left);
			}		
		}		
	}
}
