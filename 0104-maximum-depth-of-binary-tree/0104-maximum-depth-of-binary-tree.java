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
    public int maxDepth(TreeNode root) {
        return depth(root);
    }

    public static int depth(TreeNode node){
       if(node==null){
           return 0;
       }

       int lh=depth(node.left);
       int rh=depth(node.right);

       return 1+(Math.max(lh,rh));
    }
}