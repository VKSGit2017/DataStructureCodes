import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		
		while(testCases > 0){
		    
		    int radius = in.nextInt();
		    int noOfLatticePoints = calculateLatticePointsInCircle(radius);
		    System.out.print(noOfLatticePoints);
		    
		    
		    System.out.print("\n");
		    testCases--;
		}
	}
	
	public static int calculateLatticePointsInCircle(int radius){
	    if(radius <= 0){
	        return 0;
	    }
	    
	    
	    int noOfLatticePoints = 4;
	    int ySquare = 0,  y =0;
	    
	    //x2+ y2 = r2
	    for(int x=1;x<radius;x++){
	        
	        ySquare  = (radius * radius) - (x* x);
	        y = (int) Math.sqrt(ySquare);
	        
	        if( (y * y) == ySquare){
	            noOfLatticePoints += 4;
	        }
	        
	    }
	    
	    return noOfLatticePoints;
	    
	}
}
