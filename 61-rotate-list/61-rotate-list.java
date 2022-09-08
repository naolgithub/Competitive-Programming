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
    public ListNode rotateRight(ListNode head, int k) {
      if(head==null) return head;
      ListNode newHead=head;
      ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        // connecting the last element to the head
        tail.next=head;
        // since k might be greater than length, we have to use modulus operation.
        // we dont how much iteration is so we supposed to do modulus
        k=k%length;
        for(int i=0;i<length-k;i++){
            tail=tail.next;
        }
        newHead=tail.next;
        // making tail.next null
        tail.next=null;
        return newHead;
    }
}