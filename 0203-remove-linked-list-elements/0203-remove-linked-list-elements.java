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
    private ListNode anotherHead=null;
    private ListNode tail=null;
    private void build(int data){
        ListNode newNode=new ListNode(data);
        if(anotherHead==null){
            anotherHead=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null){
            if(head.val!=val) build(head.val);
            head=head.next;
        }
        return anotherHead;
    }
}