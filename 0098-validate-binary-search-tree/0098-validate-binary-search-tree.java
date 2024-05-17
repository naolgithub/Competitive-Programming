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
    private boolean isValidBST(TreeNode root, long leftSideValue, long rightSideValue) {
        if (root == null) {
            return true;
        }
        
        if (leftSideValue>=root.val || rightSideValue <=root.val) {
            return false;
        }
        
        return isValidBST(root.left, leftSideValue, root.val) && isValidBST(root.right, root.val, rightSideValue);
    }
    
    public boolean isValidBST(TreeNode root) {
        long leftSideValue=Long.MIN_VALUE;
        long rightSideValue=Long.MAX_VALUE;
        return isValidBST(root, leftSideValue, rightSideValue);
    }
}