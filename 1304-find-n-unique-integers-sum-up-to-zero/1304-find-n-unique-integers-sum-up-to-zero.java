class Solution {
    public int[] sumZero(int n) {
    // using two pointers 
    //Return an array where the values are symmetric.(+x , -x).
       int[] result=new int[n];
        int start = 0;
        int end = n - 1;
        while(start < end){
            result[start] = start + 1;
            result[end] = result[start]*(-1);
            start++;
            end--;
        }
        return result;
    }
}