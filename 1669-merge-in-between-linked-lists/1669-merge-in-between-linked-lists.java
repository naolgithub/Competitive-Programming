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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode beforeA = null;
        ListNode current = list1;

        // Set beforeA to node a - 1 and current to node b
        for (int index = 0; index < b; index++) {
            if (index == a - 1) {
                beforeA = current;
            }
            current = current.next;
        }
        // Connect the beforeA node to list2
        beforeA.next = list2;

        // Find the tail of list2
        while (list2.next != null) {
            list2 = list2.next;
        }
        // Set the tail of list2 to current.next
        list2.next = current.next;
        
        return list1;
    }
}