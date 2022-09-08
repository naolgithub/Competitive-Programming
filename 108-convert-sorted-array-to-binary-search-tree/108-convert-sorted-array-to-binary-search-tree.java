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
        return CreateBSTFromArray(nums, 0, nums.length - 1);
    }

    private TreeNode CreateBSTFromArray(int nums[], int left, int right) {
        if (left > right) { // Base Condition or Recursion Stoping Condition
            return null;
        }
       // make midpoint a root of TreeNode
        int midPoint = (left+right) / 2; 
        TreeNode root = new TreeNode(nums[midPoint]); // mid value or median 
        root.left = CreateBSTFromArray(nums, left, midPoint - 1); // assign the value for left of subtree that is left to midpoint-1 for given array
        root.right = CreateBSTFromArray(nums, midPoint + 1, right); // assign the value for right go subtree that is midpoint+1 to right for given array
        return root;
    }

    }
