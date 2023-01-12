class Solution {
    public String reversePrefix(String word, char ch) {
        char[] character=word.toCharArray();
    
            int start=0;
            int end=word.indexOf(ch);
            while(start<end){
                char temp=character[start];
                character[start]=character[end];
                character[end]=temp;
                start++;
                end--;
            }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<character.length;i++){
            sb.append(character[i]);
        }
        return sb.toString();
    }
}