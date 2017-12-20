/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        
        //Scanner
        Scanner s = new Scanner(System.in);
        long testCaseNo = s.nextInt();                 // Reading input from STDIN
        //System.out.println("testCaseNo, " + testCaseNo + ".");
        while(testCaseNo > 0){
            
            int noOfCheckpoint = s.nextInt(); 
            //System.out.println("noOfCheckpoint, " + noOfCheckpoint + ".");
            long[] costOfPetrol = new long[noOfCheckpoint];
            long[] amountOfPetrol = new long[noOfCheckpoint];
            for(int i = 0; i<noOfCheckpoint ; i++){
                costOfPetrol[i] = s.nextInt(); 
                //System.out.println("costOfPetrol[" + i+"]"+costOfPetrol[i] + ".");
            }
            
            for(int i = 0; i<noOfCheckpoint ; i++){
                amountOfPetrol[i] = s.nextInt(); 
                //System.out.println("amountOfPetrol[" + i+"]"+ amountOfPetrol[i] + ".");
            }
            
            //int minCostMonk = 0;
            long curCostMonk = 0;
            long minCost = Long.MAX_VALUE;
            for(int i = 0; i<noOfCheckpoint ; i++){
                if(minCost > costOfPetrol[i]){
                    minCost = costOfPetrol[i];
                }        
                curCostMonk +=  minCost * amountOfPetrol[i];
                
            }
            System.out.println(curCostMonk);
            
            
            testCaseNo--;
        }
 
    }
}
