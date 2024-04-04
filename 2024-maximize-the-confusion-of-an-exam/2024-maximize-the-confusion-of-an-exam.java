class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int countTrueOne=0;
        int countTrueTwo=0;
        int countFalseOne=0;
        int countFalseTwo=0;
        int leftOne=0;
        int leftTwo=0;
        int maximumConsecutiveFalse=Integer.MIN_VALUE;
        int maximumConsecutiveTrue=Integer.MIN_VALUE;
        
        //The maximum number of consecutive 'T's in the answer key after performing the operation at most k times.
        for(int right=0;right<answerKey.length();right++){
            if(answerKey.charAt(right)=='F') countFalseOne++;
            else
                countTrueOne++;
            while(countFalseOne>k){
                if(answerKey.charAt(leftOne)=='F') countFalseOne--;
                leftOne++;
            }
            maximumConsecutiveFalse=Math.max(right-leftOne+1,maximumConsecutiveFalse);
        }
        
        
        //The maximum number of consecutive 'F's in the answer key after performing the operation at most k times.
        for(int right=0;right<answerKey.length();right++){
            if(answerKey.charAt(right)=='T') countTrueTwo++;
            else
                countFalseTwo++;
            while(countTrueTwo>k){
                if(answerKey.charAt(leftTwo)=='T') countTrueTwo--;
                leftTwo++;
            }
            maximumConsecutiveTrue=Math.max(right-leftTwo+1,maximumConsecutiveTrue);
        }
        
        return Math.max(maximumConsecutiveTrue,maximumConsecutiveFalse);
    }
}