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
        /*
        private ListNode anotherHead;
        private ListNode tail;
        private void buildListNode(int data){
                ListNode newNode=new ListNode(data);
                if(anotherHead==null){
                        anotherHead=newNode;
                        tail=newNode;
                }
                else{
                        tail.next=newNode;
                        tail=newNode;
                }
        }
    public ListNode partition(ListNode head, int x) {
            List<Integer> list=new ArrayList<>();
            ListNode tempOne=head;
            while(tempOne!=null){
                    if(tempOne.val<x){
                            list.add(tempOne.val);
                    }
                    tempOne=tempOne.next;
            }
            ListNode tempTwo=head;
            while(tempTwo!=null){
                    if(tempTwo.val>=x){
                            list.add(tempTwo.val);
                    }
                    tempTwo=tempTwo.next;
            }
            for(int i=0;i<list.size();i++){
                    buildListNode(list.get(i));
            }
            return anotherHead;
            */
    public ListNode partition(ListNode head, int x) { 
    /*
    Time Complexity: O(N), where N is the number of nodes in the original linked list and we iterate the original list.
Space Complexity: O(1), we have not utilized any extra space, the point to note is that we are reforming the original list, by moving the original nodes, we have not used any extra space as such.
    */
                // before and after are the two pointers used to create the two list
        // before_head and after_head are used to save the heads of the two lists.
        // All of these are initialized with the dummy nodes created.
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {

            // If the original list node is lesser than the given x,
            // assign it to the before list.
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                // If the original list node is greater or equal to the given x,
                // assign it to the after list.
                after.next = head;
                after = after.next;
            }

            // move ahead in the original list
            head = head.next;
        }

        // Last node of "after" list would also be ending node of the reformed list
        after.next = null;

        // Once all the nodes are correctly assigned to the two lists,
        // combine them to form a single list which would be returned.
        before.next = after_head.next;

        return before_head.next;
    }
}