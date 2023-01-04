class Solution 
{
    public int[][] flipAndInvertImage(int[][] image) 
    {
        //Flipping an image horizontally(i.e reversing an image)
        for(int i=0; i<image.length; i++){         
            int start=0;
            int end=image[i].length-1;
            while(start<=end){
                //two pointer approach
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;
                start++;
                end--;
            }
        }

        //Inverting an image(i.e replace 0 with 1 and vice versa)
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                image[i][j] = image[i][j]==1 ? 0 : 1;
            }
        }
        return image;
    }
}