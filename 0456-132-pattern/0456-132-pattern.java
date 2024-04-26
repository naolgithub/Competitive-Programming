class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<int[]> stack = new Stack();
        int currentMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] >= stack.peek()[0]) {
                stack.pop();
            }
            if (!stack.isEmpty() && nums[i] > stack.peek()[1]) {
                return true;
            }
            stack.push(new int[]{nums[i], currentMin});
            currentMin = Math.min(currentMin, nums[i]);
        }
        return false;
    }
}