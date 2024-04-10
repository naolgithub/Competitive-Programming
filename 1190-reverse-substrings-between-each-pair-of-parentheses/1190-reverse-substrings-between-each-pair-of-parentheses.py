# class Solution {
#     private void reverseSubstring(char[] chars, int start, int end) {
#         while (start < end) {
#             char temp = chars[start];
#             chars[start] = chars[end];
#             chars[end] = temp;
#             start++;
#             end--;
#         }
#     }    
#     public String reverseParentheses(String s) {
#         Stack<Integer> stack = new Stack();
#         char[] chars = s.toCharArray();

#         for (int i = 0; i < chars.length; i++) {
#             if (chars[i] == '(') {
#                 stack.push(i);
#             } else if (chars[i] == ')') {
#                 int start = stack.pop();//start=0 for ex.1
#                 reverseSubstring(chars, start + 1, i - 1);
#             }
#         }

#         StringBuilder result = new StringBuilder();
#         for (char c : chars) {
#             if (c != '(' && c != ')') {
#                 result.append(c);
#             }
#         }

#         return result.toString();
#     }
# }

class Solution:
    def reverseParentheses(self, s: str) -> str:
        def reverse_substring(chars, start, end):
            while start<end:
                chars[start],chars[end]=chars[end],chars[start]
                start+=1
                end-=1
        stack=[]
        chars=list(s)
        for i in range(len(chars)):
            if chars[i]=='(':
                stack.append(i)
            elif chars[i]==')':
                start=stack.pop()
                reverse_substring(chars,start+1,i-1)
        result = [c for c in chars if c != '(' and c != ')']
        return "".join(result)
        
        