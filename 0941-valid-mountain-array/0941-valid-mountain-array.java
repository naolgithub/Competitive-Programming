class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length>=3){
            int i =0;
            int increasing =0;
            int decreasing =0;
            while(i<arr.length-1 && arr[i]<arr[i+1]){
                increasing++;
                i++;
                if(increasing ==arr.length-1){
                    //it has only increasing part of the mountain
                    /*
                        3
                      2 
                    1
                    */
                    return false;
                }
            }
            while(i<arr.length-1 && arr[i]>arr[i+1]){
                decreasing++;
                i++;
                if(decreasing ==arr.length-1){
                     //it has only decreasing part of the mountain
                    /*
                    3
                      2  
                         1
                    */
                    return false;
                }
            }
            if(increasing+decreasing==arr.length-1){
                return true;
            }
        }
        return false;
    }
}