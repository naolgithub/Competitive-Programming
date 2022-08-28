class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]*nums[i]);
        }
        int[] squaredArray=new int[list.size()];
        for(int i=0;i<nums.length;i++){
           squaredArray[i]=list.get(i);
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }
}