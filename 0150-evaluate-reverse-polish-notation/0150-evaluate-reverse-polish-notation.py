class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack=[]
        for i in range(len(tokens)):
            if tokens[i]=="+":
                first=stack.pop()
                second=stack.pop()
                stack.append(first+second)
            elif tokens[i]=="*":
                first=stack.pop()
                second=stack.pop()
                stack.append(first*second)
            elif tokens[i]=="-":
                first=stack.pop()
                second=stack.pop()
                stack.append(second-first)
            elif tokens[i]=="/":
                first=stack.pop()
                second=stack.pop()
                stack.append(int(second/first))
            else:
                stack.append(int(tokens[i]))
        return stack.pop()
        