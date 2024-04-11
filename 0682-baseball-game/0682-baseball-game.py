# class Solution {
#     public int calPoints(String[] operations) {
#         Stack<Integer> stack=new Stack();
#         int totalScore=0;
#         for(int i=0;i<operations.length;i++){
#             if(operations[i].equals("C") && !stack.isEmpty()){
#                 stack.pop();
#             }
#             else if(operations[i].equals("D") && !stack.isEmpty() ){
#                 int topElement=stack.peek();
#                 stack.push(topElement*2);
#             }
#             else if(operations[i].equals("+")){
#                 int lastElement=0;
#                 if(!stack.isEmpty()){
#                    lastElement=stack.pop(); 
#                 }
#                 int secondLastElement=0;
#                 if(!stack.isEmpty()){
#                     secondLastElement=stack.pop();
#                 }
#                 int sum=lastElement+secondLastElement;
#                 stack.push(secondLastElement);
#                 stack.push(lastElement);
#                 stack.push(sum);
#             }
#             else{
#                 stack.push(Integer.valueOf(operations[i]));
#             }
#         }
#         while(!stack.isEmpty()){
#             totalScore+=stack.pop();
#         }
#         return totalScore;
#     }
# }
class Solution:
    def calPoints(self, operations: List[str]) -> int:
        totalScore=0
        stack=[]
        for i in range(len(operations)):
            if operations[i]=="C" and stack:
                stack.pop()
            elif operations[i]=="D" and stack:
                topElement=stack[-1]
                stack.append(topElement*2)
            elif operations[i]=="+":
                lastElement=0
                if stack:
                    lastElement=stack.pop()
                secondLastElement=0
                if stack:
                    secondLastElement=stack.pop()
                sumOperation=lastElement+secondLastElement
                stack.append(secondLastElement)
                stack.append(lastElement)
                stack.append(sumOperation)
            else:
                stack.append(int(operations[i]))
        while stack:
            totalScore+=stack.pop()
        return totalScore
        