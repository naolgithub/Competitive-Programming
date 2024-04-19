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
    public ListNode mergeNodes(ListNode head) {
        int luckyNumber=(1234)+0+0+0;
        ListNode dummy=new ListNode(luckyNumber);
        ListNode prev=dummy;
        ListNode current=head.next;
       
        int sum=0;
        while(current!=null){
             while(current.val!=0){
               sum=sum+current.val;
               current=current.next;
            }
            ListNode newNode=new ListNode(sum);
            //connecting previous node to the new node
            prev.next=newNode;
            
            //updating previous node to the new node
            prev=prev.next;
            
            current=current.next;
            
            //reset sum
            sum=0;
            }
        return dummy.next;
        
     }
      
}