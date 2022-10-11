// link :https://leetcode.com/problems/find-median-from-data-stream/discuss/1506078/Java-Detailed-Code-Solutions-for-Follow-Ups



/**
 * Using two heaps
 * 
 * Time Complexity:
 * 1) addNum -> O(5 * log (N/2)) = O(log N)
 * 2) findMedian -> O(1)
 *
 * Space Complexity: O(N)
 *
 * N = Count of numbers in the data stream.
 */
class MedianFinder {
    PriorityQueue<Integer> smallNums; // Max Heap
    PriorityQueue<Integer> largeNums; // Min Heap

    public MedianFinder() {
        smallNums = new PriorityQueue<>(Collections.reverseOrder());
        largeNums = new PriorityQueue<>();
    }

    public void addNum(int num) {
        // Add to maxHeap first (Group of smaller numbers)
        smallNums.offer(num);
        // Balance the heaps
        largeNums.offer(smallNums.poll());
        if (largeNums.size() > smallNums.size()) {
            smallNums.offer(largeNums.poll());
        }
    }

    public double findMedian() {
        if (smallNums.size() != largeNums.size()) {
            return smallNums.peek();
        }
        return (smallNums.peek() + largeNums.peek()) / 2.0;
    }
}
