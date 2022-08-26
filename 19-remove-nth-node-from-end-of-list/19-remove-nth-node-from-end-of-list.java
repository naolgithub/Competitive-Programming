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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // finding the length of the ListNode
        int  length = 0;
        ListNode tempNode = head;
        while( tempNode != null  ){
            tempNode = tempNode.next;
            length++;
        }
        if (length==n) return head.next;
        // traversing upto length-n;
        ListNode tempOne = head;
        int count=0;
        while(count < length-n-1){
            tempOne = tempOne.next;
            count++;
        }
        tempOne.next=tempOne.next.next;
        return head;
    }
}