import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int noOfTestCases = in.nextInt();
		in.nextLine(); //ignore space after int
		while(noOfTestCases > 0){
		    String paranthesisInput = in.nextLine();
		    //System.out.println(paranthesisInput);
		    isBalancedParathesis(paranthesisInput);
		    
		    noOfTestCases--;
		}
		
	}
	
	
	public static  void isBalancedParathesis(String paranthesisInput){
	    char[] input = paranthesisInput.toCharArray();
	    Stack<Character> s = new Stack<Character>();
	    
	    for(int i = 0; i<input.length; i++ ){
	        
	        if(input[i] == '{' || input[i] == '(' || input[i] == '['){
	            //System.out.println("push to stack--" + input[i]);
	            s.push(input[i]);
	        }
	        if(input[i] == '}' || input[i] == ')' || input[i] == ']'){
	            //System.out.println("pop to stack--" + input[i]);
	            if(s.empty()){
	                System.out.println("not balanced");
	                return;
	            }
	            
	            char stackEle = s.pop();
	            //System.out.println("stackEle:" + stackEle);
	            if(!isMatchingParathesis(stackEle, input[i])){
	                //System.out.println("Not matched----" + stackEle + ";"+ input[i]);
	                System.out.println("not balanced");
	                return;
	            }
	        }
	        
	        
	        
	        
	    }
	    if(s.empty()){
	            System.out.println("balanced");
	            return;
	        }else{
	            System.out.println("not balanced");
	            return;
	    }
	    
	}
	
	
	public static boolean isMatchingParathesis(char stackEle, char input){
	    
	    if(stackEle == '(' && input == ')'){
	        return true;
	    }else if(stackEle == '{' && input == '}'){
	        return true;
	    }else if(stackEle == '[' && input == ']'){
	        return true;
	    }else{
	        return false;
	    }
	}
	
	
}
