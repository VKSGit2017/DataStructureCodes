import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();  
		while(testCases > 0){
		    int inputLen = in.nextInt();
		    int[] inputArr = new int[inputLen];
		    HashMap<Integer,Integer> inputmap = new HashMap<>();
		    HashMap<Integer,List<Integer>> inputmapList = new HashMap<>();
		    for(int i = 0;i< inputLen;i++){
		        inputArr[i] = in.nextInt();
		        insertIntoMap(inputmap, inputArr[i]);
		    }
		    
		    for(Map.Entry item:inputmap.entrySet())
		    {
		        insertIntoMapList(inputmapList, (Integer)item.getValue(),(Integer)item.getKey());
		    }
		    SortedSet<Integer> keys = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        keys.addAll(inputmapList.keySet());

		    
		    for(Integer item2:keys)
		    {
		        
		        for(Integer item1:inputmapList.get(item2))
		        {
		            
		            //System.out.print(item1 + " ");
		            for(int i =0; i< item2;i++)
		            {
		                System.out.print(item1 + " ");
		            }
		        }
		    }
		    System.out.println();
		    testCases--;
		}
	}
	
	public static void insertIntoMap(HashMap<Integer,Integer> inputmap,int ele){
	    if(null == inputmap.get(ele)){
	        final int cConst = 1;
	        inputmap.put(ele, cConst);
	    }else{
	        int count = (Integer)inputmap.get(ele);
	        count += 1;
	        inputmap.put(ele, count);
	    }
	}
	
	public static void insertIntoMapList(HashMap<Integer,List<Integer>> inputmapList,int count, int ele){
	    if(null == inputmapList.get(count)){
	        List<Integer> l = new ArrayList<Integer>();
	        l.add(ele);
	        inputmapList.put(count, l);
	    }else{
	        List<Integer> eleList = inputmapList.get(count);
	        eleList.add(ele);
	        inputmapList.put(count, eleList);
	    }
	}
}
