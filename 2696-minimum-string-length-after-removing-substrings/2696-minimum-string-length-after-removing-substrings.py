# class Solution {
#     public int minLength(String s) {
#         Stack<Character> stack=new Stack();
#         for(char c: s.toCharArray()){
#             if(c=='B' && !stack.isEmpty() && stack.peek()=='A'){
#                 stack.pop();
#             }
#             else if(c=='D' && !stack.isEmpty() && stack.peek()=='C'){
#                 stack.pop();
#             }
#             else{
#                 stack.push(c);
#             }
#         }
#         return stack.size();
#     }
# }
class Solution:
    def minLength(self, s: str) -> int:
        stack=[]
        for c in s:
            if c=='B' and stack and stack[-1]=='A':
                stack.pop()
            elif c=='D' and stack and stack[-1]=='C':
                stack.pop()
            else:
                stack.append(c)
        return len(stack)
        