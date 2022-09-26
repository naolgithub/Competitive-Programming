class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // using two pointers
        int start=0;
        int end=numbers.length-1;
        int result[]=new int[2];
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                result[0]=start+1;
                result[1]=end+1;
                return result;
            }
            else if(sum<target){
                start++;
            }
            else if(sum>target){
                end--;
            }
        }
        return result;
    }
}
