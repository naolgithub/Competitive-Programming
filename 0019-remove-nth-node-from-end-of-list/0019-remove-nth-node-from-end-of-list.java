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
        int lengthCounter=0;
        ListNode countList=head;
        while(countList!=null){
            lengthCounter++;
            countList=countList.next;
        }
        if(lengthCounter==n){ //if lengthCounter==n remove the 1st node of the ListNode
           return head.next;
        }
        int i=0;
        ListNode pointer=head;
        while(pointer!=null && i<lengthCounter-n-1){
            pointer=pointer.next;
            i++;
        }
        pointer.next=pointer.next.next;
        return head;
    }
}