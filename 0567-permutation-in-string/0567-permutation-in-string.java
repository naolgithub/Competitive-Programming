class Solution {
    private String sort(String s){
        char[] arrayOfCharacters=s.toCharArray();
        Arrays.sort(arrayOfCharacters);
        return new String(arrayOfCharacters);
    }
    public boolean checkInclusion(String s1, String s2) {
        //points noticed: 1 sorting of string using Arrays.sort() method after changing string to array of character.
        String sortedSOne=sort(s1);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String sortedSTwo=sort(s2.substring(i,i+s1.length()));
            if(sortedSOne.equals(sortedSTwo)){
                return true;
            }
        }
        return false;
    }
}