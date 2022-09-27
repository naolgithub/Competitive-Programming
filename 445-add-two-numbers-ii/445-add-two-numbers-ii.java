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
    private ListNode reverseList(ListNode head){
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
        //1.reverse l1 and l2
        //2.add the two numbers
        //3.reverse the result
        ListNode listOne=reverseList(l1);
        ListNode listTwo=reverseList(l2);
        
        ListNode dummyHead = new ListNode(0);
        ListNode listThree = dummyHead;
        int carry = 0;
        while (listOne != null || listTwo != null || carry != 0) {
            int l1_val = (listOne != null) ? listOne.val : 0;
            int l2_val = (listTwo != null) ? listTwo.val : 0;
            
            int currentSum = carry + l1_val + l2_val;
            
            carry = currentSum / 10;
            
            int lastDigit=currentSum%10;
            
            ListNode newNode=new ListNode(lastDigit);
            listThree.next = newNode;
            listThree = listThree.next;
            if (listOne != null)
                listOne = listOne.next;
            if (listTwo != null)
                listTwo = listTwo.next;
        }
        
        return reverseList(dummyHead.next);
    }
}