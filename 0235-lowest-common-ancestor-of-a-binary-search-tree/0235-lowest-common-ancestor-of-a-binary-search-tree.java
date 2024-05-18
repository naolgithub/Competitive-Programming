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
        //First Approach
        
        // TreeNode currentNode=root;
        // while(currentNode!=null){
        //     if(p.val>currentNode.val && q.val>currentNode.val){
        //         currentNode=currentNode.right;
        //     }
        //     else if(p.val<currentNode.val && q.val<currentNode.val){
        //         currentNode=currentNode.left;
        //     }
        //     else{
        //         return currentNode;
        //     }
        // }
        // return null;
        
        //Second Approach
        if(Math.min(p.val,q.val)<root.val && Math.max(p.val,q.val)>root.val){
            return root;
        }
        else if(p.val==root.val){
            return root;
        }
        else if(q.val==root.val){
            return root;
        }
        else if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else if(p.val>root.val && q.val>root.val){
           return lowestCommonAncestor(root.right,p,q); 
        }
        return null;
    }
}