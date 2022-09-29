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
    private ListNode reverseHalfOfList(ListNode head){
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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        int max=Integer.MIN_VALUE;
        ListNode reversedHalfListNode=reverseHalfOfList(slow);
        while(reversedHalfListNode!=null && head!=null){
            max=Math.max(max,reversedHalfListNode.val+head.val);
            reversedHalfListNode=reversedHalfListNode.next;
            head=head.next;
        }
        return max;
    }
}