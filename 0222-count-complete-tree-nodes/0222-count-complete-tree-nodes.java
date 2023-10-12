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
    public int countNodes(TreeNode root) {
       return size(root); 
    }

    public static int size(TreeNode node){

         if(node==null){
             return 0;
        }
        
       int ls=size(node.left);
       int rs=size(node.right);
       int ts=ls+rs+1;

       return ts;

    }
}