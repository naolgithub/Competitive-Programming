class Solution {
    public int[] nextGreaterElements(int[] nums) {
    Stack<Integer> stack = new Stack<>();
    int[] res = new int[nums.length];
    for(int i=0;i<nums.length;i++) {
        while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
            res[stack.pop()] = nums[i];
        }
        stack.push(i);
    }
    
    for(int i=0;i<nums.length;i++) {
        while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
            res[stack.pop()] = nums[i];
        }
    }

    while(!stack.isEmpty()) {
        res[stack.pop()] = -1;
    }
    return res;
}
    }
