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
    TreeNode current=new TreeNode(0);
    public TreeNode increasingBST(TreeNode root) {
    TreeNode ans=current;
        helper(root);
        return ans.right;
    }
    public void helper(TreeNode node){
        if(node==null){
            return;
        }
        helper(node.left);
        node.left=null;
        current.right=node;
        current=node;
        helper(node.right);
    }
}