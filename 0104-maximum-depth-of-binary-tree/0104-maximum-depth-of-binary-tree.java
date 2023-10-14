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
        return height(root);
    }

  public static int height(TreeNode node){

    if(node==null){
         return 0; //  -1 for eges and 0 for nodes
    }

    int lh=height(node.left);
    int rh=height(node.right);
    int th=Math.max(lh, rh)+1;

    return th;

  }
}






























