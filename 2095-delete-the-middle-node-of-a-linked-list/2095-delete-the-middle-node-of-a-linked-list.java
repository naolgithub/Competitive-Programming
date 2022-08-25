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
    public ListNode deleteMiddle(ListNode head) {
  // If ListNode contains only one node 
        if (head.next == null) return null;   
        ListNode fast = head;
        ListNode slow = head;
        
   // We find out the middle node
        while (fast != null && fast.next != null) {     
            fast = fast.next.next;
            slow = slow.next;
           }
        
        ListNode temp = head;    
        // We move to the node just before the middle node
        while (temp.next != slow) {     
            temp = temp.next;
        }
        
// We replace the middle node with the node next to the middle node
        temp.next = temp.next.next;  
        
        // Now middle node is removed.
        
        return head;
    }
}