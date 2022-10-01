class Solution {
    public boolean judgeCircle(String moves) {
        int UD_counter=0; 
        int LR_counter=0; 
        for(int i=0;i<moves.length();i++){
            char currentMove=moves.charAt(i);
            if(currentMove=='U') UD_counter++;
            else if(currentMove=='D') UD_counter--;
            else if(currentMove=='L') LR_counter++;
            else if(currentMove=='R') LR_counter--;
        }
        return UD_counter==0 && LR_counter==0;
    }
}