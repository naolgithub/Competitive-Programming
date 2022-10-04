class Solution {
    /*
    https://www.techiedelight.com/remove-non-alphanumeric-characters-from-string-java/
    */
    public boolean isPalindrome(String s) {
        //METHOD ONE
       /* s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        // adding only numbers and letters to stringBuilder
        for(int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }
        int n = stringBuilder.length()-1;
        for(int i = 0; i<stringBuilder.length()/2; i++){
            if(stringBuilder.charAt(i)!= stringBuilder.charAt(n-i))return false;
        }
         return true;*/   
        //METHOD TWO
        
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuffer(actual).reverse().toString();
        return actual.equals(reversed);
        
    }
}