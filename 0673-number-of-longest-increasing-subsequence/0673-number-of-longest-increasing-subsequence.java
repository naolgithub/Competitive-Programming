class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        if (nums.length == 0) return 0;
        int[] lengthOfLIS = new int[nums.length];     
        int[] countNumberOfLIS = new int[nums.length];  
        
        int maxLength = 0;
        int numberOfLIS = 0;
        
        for (int i = 0; i < nums.length; i++) {
            lengthOfLIS[i] = 1; 
            countNumberOfLIS[i] = 1; 
            
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) { 
                    if (lengthOfLIS[j] + 1 > lengthOfLIS[i]) {
                        lengthOfLIS[i] = lengthOfLIS[j] + 1;
                        countNumberOfLIS[i] = countNumberOfLIS[j];
                    } else if (lengthOfLIS[j] + 1 == lengthOfLIS[i]) {
                        countNumberOfLIS[i] += countNumberOfLIS[j];
                    }
                }
            }
            if (lengthOfLIS[i] > maxLength) {
                maxLength = lengthOfLIS[i];
                numberOfLIS = countNumberOfLIS[i];
            } else if (lengthOfLIS[i] == maxLength) {
                numberOfLIS += countNumberOfLIS[i];
            }
        }
        
        return numberOfLIS;
    }
    
}