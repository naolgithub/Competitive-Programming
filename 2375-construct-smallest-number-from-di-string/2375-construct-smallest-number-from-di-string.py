# class Solution {
#     public String smallestNumber(String pattern) {
#         Stack<Integer> stack=new Stack();
#         StringBuilder sb=new StringBuilder();
#         int count=1;
#         stack.push(count);
#         for(char ch:pattern.toCharArray()){
#             if(ch== 'I'){
#                 while(!stack.isEmpty()){
#                     sb.append(stack.pop());
#                 }
#                 count++;
#                 stack.push(count);
#             }
#             else{
#                 count++;
#                 stack.push(count);
#             }   
#         }
#         while(!stack.isEmpty()){
#                     sb.append(stack.pop());
#                 }
#         return sb.toString();
#     }
# }
class Solution:
    def smallestNumber(self, pattern: str) -> str:
        stack = []
        sb = []
        count = 1
        stack.append(count)
        
        for ch in pattern:
            if ch == 'I':
                while stack:
                    sb.append(stack.pop())
                count += 1
                stack.append(count)
            else:
                count += 1
                stack.append(count)
        
        while stack:
            sb.append(stack.pop())
        
        return ''.join(map(str, sb))
            
        