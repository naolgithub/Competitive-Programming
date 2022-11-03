class Solution {
    public int[] finalPrices(int[] prices) {
      /*
        for(int i=0;i<prices.length;i++){
            if(i+1==prices.length) break;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    prices[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return prices;
      */
         //using Stack
     Stack<Integer> stack = new Stack<>();
        for (int i=prices.length-1; i>=0; i--) {
            //if peek of the stack is greater than price which is going to be added, we remove peek of stack
    while(!stack.isEmpty() && stack.peek()>prices[i]){
                stack.pop();
            }
            int price = prices[i];
            if (!stack.isEmpty()) {
                prices[i] = prices[i] - stack.peek();  
            }
            stack.push(price);
        }
        return prices;
    }
}