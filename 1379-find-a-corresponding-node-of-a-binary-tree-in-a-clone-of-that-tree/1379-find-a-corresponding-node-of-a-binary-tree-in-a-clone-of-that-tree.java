/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode answer,target;
    public void inorder(TreeNode o, TreeNode c){
   if(o!=null){
       inorder(o.left,c.left);
        if(o==target){
            answer=c;
        }
        inorder(o.right,c.right);
   }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target=target;
        inorder(original,cloned);
        return answer;
    }
}