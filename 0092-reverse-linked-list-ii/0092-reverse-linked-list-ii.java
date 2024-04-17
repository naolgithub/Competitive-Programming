
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(234332);
        dummy.next=head;
        ListNode pointer=dummy;
        ListNode current=head;
        
        for(int i=0;i<left-1;i++){
        pointer=current;
        current=current.next;
        }
        
        ListNode prev=null;
        ListNode next=null;
        
        for(int i=0;i<right-left+1;i++){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
        }
        
        pointer.next.next=current;
        pointer.next=prev;
        return dummy.next;
    }
}