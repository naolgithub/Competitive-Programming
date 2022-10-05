class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int[] result = new int[n];
        for(int[] current : bookings){
            int start = current[0]-1;
            int end = current[1];
            int value = current[2];
            
            for(int i = start ; i < end ; i++){
                result[i] += value;
            }
        }
        return result;   
    }
}