import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		while(testCases> 0)
		{
		    int arrLen = s.nextInt();
		    int givenSum = s.nextInt();
		    int[] numArry = new int[arrLen];
		    for(int i =0; i< arrLen; i++){
		        numArry[i] = s.nextInt();
		    }
		    
		    //subarray postion where sum of elements are equal to givenSum
		    subarrayPosition(numArry, arrLen, givenSum);
		    
		    System.out.println();
		    testCases--;
		}
	}
	
	public static void subarrayPosition(int[] numArry, int arrLen, int givenSum){
	    int curSum = 0, subStart =0, endStart = 0;
	    boolean subArrayFound = false;
	    for(int i =0; i< arrLen && !subArrayFound; i++){
		        curSum = numArry[i];
		        subStart = i+1;
		        for(int j =i+1; j< arrLen; j++){
		            curSum += numArry[j];
		            if(curSum ==  givenSum){
		                endStart = j + 1;
		                subArrayFound = true;
		                break;
		            }else if(curSum > givenSum){
		                subArrayFound = false;
		                break;
		            }
		    }
		    
		 }
		 if(subArrayFound){
		     System.out.print(subStart + " " + endStart);
		 }else{
		     System.out.print("-1 ");
		 }
	    
	    
	}
}
