# class Solution {
#     public int findMinDifference(List<String> list) {
#         int[] timePointsArray = new int[list.size()];
#         //change hours to equivalent minutes
#         for (int i = 0; i < list.size(); i++) {
#             int hour = Integer.valueOf(list.get(i).substring(0,2));
#             int minute = Integer.valueOf(list.get(i).substring(3,5));
#             timePointsArray[i] = hour*60+minute;
#         }
        
#         Arrays.sort(timePointsArray);
#         //eg1: sortedTimePoints = ["00:00","23:59"] and its min diff is 1.=> 0+24*60-23*60+59==1
#         int minimumMinute = timePointsArray[0]+24*60-timePointsArray[list.size()-1];
#         for (int i = 1; i < list.size(); i++) {
#             minimumMinute = Math.min(minimumMinute, timePointsArray[i]-timePointsArray[i-1]);
#         }
#         return minimumMinute;
#     }
# }

class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        timePointsArray=[]
        for timePoint in timePoints:
            hour=int(timePoint[0:2])
            minute=int(timePoint[3:5])
            timePointsArray.append(hour*60+minute)
        timePointsArray.sort()
        minimumMinute = timePointsArray[0] + 24 * 60 - timePointsArray[-1]
        for i in range(1,len(timePointsArray)):
            minimumMinute=min(minimumMinute,timePointsArray[i]-timePointsArray[i-1])
        return minimumMinute
        
        
        