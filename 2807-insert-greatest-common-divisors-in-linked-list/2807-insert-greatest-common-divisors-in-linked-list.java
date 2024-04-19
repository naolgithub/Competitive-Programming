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
        ListNode newNode=new ListNode(data);
        if(newHead==null){
            newHead=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    private int gcd(int x, int y) {
        int greater = x > y ? x : y;
        int smaller = x < y ? x : y;
        int res = smaller;
        while(greater % smaller != 0) {
            res = greater % smaller;
            greater = smaller;
            smaller = res;
        }
        return res;
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        while(current.next!=null){
            prev=current;
            current=current.next;
            ListNode newNode=new ListNode(gcd(prev.val, current.val));
            //connecting new node to the next node
            newNode.next=prev.next;
            //connecting previous node to the new node
            prev.next=newNode;
        }
        return head;
    }
}