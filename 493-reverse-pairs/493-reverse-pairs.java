class Solution {
    private static int merge(int[] nums, int l, int mid, int r){
        int[] leftArr = new int[mid-l+1];
        int[] rightArr = new int[r-mid];
        for(int i=l; i<=r; i++){
            if(i<=mid)
                leftArr[i-l] = nums[i];
            else 
                rightArr[i-mid-1] = nums[i];
        }
        int i=0, j=0, k=l;
        int revPairs = 0;
        //Detect reverse pairs
        while(i<leftArr.length && j<rightArr.length){
                if(leftArr[i]/2.0 > rightArr[j]){
                    revPairs += leftArr.length - i;
                    j++;
                }else{
                    i++;
                }
        }
        i=j=0;
        //Merge Arrays
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i] <= rightArr[j]) nums[k++] = leftArr[i++];
            else nums[k++] = rightArr[j++];
        }
        while(i<leftArr.length) nums[k++] = leftArr[i++];
        while(j<rightArr.length) nums[k++] = rightArr[j++];
        return revPairs;
    }
    private static int mergeSort(int[] nums, int l, int r){
        int totalRevPairs = 0;
        if(l<r){
            int mid = l + (r-l)/2;
            int lRevPairs = mergeSort(nums, l, mid);
            int rRevPairs = mergeSort(nums, mid+1, r);
            int mergeRevPairs = merge(nums, l, mid, r);
            totalRevPairs = lRevPairs + rRevPairs + mergeRevPairs;
        }
        return totalRevPairs;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
}