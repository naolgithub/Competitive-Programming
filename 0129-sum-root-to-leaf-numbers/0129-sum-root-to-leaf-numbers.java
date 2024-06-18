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
        int left=dfs(root.left,currentSum);
        int right=dfs(root.right,currentSum);
        int totalSum=left+right;
        return totalSum;
    }
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
}