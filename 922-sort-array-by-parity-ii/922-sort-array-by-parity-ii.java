class Solution {
    public int[] sortArrayByParityII(int[] nums) {
    int[] result = new int[nums.length];
    int even = -2;
    int odd = -1;

    for (int  i: nums){
        if (i % 2 == 0) result[even+=2] = i;
        else result[odd+=2] = i;
    }

    return result;
    }
}