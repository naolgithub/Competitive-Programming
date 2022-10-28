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
    private ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode next=null;
        ListNode prev=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode dummy = new ListNode(0);
         dummy.next = head;
         ListNode pre = dummy;
          ListNode end = dummy;
         while (end != null) {
              for (int i = 0; i < k && end != null; i++) {
                end = end.next;
             }
             if (end == null) {
                break;
             }
             ListNode nextStart = end.next;
             ListNode start = pre.next;
             end.next = null;
             pre.next = reverse(start);
             start.next = nextStart;
             pre = start;
             end = pre;
         }
         return dummy.next;
    }
}