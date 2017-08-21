import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t= in.nextInt();
		
		while(t > 0){
		    int stringLen = in.nextInt();
		    //buffer all the remainging space after int input
		    in.nextLine();
		    String inputStr = in.nextLine();
		    char[] inputcharArr = inputStr.toCharArray();
		    boolean isPalin = true;
		    for(int i=0, j=stringLen-1; i< stringLen && j>i ;i++,j--){
		        if(inputcharArr[i] != inputcharArr[j]){
		            System.out.println("No");
		            isPalin = false;
		            break;
		        }
		        
		    }
		    if(isPalin){
		        System.out.println("Yes");
		    }
		    
		    
		    t--;
		}
	}
}
