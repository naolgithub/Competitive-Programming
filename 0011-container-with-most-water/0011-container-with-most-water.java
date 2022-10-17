class Solution {
    //Time Complexity:O(N)
    //Space Complexity:O(1)
    public int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        // consider like this 
        //1.height represent the height of the water
        //2.right-left represent the base of the water
        //3.The product of the height and right-left give us an area
        //4.To get the maximum area we have to iterate through the vertical lines which gives us the maximum area(i.e maximum area is found between the vertical lines height[left] and height[right])
        while(left<right){
            if(height[left]<height[right]){
                int currentArea=height[left]*(right-left);
                maxArea=Math.max(maxArea,currentArea);
               left++;
            }
            else{
            int currentArea=height[right]*(right-left);
              maxArea=Math.max(maxArea,currentArea);
            right--;  
            }
        }
        return maxArea;
    }
}