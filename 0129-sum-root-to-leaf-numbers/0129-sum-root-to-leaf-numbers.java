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
    private int dfs(TreeNode root,int currentSum){
        if(root==null){
            return 0;
        }
        currentSum=currentSum*10+root.val;
        if(root.left==null && root.right==null){
            return currentSum;
        }
        int leftPathSum=dfs(root.left,currentSum);
        int rightPathSum=dfs(root.right,currentSum);
        int totalPathSum=leftPathSum+rightPathSum;
        return totalPathSum;
    }
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
}