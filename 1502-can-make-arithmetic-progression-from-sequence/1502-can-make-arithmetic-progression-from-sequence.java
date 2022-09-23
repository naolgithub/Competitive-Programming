class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        java.util.Arrays.sort(arr);
        int differenceConstant=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=differenceConstant){
                return false;
            }
        }
        return true;
    }
}