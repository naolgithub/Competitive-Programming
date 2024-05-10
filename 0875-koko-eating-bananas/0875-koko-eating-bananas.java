class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int maxElement=0;
        for(int i=0;i<piles.length;i++){
            maxElement=Math.max(maxElement,piles[i]);
        }
        int right=maxElement;
        int minimumInteger=right;
        while(left<=right){
            int k=(left+right)/2;
            int hours=0;
            for(int pile:piles){
                hours+=Math.ceil((double)pile/k);
            }
            if(hours<=h){
                minimumInteger=Math.min(minimumInteger,k);
                right=k-1;
            }
            else{
                left=k+1;
            }
        }
        return minimumInteger;
    }
}