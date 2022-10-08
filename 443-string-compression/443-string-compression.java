class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        sb.append(chars[0]);
        int count=1;
        for(int i=1;i<chars.length;i++){
            char currentCharacter=chars[i];
            char previousCharacter=chars[i-1];
            if(currentCharacter==previousCharacter){
                count++;
            } 
            if(currentCharacter!=previousCharacter){
                if(count>1){
                    sb.append(count);
                }
                sb.append(currentCharacter);
                count=1;
            } 
        }
        if(count>1){
                    sb.append(count);
                }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}