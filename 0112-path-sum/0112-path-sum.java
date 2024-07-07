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
    boolean dfs(TreeNode root,int currentSum,int targetSum){
        if(root==null){
            return false;
        }
        currentSum+=root.val;
        if (root.left==null && root.right==null){
            return currentSum==targetSum;
        }
        return dfs(root.left,currentSum,targetSum) || dfs(root.right,currentSum,targetSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,0,targetSum);
    }
}