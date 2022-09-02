class Solution {
    
    void maxHeapify(int[] a, int n, int i) {
        int largest = i;
        
        int l = largest * 2;
        int r = largest * 2 + 1;
        
        while (l <= n && a[l - 1] > a[largest - 1]) {
            largest = l;
        }
        while (r <= n && a[r - 1] > a[largest - 1]) {
            largest = r;
        }
        if(largest!=i){
        int temp = a[i - 1];
        a[i - 1] = a[largest - 1];
        a[largest - 1] = temp;
        
        maxHeapify(a, n, largest);
        }
        if (largest == i){
            return;
        }
    }
    
    public int[] sortArray(int[] nums) {
        for(int i = nums.length / 2; i >= 1; i--)
            maxHeapify(nums, nums.length, i);
        
        for(int i = nums.length-1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            maxHeapify(nums, i, 1);
        }
        return nums;
                
    }
}