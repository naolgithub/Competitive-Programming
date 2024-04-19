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
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        int max = prev.val;
        ListNode res = new ListNode();
        ListNode r = res.next;
        while(prev != null) {
            if(prev.val >= max) {
                max = Integer.max(max, prev.val);
                ListNode newNode = new ListNode(prev.val);
                res.next = newNode;
                newNode.next = r;
                r = newNode;
            }
            prev = prev.next;
        }
        return res.next;
    }
}
