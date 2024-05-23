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
    private boolean foundPathSum = false;    
    private void dfs(TreeNode root, int parentSum,int targetSum) {
        // base case
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            int pathSum = root.val + parentSum;
            if (pathSum == targetSum) {
                foundPathSum = true;
            }
            return;
        }
        
        // recurrence relation
        dfs(root.left, parentSum + root.val,targetSum);
        dfs(root.right, parentSum + root.val,targetSum);
    }    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root, 0,targetSum);
        return foundPathSum;
    }
}