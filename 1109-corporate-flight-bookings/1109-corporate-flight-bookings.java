class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int[] result = new int[n];
        for(int[] current : bookings){
            int start = current[0]-1;
            int end = current[1];
            int value = current[2];
            result[start] += value;
            if(end < n){
                result[end] -= value;
            }
        }
        for(int i = 1 ; i < n ; i++){
            result[i] += result[i-1];
        }
        return result; 
    }
}