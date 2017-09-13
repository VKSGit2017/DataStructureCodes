import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		in.nextLine(); // to remove space after int
		while(testCases > 0){
		    String firstStr = in.nextLine(); 
		    String scndStr = in.nextLine(); 
		    Map<Character, Integer> firstStrMap = new HashMap<>();
		    Map<Character, Integer> scndStrMap = new HashMap<>();
		    //System.out.println(firstStr + "  " + scndStr);
		    
		    int firstStrLen = firstStr.length();
		    int scndStrLen = scndStr.length();
		    boolean isAnagram = true;
		    
		    if(firstStrLen != scndStrLen){
		        isAnagram = false;
		    }else{
		        for(int i=0; i<firstStrLen; i++){
		            if(firstStrMap.get(firstStr.charAt(i)) == null){
		                firstStrMap.put(firstStr.charAt(i),1);
		            }else{
		                int charOcc1 = firstStrMap.get(firstStr.charAt(i));
		                firstStrMap.put(firstStr.charAt(i), charOcc1 + 1);
		            }
		            
		            if(scndStrMap.get(scndStr.charAt(i)) == null){
		                scndStrMap.put(scndStr.charAt(i),1);
		            }else{
		                int charOcc2 = scndStrMap.get(scndStr.charAt(i));
		                scndStrMap.put(scndStr.charAt(i), charOcc2 + 1);
		            }
		        }
		    }
		    
		    for(Character c : firstStrMap.keySet()){
		        if(firstStrMap.get(c) != scndStrMap.get(c)){
		            isAnagram = false;
		        }
		    }
		    
		    if(isAnagram){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		    testCases--;
		}
	}
}
