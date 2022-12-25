class Solution {
    public int specialArray(int[] nums) {
        //Count the number of elements greater than or equal to x for each x in the range [0, nums.length].
        int left = 0;
		int right = nums.length;
		int specialArray = -1;
		 while(left <= right) {
			int mid = left + (right - left)/2;
			int count = 0;
			for(int num: nums) {
				if(num >= mid) {
					count++;
				}
			}
			if(count == mid) {
				specialArray = mid;
				break;
			}else if(count > mid) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return specialArray;
        
    }
}