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
        
        HashSet<ListNode> visited = new HashSet<>();
        
        while(headA != null){
            visited.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
          if(visited.contains(headB)) return headB;
          else headB=headB.next;
        }
        return null;
        
        /*
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
                
            }
            else{
                break;
            }
        }
        return prev;
        */
            
    }
}