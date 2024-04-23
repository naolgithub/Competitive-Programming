class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        stack=[]
        output=value=0
        for i in s:
            if i=='(':
                stack.append(0)
            else:
                poppedValue=stack.pop()
                value=1 if poppedValue == 0 else poppedValue*2
                if not stack:
                    output+=value
                else:
                    stack[-1]+=value
        return output
    
    
#         k=1
#         score=0
#         openParanthesis=True
#         for p in s:
#             if p=='(':
#                 k*=2
#                 openParanthesis=True
#             else:
#                 k//=2
#                 if openParanthesis:
#                     score+=k
#                     openParanthesis=False
#         return score

        