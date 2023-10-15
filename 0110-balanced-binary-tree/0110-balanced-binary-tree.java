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
     public boolean isBal=true;
    public boolean isBalanced(TreeNode root) {
        int p=isBalance(root);
        return isBal;
    }


    public  int isBalance(TreeNode node){
          if(node==null){
              return 0;
          }

          int lh=isBalance(node.left);
          int rh=isBalance(node.right);
          int gap=Math.absExact(lh-rh);                       // it is for checking balance tree condition 
          if(gap>1){
              isBal=false;
          }
          int th=Math.max(lh, rh)+1;
          return th;
    }
}