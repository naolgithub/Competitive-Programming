class Solution {
    public String reverseWords(String s) {
      String[] str=s.trim().split("\s+");//This groups all white spaces as a delimiter.
        String reversedWord="";
        for(int i=str.length-1;i>=0;i--){
            reversedWord += str[i]+" ";
            
        }
        
        return reversedWord.trim();
    }
}