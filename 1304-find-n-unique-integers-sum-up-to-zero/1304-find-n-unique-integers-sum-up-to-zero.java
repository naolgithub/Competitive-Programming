class Solution {
    public int[] sumZero(int n) {
    // using two pointers 
    //Return an array where the values are symmetric.(+x , -x).
       int[] result=new int[n];
        /*
        HINT:
        int[] array=new int[2];
        array[0]=7;
        array[1]=4;
        System.out.print(array[2]); output is 0 because java do this by default
        */
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