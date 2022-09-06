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
  //Idea is to merge the list in such a way that we always take the smaller of the two list. 
         ListNode start = new ListNode(-1);
         //save dummy node so we can go back to it. 
         ListNode save = start; 
    while (list1 !=null && list2!=null){
        if (list1.val > list2.val){
            //pick list2 
            start.next = list2; 
            list2 = list2.next; //increase list of list2
        }
        else {
            //pick list 1
            start.next = list1;
            list1 = list1.next; //increase head of list1
        }
        start = start.next; //increase head of new list
    }
    
    if ( list1 != null){ start.next = list1;} // list1 has elments left over
    if (list2 !=null ){ start.next = list2;} //list2 has elements left over
    return save.next;
    }
}