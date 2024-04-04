class Solution {
    private int numberOfVowelsInString(String s){
        int countVowel=0;
        int start=0;
        int end=s.length()-1;
       
        if((s.charAt(start)=='a'||s.charAt(start)=='e'||s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u') &&(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u')){
            countVowel++;
        }
        return countVowel;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        //Brute force approach
        int[] wordCount=new int[words.length];
        int[] result=new int[queries.length];
        for(int i=0;i<words.length;i++){
            wordCount[i]=numberOfVowelsInString(words[i]);
        }
        
        int index=0;
        for(int[] query: queries){
            int count=0;
            for(int i=query[0];i<=query[1];i++){
                count+=wordCount[i];
            }
            result[index++]=count;
        }            
        return result;
    }
}
// [0,1,1,2,3,4]

// [left-1,right]
// []

