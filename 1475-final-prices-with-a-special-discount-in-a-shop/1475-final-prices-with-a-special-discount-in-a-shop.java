class Solution {
    public int[] finalPrices(int[] prices) {
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