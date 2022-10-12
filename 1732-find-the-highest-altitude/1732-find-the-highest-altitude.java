class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;//Taking the initial max as 0 since biker starts his trip on point 0 with altitute equal to 0
        //then we compare all available net gain in altitude between points i and i+1 for all(0<=i<n)
        for(int i=0;i<gain.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=gain[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}