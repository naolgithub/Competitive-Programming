class Solution {
    private String sort(String s){
        char[] arrayOfCharacters=s.toCharArray();
        Arrays.sort(arrayOfCharacters);
        return new String(arrayOfCharacters);
    }
    public List<Integer> findAnagrams(String s, String p) {
        //using Sorting approach
 //points noticed: 1 sorting of string using Arrays.sort() method after changing string to array of character.
        List<Integer> list=new ArrayList();
        String sortedP=sort(p);
        for(int i=0;i<=s.length()-p.length();i++){
            String sortedS=sort(s.substring(i,i+p.length()));
            if(sortedP.equals(sortedS)){
                list.add(i);
            }
        }
        return list;
    }
}