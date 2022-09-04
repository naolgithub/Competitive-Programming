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
    private ListNode middleList(ListNode middle){
        ListNode slow=middle;
        ListNode fast=middle;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverseMiddleList(ListNode head){
         ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        // find middle of linked list
       ListNode middle=middleList(head);
        // reverse middle linkedlist and assign on head2
       ListNode head2=reverseMiddleList(middle);
        // assign head on head1
        // head1 contains all elements of node
        // head2 contains half of elements of head1
       ListNode head1=head;
       while(head1 != null && head2 != null){
           ListNode next = head1.next;
           head1.next = head2;
           head1 = next;
           
           next = head2.next;
           head2.next = head1;
           head2 = next;
           
       }
        // if still head1 contains some more elements 
        // point next of head1 to null
        if(head1 != null) head1.next = null;
        // since reorderList is void we only update the given list
    }
}