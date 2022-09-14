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
    ListNode anotherBuiltHead;
    ListNode pointer;
    private void buildSinglyLinkedList(int data){
        ListNode node=new ListNode(data);
        if(anotherBuiltHead==null){
            anotherBuiltHead=node;
            pointer=node;
        }
        else{
            pointer.next=node;
            pointer=node;
        }
    }
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            buildSinglyLinkedList(list.get(i));
        }
        return anotherBuiltHead;
    }
}