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
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if (cur.val <= cur.next.val) {
                cur = cur.next;
            } else {
                ListNode lesserElement = dummy;
                while (lesserElement.next != null && lesserElement.next.val < cur.next.val) {
                    lesserElement = lesserElement.next;
                }

                ListNode temp = cur.next;
                cur.next = temp.next;
                temp.next = lesserElement.next;
                lesserElement.next = temp;
            }
        }

        return dummy.next;
    }
}