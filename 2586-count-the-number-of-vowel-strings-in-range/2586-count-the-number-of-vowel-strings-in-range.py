# class Solution {
#     private int numberOfVowelsInString(String s){
#         int countVowel=0;
#         int start=0;
#         int end=s.length()-1;
       
#         if((s.charAt(start)=='a'||s.charAt(start)=='e'||s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u') &&(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u')){
#             countVowel++;
#         }
#         return countVowel;
#     }    
#     public int vowelStrings(String[] words, int left, int right) {
        
#         int[] wordCount=new int[words.length];
#         for(int i=0;i<words.length;i++){
#             wordCount[i]=numberOfVowelsInString(words[i]);
#         }
    
#         int numberOfVowelStrings=0;
#         for(int i=left;i<=right;i++){
#             numberOfVowelStrings+=wordCount[i];
#         }        
#         return numberOfVowelStrings;
#     }
# }
class Solution:
    def numberOfVowelsInString(self,s):
        vowels=set("aeiou")
        countVowel=0
        start=0
        end=len(s)-1
        if s[start] in vowels and s[end] in vowels:
            countVowel+=1
        return countVowel    
    def vowelStrings(self, words: List[str], left: int, right: int) -> int:
        wordCount=[0]*len(words)
        for i in range(len(words)):
            wordCount[i]=self.numberOfVowelsInString(words[i])
            
        numberOfVowelString=0
        for i in range(left,right+1):
            numberOfVowelString+=wordCount[i]
        return numberOfVowelString