class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();

        int traversal = 0;
        for (int value: pushed) {
            stack.push(value);
            while (!stack.isEmpty() && traversal < pushed.length && stack.peek() == popped[traversal]) {
                stack.pop();
                traversal++;
            }
        }

        return traversal == pushed.length;
    }
}