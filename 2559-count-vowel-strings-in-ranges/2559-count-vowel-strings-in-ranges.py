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
#     public int[] vowelStrings(String[] words, int[][] queries) {
#         //Optimized prefix sum approach
#         int[] prefixWordCount=new int[words.length+1];
#         int[] result=new int[queries.length];
#         for(int i=1;i<=words.length;i++){
#             prefixWordCount[i]=prefixWordCount[i-1]+numberOfVowelsInString(words[i-1]);
#         }
        
#         int index=0;
#         for(int[] query: queries){
#             int left=query[0];
#             int right=query[1];
#             result[index++]=prefixWordCount[right+1]-prefixWordCount[left];
#         }            
#         return result;
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
    def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
        prefixWordCount=[0]*(len(words)+1)
        result=[0]*len(queries)
        for i in range(1,len(words)+1):
            prefixWordCount[i]=prefixWordCount[i-1]+self.numberOfVowelsInString(words[i-1])
            
        index=0
        for left,right in queries:
            result[index]=prefixWordCount[right+1]-prefixWordCount[left]
            index+=1
        return result
        
        