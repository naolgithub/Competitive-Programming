class Solution {
    public String reverseWords(String s) {
        String[] string=s.trim().split("\s+");
        String result="";
        for(int i=string.length-1;i>=0;i--){
            result=result+string[i]+" ";
        }
        return result.trim();
    }
}