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
import java.util.Random;
class Solution {
  private List<Integer> randomNode=new ArrayList<>();
    public Solution(ListNode head) {
        while(head!=null){
            // storing linked list in arraylist and it is inefficient for larger linked list
            randomNode.add(head.val);
            head=head.next;
        }
    }
    
    public int getRandom() {
        //built in random method(Math.random---->>> returns decimal number b/n 0 and less than 1)
        int randomPicker=(int)(Math.random()*randomNode.size());
        // generating random integers from 0 to size of randomNode
        return randomNode.get(randomPicker);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */