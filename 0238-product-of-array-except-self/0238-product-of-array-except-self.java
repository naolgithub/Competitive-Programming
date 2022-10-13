class Solution {
    /*
    Numbers:        1        2            3            4           5
    Lefts:                   1            2*1        1*2*3      1*2*3*4                       //    1     1    2   6   24     //First Loop 
    Rights:      2*3*4*5   3*4*5          4*5         *5                                      //   120   60   20   5    1
                                                     // for result multiply left and rights  //    120   60   40  30   24     //Second Loop
        */
    public int[] productExceptSelf(int[] nums) {
     int N= nums.length;
		//product of array elements to the left of current element
        int[] leftProduct = new int[N];
        leftProduct[0]=1;
        for(int i=1; i<N; i++){
            leftProduct[i]= leftProduct[i-1]*nums[i-1];
        }
		//product of array elements to the right of current element
		int[] rightProduct= new int[N];
        rightProduct[N-1]=1;
        for(int i=N-2; i>=0; i--){
            rightProduct[i]= rightProduct[i+1]*nums[i+1];
        }
        int[] result= new int[N];
        for(int i=0; i<N; i++){
            result[i]= leftProduct[i]*rightProduct[i];
        }
        return result;
    }
}