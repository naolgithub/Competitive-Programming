class Solution {
    //Time Complexity:O(N)
    //Space Complexity:O(1)
    public int maxArea(int[] height) {
        int maxArea=0;
        int alfa=0;
        int omega=height.length-1;
        // consider like this 
        //1.height represent the height of the water
        //2.omega-alfa represent the base of the water
        //3.The product of the height and omega-alfa give us an area
        //4.To get the maximum area we have to iterate through the vertical lines which gives us the maximum area(i.e maximum area is found between the vertical lines height[alfa] and height[omega])
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