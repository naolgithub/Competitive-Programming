# class Solution {
#     public int[] replaceElements(int[] arr) {
#         int[] array=new int[arr.length];
#         int maxElement=Integer.MIN_VALUE;
#         if(arr.length==1) return new int[]{-1};
#         array[arr.length-1]=-1;
#         for(int i=arr.length-2;i>=0;i--){
#             maxElement=Math.max(maxElement,arr[i+1]);
#             array[i]=maxElement;
#         }
#         return array;
#     }
# }

class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        array=[0]*len(arr)
        maxElement=float("-inf")
        if len(arr)==1:
            return [-1]
        array[len(arr)-1]=-1
        for i in range(len(arr)-2,-1,-1):
            maxElement=max(maxElement,arr[i+1])
            array[i]=maxElement
        return array
        
        