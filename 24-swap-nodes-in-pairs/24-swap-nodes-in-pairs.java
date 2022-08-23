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
    public ListNode swapPairs(ListNode head) {
        // USING REVERSE THE FIRST TWO NODES AND
        //GIVE THE REST TO THE RECURSION
        
        //ListNode current=head;
        //ListNode next=null;
        //ListNode prev=null;
        //int count=0;
        //while(current!=null && count<2){
          //  next=current.next;
            //current.next=prev;
            //prev=current;
            //current=next;
            //count++;
        //}
        //if(next!=null){
          //  head.next=swapPairs(next);
        //}
        //return prev;
        
       
// JUST SWAPING THE NODES. 
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode current=temp;
        while(current.next!=null&&current.next.next!=null){
            ListNode firstNode=current.next;
            ListNode secondNode=current.next.next;
            //assigning the next of 2nd node 
            //to the next of 1st node.
            firstNode.next=secondNode.next;
            current.next=secondNode;
            current.next.next=firstNode;   
            current=current.next.next;
        }
        return temp.next;
    }
}