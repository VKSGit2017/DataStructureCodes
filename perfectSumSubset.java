import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	private static int givenTotal = 0;
	private static int stackSum = 0;
	private static Stack<Integer> subsetStack = new Stack<Integer>();
	private static int perfectSubsetCount = 0;
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		//System.out.println(testCase);
		while(testCase > 0){
		    int arrLen = in.nextInt();
		    //System.out.println(arrLen);
		    int[] arrInput = new int[arrLen];
		    for(int i =0; i< arrLen ; i++){
		        arrInput[i] = in.nextInt(); 
		        //System.out.print(arrInput[i] + " ");
		    }
		    
		    givenTotal = in.nextInt();
		    //System.out.println("\n" + givenTotal);
		    
		    /*System.out.println("perfectSubsetCount:" + perfectSubsetCount + ",stackSum:"
		                       + stackSum + ",givenTotal:" + givenTotal);*/
		    perfectSumSubset(arrInput, 0, arrLen);
		    System.out.println(perfectSubsetCount);
		    
		    givenTotal = stackSum = perfectSubsetCount = 0;
		    testCase--;
		}
		
	}
	
	
	static void perfectSumSubset(int[] arrInput, int startIndex, int endIndex){
	    
	    if(stackSum == givenTotal){
	        perfectSubsetCount++;
	        //System.out.println("perfectSubsetCount:" + perfectSubsetCount);
	        //stackSum = 0;
	    }
	    
	    for(int lp = startIndex ; lp< endIndex ; lp++){
	        if((stackSum + arrInput[lp])  <= givenTotal) {
	            subsetStack.push(arrInput[lp]);
	            stackSum += arrInput[lp];
	            //System.out.println("lp:"+ lp + ",arrInput[lp]:" + arrInput[lp] + ",stackSum:" + stackSum);
	        
	            perfectSumSubset(arrInput, lp+1, endIndex);
	            stackSum -= subsetStack.pop();
	            //System.out.println("stackSum:" + stackSum);
	        }
	    }
	}
}
