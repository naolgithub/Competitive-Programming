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
    private ListNode reverseListNode(ListNode head){
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       ListNode reversed=reverseListNode(slow);
        while(reversed!=null && head!=null){
            if(reversed.val!=head.val) return false;
            else{
            reversed=reversed.next;
            head=head.next;
            }
        }
        return true;
    }
}