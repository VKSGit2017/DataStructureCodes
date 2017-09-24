class SpecialStringProblem
{
    
    
    public static void main(String[] args){
        
        String firstStringS1 = "abcdefgh";
        String SecondStringS2 = "acb"; //"abg";
        boolean isSpecial = isSpecialSubstring(firstStringS1, SecondStringS2);
        System.out.println("Special String : " + isSpecial);
        
        
    }
    
    public static boolean isSpecialSubstring(String firstStringS1,String SecondStringS2){
        int s1Len = firstStringS1.length();
        int s2Len = SecondStringS2.length();
        int j=0;
        for(int i=0; i<s1Len && j < s2Len; i++){
            if(firstStringS1.charAt(i) == SecondStringS2.charAt(j)){
                j++;
            }
        }
        if(j == s2Len){
            return true;
        }else{
            return false;
        }
    }
}
