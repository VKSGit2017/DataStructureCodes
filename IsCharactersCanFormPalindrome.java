import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		//escape space after int
		in.nextLine();
		while(testCases > 0){
		    String inputStr = in.nextLine();
		  
		    char[] inputCharArr = inputStr.toCharArray(); 
		      int inputLen = inputCharArr.length;
		    final int INITIAL_COUNT = 1;
		    Integer count;
		    Map<Character, Integer> countEachChar = new HashMap<Character, Integer>();
		    for(int i=0; i<inputLen;i++){
		        if(countEachChar.get(inputCharArr[i]) == null){
		            countEachChar.put(inputCharArr[i], INITIAL_COUNT);
		        }else{
		            count= countEachChar.get(inputCharArr[i]);
		            countEachChar.put(inputCharArr[i], count+1);
		        }
		    }
		    boolean isInputLenEven = (inputLen%2 == 0);
		    boolean isPalindrome = true;
		    int countOddMapValue =0;

		    for (Integer value : countEachChar.values()) {
		        if(isInputLenEven){
		            if(value%2 != 0){
		                System.out.println("No");
		                isPalindrome = false;
		                break;
		            }
		        }else{
		            if(value%2 != 0){
		                countOddMapValue++;
		            }
		            if(countOddMapValue > 1){
		                System.out.println("No");
		                isPalindrome = false;
		                break;
		            }
		        }
                
            }
		    
		    if(isPalindrome){
		       System.out.println("Yes");

		    }
		    
		    testCases--;
		}
	}
}
