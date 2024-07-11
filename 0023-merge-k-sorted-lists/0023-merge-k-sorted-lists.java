/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
        //MinHeap to track the smallest node from each list
        PriorityQueue<ListNode> minHeap=new PriorityQueue<>((a, b) -> a.val - b.val);
        //Insert the head of each non empty list into heap
        for(ListNode node : lists){
            if(node!=null){
                minHeap.offer(node);
            }
        }
        //Dummy head for the result list
        ListNode naol=new ListNode(-324242);
        ListNode currentNode=naol;
        // Extract the smallest node from the heap, connect it to the result list, 
        // and insert the next node from the extracted node's list into the heap
        while(!minHeap.isEmpty()){
            ListNode smallestNode=minHeap.poll();
            currentNode.next=smallestNode;
            currentNode=currentNode.next;
            //Insert the next node from the extracted node's list into the heap
            if(smallestNode.next!=null){
                minHeap.offer(smallestNode.next);
            }
        }
        return naol.next;
    }
}