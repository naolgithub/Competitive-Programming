/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // move next value of given node to previous value given node
        node.val=node.next.val;
        // move next pointer of given node to previous pointer of given node
        node.next=node.next.next;
    }
}