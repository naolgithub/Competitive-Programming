/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode currentNode=root;
        while(currentNode!=null){
            if(p.val>currentNode.val && q.val>currentNode.val){
                currentNode=currentNode.right;
            }
            else if(p.val<currentNode.val && q.val<currentNode.val){
                currentNode=currentNode.left;
            }
            else{
                return currentNode;
            }
        }
        return null;
    }
}