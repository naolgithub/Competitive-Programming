class Solution {
    public int[] finalPrices(int[] prices) {
        // using array : tc:O(N^2)
        //               sc:O(1)
        for(int i=0;i<prices.length;i++){
           //when we reach the last ith item, we break             //out of the loop
            if(i+1==prices.length)break;
            
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                    prices[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}