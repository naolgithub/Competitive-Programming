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
    private ListNode newHead;
    private ListNode tail;
    private void build(int data){
        ListNode newNode=new ListNode(data);
        if(newHead==null){
            newHead=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int luckyNumber=(1234)+0+0+0;
        ListNode dummy = new ListNode(luckyNumber);
        ListNode buildListNode = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            // ListNode newNode = new ListNode(digit);
            // buildListNode.next = newNode;
            // buildListNode = buildListNode.next;
            build(digit);

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return newHead;
    }
}