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
         // solving Using hashset
        /**
        HashSet set = new HashSet<>();
        
        while(headA != null || headB != null)
        {
            if(set.contains(headA))
            {
                return headA;
            }
            else if(set.contains(headB))
            {
                return headB;
            }
            else if(headA == headB)
            {
                return headA;
            }
            
            if(headA != null)
            {
                set.add(headA);
                headA = headA.next;
            }
            if(headB != null)
            {
                set.add(headB);
                headB = headB.next;
            }
        }
        return null;
        
        */
            
        //Solving Using stack
        Stack<ListNode> stackA= new Stack<>();
        Stack<ListNode> stackB= new Stack<>();
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            stackA.push(tempA);
            tempA=tempA.next;
        }
        while(tempB!=null){
            stackB.push(tempB);
            tempB=tempB.next;
        }
        ListNode prev=null;
        while(!stackA.isEmpty()&&!stackB.isEmpty()){
            if(stackA.peek()==stackB.peek()){
                prev=stackB.peek();
                stackA.pop();
                stackB.pop();
            }
            else{
                break;
            }
        }
        return prev;
    }
}