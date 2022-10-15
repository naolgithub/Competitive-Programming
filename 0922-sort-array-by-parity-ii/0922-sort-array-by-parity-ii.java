class Solution {
    public int[] sortArrayByParityII(int[] nums) {
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
    }
}