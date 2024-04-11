# class Solution {
#     public int compareVersion(String version1, String version2) {
#         String[] arrayOne = version1.split("\\.");
#         String[] arrayTwo = version2.split("\\.");

#         int first = 0;
#         int second = 0;

#         while (first < arrayOne.length || second < arrayTwo.length) {
#             int num1 = first < arrayOne.length ? Integer.parseInt(arrayOne[first]) : 0;
#             int num2 = second < arrayTwo.length ? Integer.parseInt(arrayTwo[second]) : 0;

#             if (num1 < num2) {
#                 return -1;
#             } else if (num1 > num2) {
#                 return 1;
#             }
#             first++;
#             second++;
#         }

#         return 0;
#     }
# }
class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        arrayOne=version1.split(".")
        arrayTwo=version2.split(".")
        first=0
        second=0
        while first<len(arrayOne) or second<len(arrayTwo):
            num1=arrayOne[first] if first<len(arrayOne) else 0
            num2=arrayTwo[second] if second<len(arrayTwo) else 0
            num1=int(num1)
            num2=int(num2)
            if num1<num2:
                return -1
            elif num1>num2:
                return 1
            first+=1
            second+=1
        return 0
    
        
        