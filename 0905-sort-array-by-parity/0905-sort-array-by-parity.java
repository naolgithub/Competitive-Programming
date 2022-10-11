class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lastEvenIndex = 0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[lastEvenIndex];
                nums[lastEvenIndex] = nums[i];
                nums[i] = temp;
                lastEvenIndex++ ;
            }
        }
        return nums;
    }
}