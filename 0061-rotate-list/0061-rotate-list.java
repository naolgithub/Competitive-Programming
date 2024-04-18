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
    private void buildListNode(int value){
        ListNode newNode=new ListNode(value);
        if(begin==null){
            begin=newNode;
            end=newNode;
        }
        else{
            end.next=newNode;
            end=newNode;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        //Optimized Approach
        // int sizeOfListNode=1;
        // ListNode findLengthListNode=head;
        // if(head==null) return head;
        // while(findLengthListNode.next!=null){
        //     sizeOfListNode++;
        //     findLengthListNode=findLengthListNode.next;
        // }
        // k=k%sizeOfListNode;
        // if(k==0) return head;
        // ListNode current=head;
        // for(int i=0;i<sizeOfListNode-k-1;i++){
        //     current=current.next;
        // }
        // ListNode start=current.next;
        // current.next=null;
        // findLengthListNode.next=head;
        // return start;
        
        //Medium 
        if(head==null) return head;
        int sizeOfListNode=0;
        ListNode sizeListNode=head;
        while(sizeListNode!=null){
            sizeOfListNode++;
            sizeListNode=sizeListNode.next;
        }
        List<Integer> listOne=new ArrayList();
        List<Integer> listTwo=new ArrayList();
        ListNode first=head;
        k=k%sizeOfListNode;
        if(k==0) return head;
        for(int i=0;i<=sizeOfListNode-k-1;i++){
            // buildListNode(first.val);
            listOne.add(first.val);
            first=first.next;
        }
        // ListNode second=first;
        while(first!=null){
            // buildListNode(second.val);
            listTwo.add(first.val);
            first=first.next;
        }
        for(int i=0;i<listOne.size();i++){
            listTwo.add(listOne.get(i));
        }
        for(int i=0;i<listTwo.size();i++){
            buildListNode(listTwo.get(i));
        }
        return begin;
    }
}

// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// k=k%sizeOfListNode=2%5=2
// 5-2=3


// head = [0,1,2], k = 4
// output:[2,0,1]
// k=k%SizeOfListNode =4%3=1