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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        // Calculate the number of paths with sum equal to targetSum starting from the current node
        int pathsFromRoot = countPathsWithSum(root, targetSum);

        // Recur for left and right subtrees and add the number of paths
        int pathsOnLeft = pathSum(root.left, targetSum);
        int pathsOnRight = pathSum(root.right, targetSum);

        // Total number of paths
        return pathsFromRoot + pathsOnLeft + pathsOnRight;
    }

    private int countPathsWithSum(TreeNode node, long targetSum) {
        if (node == null) {
            return 0;
        }

        // Number of paths with sum equal to targetSum starting from the current node
        int totalPaths = 0;
        if (node.val == targetSum) {
            totalPaths++;
        }

        // Recur for left and right children with the reduced sum
        totalPaths += countPathsWithSum(node.left, targetSum - node.val);
        totalPaths += countPathsWithSum(node.right, targetSum - node.val);

        return totalPaths;
    }

}