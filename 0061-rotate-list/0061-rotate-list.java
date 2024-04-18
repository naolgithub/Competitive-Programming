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
    private ListNode begin;
    private ListNode end;
    private ListNode buildListNode(int value){
        ListNode newNode=new ListNode(value);
        if(begin==null){
            begin=newNode;
            end=newNode;
        }
        else{
            end.next=newNode;
            end=newNode;
        }
        return begin;
    }
    public ListNode rotateRight(ListNode head, int k) {
        //Optimized Approach
        int sizeOfListNode=1;
        ListNode findLengthListNode=head;
        if(head==null) return head;
        while(findLengthListNode.next!=null){
            sizeOfListNode++;
            findLengthListNode=findLengthListNode.next;
        }
        k=k%sizeOfListNode;
        if(k==0) return head;
        ListNode current=head;
        for(int i=0;i<sizeOfListNode-k-1;i++){
            current=current.next;
        }
        ListNode start=current.next;
        current.next=null;
        findLengthListNode.next=head;
        return start;
    }
}

// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// k=k%sizeOfListNode=2%5=2
// 5-2=3


// head = [0,1,2], k = 4
// output:[2,0,1]
// k=k%SizeOfListNode =4%3=1