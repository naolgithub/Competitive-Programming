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
    public ListNode swapNodes(ListNode head, int k) {
       if( k == 0 || head == null ) return null;
        
        
        // finding the length of the ListNode
        int  length = 0;
        ListNode tempNode = head;
        while( tempNode != null  ){
            tempNode = tempNode.next;
            length++;
        }
        
        // traversing upto k
        ListNode tempOne = head;
        for( int i = 0 ; i < k-1 ;  i++ ){
            tempOne = tempOne.next;
        }
        
        
        // traversing upto length - k;
        ListNode tempTwo = head;
        for( int i = 0 ; i < length-k; i++ ){
            tempTwo = tempTwo.next;
        }
        
        // swapping the (tempOne at k )to (tempTwo at length-k) and vice versa
        int temp= tempTwo.val;
        tempTwo.val = tempOne.val;
        tempOne.val = temp;
        
        return head;
    }
}