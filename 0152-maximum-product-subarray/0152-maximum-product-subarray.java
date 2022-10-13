class Solution {
    public int maxProduct(int[] nums) {
        	   //here approach is we move left to right calculating product of each nums element,if product is 0 at   
			   //any stage than we assign prouct=1 and start calculating again,and we update max value of 
			   //subarray  at every stage
			   
	//initially we assign result as Integer.MIN_VALUE because if our array consist negative element than we will 
	//have negative product only
        int product=1;
        int result=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(product==0) product=1;
        product*=nums[i];
        result=Math.max(result,product);
    }
    
    //again we traverse from right to left  because if any array contain single negative element than we are only calculating left side maximum product not the right side part after negative element
    product=1;
        
    for(int i=nums.length-1;i>=0;i--){
        if(product==0) product=1;
        product*=nums[i];
        result=Math.max(result,product);
    }
    return result;
    }
}