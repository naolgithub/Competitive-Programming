class Solution {
    public int[] replaceElements(int[] arr) {
        int[] array=new int[arr.length];
        int maxElement=Integer.MIN_VALUE;
        if(arr.length==1) return new int[]{-1};
        array[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            maxElement=Math.max(maxElement,arr[i+1]);
            array[i]=maxElement;
        }
        return array;
    }
}






