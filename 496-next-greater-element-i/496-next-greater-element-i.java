class Solution {
    // nick white youtube
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> nextGreater=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(Integer num:nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                nextGreater.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=nextGreater.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}