class Solution {
    public boolean checkIfPangram(String sentence) {
        /*
        Using HashSet and Array
        Time Complexity:O(N)
        Space Complexity:O(N)
        */
        char[] letterOfEnglish={'a','b','c','d', 'e',
                                'f', 'g', 'i', 'h', 'j',
                                'k' ,'l', 'm', 'n' ,'o',
                                'p', 'q', 'r', 's', 't',
                                'u', 'v', 'w', 'x', 'y', 'z'};
     Set<Character> set=new HashSet();   
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        for(int i=0;i<letterOfEnglish.length;i++){
            if(!set.contains(letterOfEnglish[i])) return false;
        }
        return true;
    }
}
