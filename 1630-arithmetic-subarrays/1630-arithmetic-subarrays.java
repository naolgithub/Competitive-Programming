class Solution {
   // SEE THE BELOW LINK ABOUT Arrays.copyOfRange() method //https://www.tutorialspoint.com/java/util/arrays_copyofrange_short.htm
    private boolean checkIsArithmeticSubarrays(int[] newNums){
        Arrays.sort(newNums);
        int delta=newNums[1]-newNums[0];
        for(int i=1;i<newNums.length;i++){
            if(newNums[i]-newNums[i-1]!=delta) return false;
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<l.length;i++){
          list.add(checkIsArithmeticSubarrays(Arrays.copyOfRange(nums,l[i],r[i]+1)));
        }
        return list;
    }
}