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
    public TreeNode invertTree(TreeNode root) {
        soln(root);
        return root;
    }

    public static void soln(TreeNode node){
        if(node==null){
             return;
         }

         if(node.left!=null || node.right!=null){
             TreeNode temp;
             temp=node.left;
             node.left=node.right;
             node.right=temp;
         }

         soln(node.left);
         soln(node.right);
    }
}