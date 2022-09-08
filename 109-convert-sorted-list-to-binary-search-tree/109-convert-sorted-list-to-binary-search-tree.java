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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
    if(head == null) return null;
    ListNode middle = findMiddleList(head);
    TreeNode root = new TreeNode(middle.val);
    //if there are only one element in the list
    if(head == middle) return root;
    // now our head traverse up to the previous of the middle node and we assign it on left node
    root.left = sortedListToBST(head);
        // now our middl traverse up to the end of the node and we assign it on right node
    root.right = sortedListToBST(middle.next);
    return root;
    
}
// this function is to find the middle Node form the given linked list
  public ListNode findMiddleList(ListNode head){
        ListNode prev = head, slow = head, fast = head;
        while(fast != null && fast.next != null){
             prev = slow;
             slow = slow.next;
            fast = fast.next.next;
        }
      // after we get the middle node we make the node before middle node points to null
      // so make prev points to null
      // means we are dividing the list into three
        //1.the left node
        //2.the mid node
        //3.the right node
        if(prev != null) prev.next = null;
      return slow;
  }
    }
