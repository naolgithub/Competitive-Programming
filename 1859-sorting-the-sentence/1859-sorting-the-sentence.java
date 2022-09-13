class Solution {
    public String sortSentence(String s) {
    String[] arrayOfSplittedString=s.split(" ");
    String originalSentence="";
    for(int j=1;j<=arrayOfSplittedString.length;j++){
        String temp=Integer.toString(j);
        // traverse to get the string which contains (temp) at its end of word and add it on originalSentence 
    for(int i=0;i<arrayOfSplittedString.length;i++){
  if(arrayOfSplittedString[i].endsWith(temp)){
        originalSentence=originalSentence+arrayOfSplittedString[i].substring(0,arrayOfSplittedString[i].length()-1)+" ";
  }
        }
     }
     return originalSentence.trim();
    }
}