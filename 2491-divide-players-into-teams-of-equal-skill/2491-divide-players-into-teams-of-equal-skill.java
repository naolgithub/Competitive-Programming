class Solution {
    private boolean chemistry(int[] array){
        int left=0;
        int right=array.length-1;
        int temp=array[left]+array[right];
        while(left<right){
            if((array[left]+array[right])!=temp){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sumOfChemistry=0;
        if(chemistry(skill)){
            int left=0;
            int right=skill.length-1;
            while(left<right){
              sumOfChemistry+=skill[left]*skill[right];
                left++;
                right--;
            }
        }
        return sumOfChemistry!=0 ? sumOfChemistry : -1;
    }
}

