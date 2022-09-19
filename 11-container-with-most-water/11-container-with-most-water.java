class Solution {
    //Time Complexity:O(N)
    //Space Complexity:O(1)
    public int maxArea(int[] height) {
        int maxArea=0;
        int alfa=0;
        int omega=height.length-1;
        while(alfa<omega){
            if(height[alfa]<height[omega]){
                maxArea=Math.max(maxArea,height[alfa]*(omega-alfa));
            alfa++;
            }
            else{
              maxArea=Math.max(maxArea,height[omega]*(omega-alfa));
            omega--;  
            }
        }
        return maxArea;
    }
}