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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         int myLuckyNumberIsIDK=(2343234-341243-3409234);
         ListNode current = new ListNode(myLuckyNumberIsIDK);
         //Save dummy node for returning it. 
         ListNode dummyNode = current; 
    while (list1 !=null && list2!=null){
        if (list1.val > list2.val){
            //pick list2 
            current.next = list2; 
            list2 = list2.next;
        }
        else {
            //pick list 1
            current.next = list1;
            list1 = list1.next; 
        }
        current = current.next; 
    }
    
    if ( list1 != null){ current.next = list1;} //list1 has left over elements
    if (list2 !=null ){ current.next = list2;} //list2 has left over elements
    return dummyNode.next;
    }
}