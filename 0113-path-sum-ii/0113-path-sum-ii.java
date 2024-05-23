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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList();
        dfs(new ArrayList(), root, 0, targetSum, result);
        return result;
    }

    public void dfs(List<Integer> path, TreeNode node, int sum, int target, List<List<Integer>> result) {
        if (node == null) {
            return;
        }
        
        path.add(node.val);
        sum += node.val;

        if (node.left == null && node.right == null && sum == target) {
            result.add(new ArrayList(path));
        }

        dfs(path, node.left, sum, target, result);
        dfs(path, node.right, sum, target, result);

        // Backtrack: Remove the last element to explore other paths
        path.remove(path.size() - 1);
    }
}
