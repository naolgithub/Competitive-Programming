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
    public int getDecimalValue(ListNode head) {
        ListNode prev=null;
        ListNode current=head;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        ListNode reversedList=prev;
        int i=0;
        int sum=0;
        while(reversedList!=null&&i<=30){
            sum=sum+reversedList.val*((int)Math.pow(2,i));
            reversedList=reversedList.next;
            i++;
        }
        return sum;
    }
}