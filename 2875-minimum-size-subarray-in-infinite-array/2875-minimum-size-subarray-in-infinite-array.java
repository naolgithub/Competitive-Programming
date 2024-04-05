class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int sum=0;
        int n=nums.length;
        int k=0;
        HashMap<Integer,Integer> map=new HashMap();
        
        int shortestLengthSubarray=Integer.MAX_VALUE;
       
        for(int num:nums){
            sum+=num;
        }
        
        if(target>sum){
            k=target/sum;
            target=target%sum;
            if(target==0){
                return k*n;
            }
        }

        map.put(0,-1);
        sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-target)){
                shortestLengthSubarray=Math.min(shortestLengthSubarray,i-map.get(sum-target));
            }
            map.put(sum,i);
        }

        for(int i=n;i<2*n;i++){
            sum+=nums[i-n];     
            if(map.containsKey(sum-target)){
                shortestLengthSubarray=Math.min(shortestLengthSubarray,i-map.get(sum-target));
            }
            map.put(sum,i);
        }

//         if(shortestLengthSubarray==Integer.MAX_VALUE)
//             return -1;   
//         shortestLengthSubarray=shortestLengthSubarray+(n*k);
        
        return shortestLengthSubarray==Integer.MAX_VALUE? -1:shortestLengthSubarray+(n*k);    
       
    }
}