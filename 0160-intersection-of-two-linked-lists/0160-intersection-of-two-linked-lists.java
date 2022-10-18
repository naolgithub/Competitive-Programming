/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stackOne=new Stack();
        Stack<ListNode> stackTwo=new Stack();
        while(headA!=null){
            stackOne.push(headA);
            headA=headA.next;
        }
        while(headB!=null){
            stackTwo.push(headB);
            headB=headB.next;
        }
        ListNode prev=null;
        while(!stackOne.isEmpty() && !stackTwo.isEmpty()){
            if(stackOne.peek()==stackTwo.peek()){
                prev=stackOne.peek();
                stackOne.pop();
                stackTwo.pop();
            }
            else{
                break;
            }
        }
        return prev;
    }
}