/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below*/
class GfG
     {
      
        static class MinHeap{
             public int ele;
             public int curIndex;
             public int nextIndex;
             
             @Override
            public String toString() {
                return "ele:"+ele +", curIndex:" + curIndex+", nextIndex:" +nextIndex;
            }
         } 
        public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k) 
          {
                MinHeap[] hp = new MinHeap[k];
                for(int i=0;i<k;i++){
                    hp[i] = new MinHeap();
                    hp[i].ele = arrays[i][0];
                    hp[i].curIndex= i;
                    hp[i].nextIndex= 1;
                }
                buildMinHeap(hp, k);
                
                int mergeArrayLen = k*k;
                ArrayList<Integer> mergeArray = new ArrayList<Integer>();
                
                for(int i=0;i<mergeArrayLen; i++){
                    mergeArray.add(i,hp[0].ele);
                    int row = hp[0].curIndex;
                    int col = hp[0].nextIndex;
                    
                    if(col < k){
                        int nextRootEle = arrays[row][col];
                        hp[0].nextIndex = col + 1;
                        hp[0].ele = nextRootEle;
                    }
                    else{
                        hp[0].ele = Integer.MAX_VALUE;
                    }
                    
                    minHeapify(hp, 0, k);
                    
                }
                return mergeArray; 
                
          }
          
         static void buildMinHeap(MinHeap[] hp, int len){
            int i = (len - 1)/2; //find last root element in Tree
            while(i >=0){
                minHeapify(hp, i, hp.length);
                i--;
            }
         }
         
         static void minHeapify(MinHeap[] hp, int rootIndex, int heapLen){
             int minIndex = rootIndex;
             int leftIndex = 2*rootIndex + 1;
             int rightIndex = 2*rootIndex + 2;
             
             if(leftIndex < heapLen &&  hp[minIndex].ele > hp[leftIndex].ele){
                 minIndex = leftIndex;
             }
             if(rightIndex < heapLen &&  hp[minIndex].ele > hp[rightIndex].ele){
                 minIndex = rightIndex;
             }
             if(minIndex != rootIndex){
                 swapEle(hp[minIndex],hp[rootIndex]);
                 minHeapify(hp, minIndex, heapLen);
             }
             
         }
         
         static void swapEle(MinHeap hp,MinHeap hp1){
             int temp = hp.ele;
             hp.ele = hp1.ele;
             hp1.ele = temp;
             
             //for index
             temp = hp.curIndex;
             hp.curIndex = hp1.curIndex;
             hp1.curIndex = temp;
             
             temp = hp.nextIndex;
             hp.nextIndex = hp1.nextIndex;
             hp1.nextIndex = temp;
         }       
         
         
         
}
