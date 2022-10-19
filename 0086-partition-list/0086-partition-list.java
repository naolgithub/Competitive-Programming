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
    }
}