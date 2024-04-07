# class Solution {
#     public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
#         Collections.sort(processorTime);
#         Collections.sort(tasks,Collections.reverseOrder());
#         //tasks=[8,7,5,4,3,2,2,1]
#         //processorTime=[8,10]
#         //max(8+8,10+3)=16
#         int minimumTimeMaximumTask=Integer.MIN_VALUE;
#         int processorTimeIndex=0;
#         for(int i=0;i<tasks.size();i+=4){
#             int currentTask=tasks.get(i)+processorTime.get(processorTimeIndex);
#             minimumTimeMaximumTask=Math.max(minimumTimeMaximumTask,currentTask);
#             processorTimeIndex++;
#         }
#         return minimumTimeMaximumTask;
#     }
# }
class Solution:
    def minProcessingTime(self, processorTime: List[int], tasks: List[int]) -> int:
        processorTime.sort()   #[8,10]
        tasks.sort(reverse = True) #[8,7,5,4,3,2,2,1]
        #tasks=[8,7,5,4,3,2,2,1]
        #processorTime=[8,10]
        # return max(8+8,10+3)15
        minimumTimeMaximumTask = 0
        processorTimeIndex = 0
        
        for i in range(0, len(tasks), 4):
            currentTask=tasks[i] + processorTime[processorTimeIndex]
            minimumTimeMaximumTask = max(minimumTimeMaximumTask,currentTask)
            processorTimeIndex += 1
        return minimumTimeMaximumTask
