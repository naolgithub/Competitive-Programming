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
    private void buildListNode(int data){
        ListNode newNode = new ListNode(data);
        if(newHead==null){
            newHead=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    private ListNode reverseListNode(ListNode head){
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listOne=reverseListNode(l1);
        ListNode listTwo=reverseListNode(l2);
        int carry=0;
        while(listOne!=null || listTwo!=null || carry!=0){
            int digitOne=(listOne!=null)?listOne.val:0;
            int digitTwo=(listTwo!=null)?listTwo.val:0;
            int sum=digitOne+digitTwo+carry;
            int digit=sum%10;
            carry=sum/10;
            buildListNode(digit);
            listOne=(listOne!=null)? listOne.next: null;
            listTwo=(listTwo!=null)? listTwo.next: null;
        }
        ListNode reversedNewHead=reverseListNode(newHead);
        return reversedNewHead;
    }
}