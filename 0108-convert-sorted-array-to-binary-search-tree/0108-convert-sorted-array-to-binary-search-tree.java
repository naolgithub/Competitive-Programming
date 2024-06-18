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
   
        public TreeNode sortedArrayToBST(int[] nums) {
        return createBSTFromArray(nums, 0, nums.length - 1);
    }

    private TreeNode createBSTFromArray(int nums[], int left, int right) {
        if (left > right) { 
            return null;
        }
       // make midpoint a root of TreeNode
        int midPoint = (left+right) / 2; 
        TreeNode root = new TreeNode(nums[midPoint]); 
        root.left = createBSTFromArray(nums, left, midPoint - 1); 
        root.right = createBSTFromArray(nums, midPoint + 1, right); 
        return root;
    }

    }
