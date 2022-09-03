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
        int counter=0;
        ListNode countList=head;
        while(countList!=null){
            counter++;
            countList=countList.next;
        }
        if(counter==n){
           return head.next;
        }
        int i=0;
        ListNode pointer=head;
        while(pointer!=null && i<counter-n-1){
            pointer=pointer.next;
            i++;
        }
        pointer.next=pointer.next.next;
        return head;
    }
}