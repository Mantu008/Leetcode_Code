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
     boolean isgap=true;
    public boolean isBalanced(TreeNode root) {
          balance(root);
          return isgap;
    }
    
    public int balance(TreeNode node){
       if(node==null){
           return 0;
       }

       int lh=balance(node.left);
       int rh=balance(node.right);

       int gap=Math.abs(lh-rh);
       if(gap>1){
          isgap=false;     
       }

       return 1+Math.max(lh,rh);

    }
}