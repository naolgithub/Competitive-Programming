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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode current=head;
        while(current!=null){
            ListNode temp=current.next;
            ListNode prev=dummy;
            ListNode nxt=dummy.next;
            while(nxt!=null){
                if(nxt.val>current.val) {
                    break;
                }
                prev=nxt;
                nxt=nxt.next;
            }
            current.next=nxt;
            prev.next=current;
            current=temp;
        }
        return dummy.next;
    }
}