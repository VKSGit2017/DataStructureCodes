import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while(testCases > 0){
		    int num = in.nextInt();
		    int[] arrInput = new int[num];
		    for(int i=0; i<num; i++){
		        arrInput[i] = in.nextInt();
		    }
		    int start = 0;
		    int end = num-1;
		    
		    boolean isBST = isBSTUsingStack(arrInput, end);
		    if(isBST){
		        printPostOrderFromPreOrder(arrInput, start, end);
		    }else{
		        System.out.print("NO");
		    }
		    System.out.println();
		    
		    testCases--;
		}
	}
	
	
	public static boolean isBSTUsingStack(int[] arr,int n){
	    Stack<Integer> s = new Stack<>();
        int root=Integer.MIN_VALUE;
        for(int i=0;i<n;++i)
        {
            if(arr[i]<root)
                return false;

            while(!s.empty() && arr[i]>s.peek())
            {
                root=s.pop();
            }
            s.push(arr[i]);
        }
        return true;
	}
	
	public static void printPostOrderFromPreOrder(int[] arrInput, int start, int end){
	    if(start > end){
	       return;
	    }    
	    if(start == end){
	       System.out.print(arrInput[start] + " ");
	       return;
	    }
	   
	    int rootData = arrInput[start];
	    for(int loop = start + 1; loop <= end ; loop++){
	        if(arrInput[loop] > rootData){
	          printPostOrderFromPreOrder(arrInput, (start+1), loop-1);
	          printPostOrderFromPreOrder(arrInput, loop, end);
	          System.out.print(rootData + " ");
	          break;
	        }
	        if(loop == end){
	            printPostOrderFromPreOrder(arrInput, (start+1), end);
	            System.out.print(rootData + " ");
	            break;
	        }
	    }
	}
}
