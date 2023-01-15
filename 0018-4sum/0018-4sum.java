class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                long difference = (long) target - (long) nums[i] - (long) nums[j];
                int start = j + 1;
                int end = nums.length-1;

                while (start<end) {
                    int sum = nums[start] + nums[end];

                    if (sum < difference) start++;
                    else if (sum>difference) end--;
                    else {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[start], nums[end]);
                        list.add(temp);

                        while (start<end && nums[start] == temp.get(2)) start++;
                        while (start < end && nums[end] == temp.get(3)) end--;
                    }
                }

                while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
            }

            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
        }

        return list;
    }
}