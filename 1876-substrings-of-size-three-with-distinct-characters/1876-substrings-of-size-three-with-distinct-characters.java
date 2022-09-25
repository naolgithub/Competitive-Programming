class Solution {
    public int countGoodSubstrings(String s) {
      
        int counter=0;
        
        for(int i=0;i<s.length()-2;i++){
            
            String temp=s.substring(i,i+3);
            
            if(temp.charAt(0)!=temp.charAt(1) && temp.charAt(1)!=temp.charAt(2) && temp.charAt(0)!=temp.charAt(2)){
                counter++;
            }
        }
        
        return counter;
    }
}