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
    private ListNode anotherHead;
    private ListNode pointer;
    private ListNode buildList(int data){
        ListNode newNode=new ListNode(data);
        if(anotherHead==null){
            anotherHead=newNode;
            pointer=newNode;
        }
        else{
            pointer.next=newNode;
            pointer=newNode;
        }
        return anotherHead;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        // adding to list
        for(ListNode l : lists){
            while (l != null) {
            list.add(l.val);
            l = l.next;
        }
        }
        // sorting added elements
        Collections.sort(list);
        // giving each elements to buildList one by one
        for(int i=0;i<list.size();i++){
            buildList(list.get(i));
        }
        return anotherHead;
    }
}