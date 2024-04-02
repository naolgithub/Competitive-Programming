# class Solution {
#     public int chalkReplacer(int[] chalk, int k) {
#         long sumOfChalk=0;
#         for(int i=0;i<chalk.length;i++){
#             sumOfChalk+=chalk[i];
#         }
#         //Assumption:
        
#         //Subtract the sum of chalk from k until k is less than the sum of chalk.
#         while(k>=sumOfChalk){
#             k-=sumOfChalk;
#         }
#         //or 
#         ////equals to k modulo sumOfChalk
        
#         // k%=sumOfChalk;
        
#         for(int i=0;i<chalk.length;i++){
#             if(k>=chalk[i]){
#                k-=chalk[i]; 
#             }
#             else {
#                 return i;
#             }
#         }
#         return -1;
#     }
# }
class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        if len(chalk)==1:
            return 0
        
        sumOfChalk=0
        for i in range(len(chalk)):
            sumOfChalk+=chalk[i]
            
        while k>=sumOfChalk:
            k-=sumOfChalk
            
        for i in range(len(chalk)):
            if k>=chalk[i]:
                k-=chalk[i]
            else:
                return i
        return 0
    
        