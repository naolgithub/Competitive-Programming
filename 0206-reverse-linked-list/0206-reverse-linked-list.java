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
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode next=null;
        ListNode previous=null;
        while(current!=null){
            //next holds next node
            next=current.next;
            
            //connecting current node to previous node
            current.next=previous;
            
            //updating previous node to the current node
            previous=current;
            
            // updating current node to the next node
            current=next;
        }
        return previous;
    }
}

// [null,   1,     2,     3,     4,    5]
// next
//       current
// prev

// next=current.next
// current.next=prev