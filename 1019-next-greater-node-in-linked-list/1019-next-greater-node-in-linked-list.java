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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();
       ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int[] array=new int[list.size()];
        for(int i=0;i<array.length;i++){
            array[i]=list.get(i);
        }
        int[] result=new int[list.size()];
       for(int i=0;i<array.length;i++){
         for(int j=i+1;j<array.length;j++){
           if(array[j]>array[i]){
               result[i]=array[j];
               break;
           }
          else{
            result[i]=0;
             }
          }   
       } 
        return result;
    }
}