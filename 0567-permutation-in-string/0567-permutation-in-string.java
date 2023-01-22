class Solution {
    private String sort(String s){
        char[] arrayOfCharacters=s.toCharArray();
        Arrays.sort(arrayOfCharacters);
        return new String(arrayOfCharacters);
    }
    public boolean checkInclusion(String s1, String s2) {
        /*
        let l1 be the length of string s1 and s2 be the length of string s2
        Time complexity:O(l1Log(l1) + (l2-l1)l1Log(l1))
        Space complexity:O(1)
        */
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