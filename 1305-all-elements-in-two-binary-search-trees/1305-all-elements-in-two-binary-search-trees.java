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
    private void inorder(TreeNode root,List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    private List<Integer> mergeTwoSortedList(List<Integer> listOne,List<Integer> listTwo){
    List<Integer> answer=new ArrayList<>();
    int i=0,j=0;
    while(i<listOne.size()&&j<listTwo.size()){
     if(listOne.get(i)>listTwo.get(j)){
         answer.add(listTwo.get(j++));
     } 
        else
            answer.add(listOne.get(i++));
     
      }
        // if number of elements in listOne is greater than listTwo
        while(i<listOne.size()){
            answer.add(listOne.get(i++));
        }
         // if number of elements in listTwo is greater than listOne
        while(j<listTwo.size()){
            answer.add(listTwo.get(j++));
        }
        return answer;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
       List<Integer> listOne=new ArrayList<>();
       List<Integer> listTwo=new ArrayList<>();
        inorder(root1,listOne);
        inorder(root2,listTwo);
        return mergeTwoSortedList(listOne,listTwo);
    }
}