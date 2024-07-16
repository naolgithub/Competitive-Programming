class Solution:
    def getOrder(self, tasks: List[List[int]]) -> List[int]:
        # Add original indices to the tasks
        for index, task in enumerate(tasks):
            task.append(index)
        # Sort the tasks based on their enqueue time
        tasks.sort(key=lambda time: time[0])
        
        result = []
        minHeap = []
        currentTaskToQueue = 0
        currentTime = tasks[0][0]
        
        # Loop until all tasks are processed
        while minHeap or currentTaskToQueue < len(tasks):
            # Add all tasks to the heap whose enqueue time is <= current time
            while currentTaskToQueue < len(tasks) and currentTime >= tasks[currentTaskToQueue][0]:
                heapq.heappush(minHeap, [tasks[currentTaskToQueue][1], tasks[currentTaskToQueue][2]])
                currentTaskToQueue += 1
            
            if not minHeap:
                # If the heap is empty, move currentTime to the next task's enqueue time
                currentTime = tasks[currentTaskToQueue][0]
            else:
                # Pop the task with the smallest processing time
                processingTime, index = heapq.heappop(minHeap)
                currentTime += processingTime
                result.append(index)
        
        return result
