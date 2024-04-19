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
import java.math.BigInteger;
class Solution {
    private ListNode newHead;
    private ListNode tail;
    private void buildListNode(int data){
        ListNode newNode=new ListNode(data);
        if(newHead==null){
            newHead=newNode;
            tail=newNode;
        }
        else{
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
    public ListNode doubleIt(ListNode head) {
        //Brute force approach
        // StringBuilder sb=new StringBuilder();
        // ListNode current=head;
        // while(current!=null){
        //     sb.append(current.val);
        //     current=current.next;
        // }
        // BigInteger doubled = new BigInteger(sb.toString()).multiply(BigInteger.valueOf(2));
        // String doubledString=doubled.toString();
        // for(char c: doubledString.toCharArray()){
        //     buildListNode(Integer.parseInt(c+""));
        // }
        // return newHead;
        
        
        //Optimized approach
        ListNode current=head;
        ListNode reversed=reverseListNode(current);
        int carry=0;
        while(reversed!=null || carry!=0){
            int digit=(reversed!=null) ? reversed.val : 0 ;
            int multiply=digit*2+carry;
            buildListNode(multiply%10);
            carry=multiply/10;
            
            reversed=(reversed!=null)? reversed.next : null;
        }
        ListNode builtListNode=reverseListNode(newHead);
        return builtListNode;
    }
}