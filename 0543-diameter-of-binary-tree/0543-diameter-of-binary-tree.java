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
    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root);
    }

  public static int dia(TreeNode node){
       if(node==null){
          return 0;
       }

       int ld= dia(node.left);
       int rd= dia(node.right);

       int f=height(node.left)+height(node.right)+2;

       int dia=Math.max(f,Math.max(ld,rd));

       return dia;
    }

  public static int height(TreeNode node){

    if(node==null){
         return -1; //  -1 for eges and 0 for nodes
    }

    int lh=height(node.left);
    int rh=height(node.right);
    int th=Math.max(lh, rh)+1;

    return th;

  }
}