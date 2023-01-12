class Solution {
    public String reversePrefix(String word, char ch) {
        // converting string to characters
        char[] character=word.toCharArray();
        //reversing the segment of the word that starts at index 0 and ends at the index of the ch.
            int start=0;
            int end=word.indexOf(ch);
            while(start<end){
                char temp=character[start];
                character[start]=character[end];
                character[end]=temp;
                start++;
                end--;
            }
        //building a string from the reversed characters
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<character.length;i++){
            sb.append(character[i]);
        }
        return sb.toString();
    }
}