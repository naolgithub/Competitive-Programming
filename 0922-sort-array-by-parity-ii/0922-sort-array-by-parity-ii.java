class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        /*
        //Time Complexity:O(NlogN)
        //Space Complexity:O(N)
        // Not optimal solution
        List<Integer> even=new ArrayList();
        List<Integer> odd=new ArrayList();
    for(Integer num:nums){
        if(num%2==0) even.add(num);
        else odd.add(num);
    }    
        Collections.sort(even);
        Collections.sort(odd);
        int[] result=new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
             if (i%2 == 0){
               result[i]=even.get(j);
                 j++;
             }
             else {
               result[i]=odd.get(k);
                 k++;
             }
        }
        return result;
        */
        /*
        //https://leetcode.com/problems/sort-array-by-parity-ii/discuss/2403590/JAVA-O(1)-space-or-O(n)-time-or-90-faster-or-Easy-Explained
        
@1We have two poiters,
1.i at index 0 (for even indices)
2.j at index 1 (for odd indices)
@2Now we check whether i has an even number,
1.if nums[i] is even : i+=2 (move to next even index)
2.if nums[i] is odd: we check whether j has an odd number,
2.1if nums[j] is odd : j+=2 (move to next odd index)
2.2if nums[j] is even: swap nums[i] and nums[j]

        */
         int i=0;
         int j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]%2==0) i+=2;
            else{
                if(nums[j]%2!=0) j+=2;
                else{
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;

    }
}