class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     Stack<Integer> stack=new Stack<>();
     int[] map=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                Integer topIndex=stack.pop();
                int diff=i-topIndex;
                map[topIndex]=diff;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            Integer topIndex=stack.pop();
            map[topIndex]=0;
        }
        return map;
    }
}