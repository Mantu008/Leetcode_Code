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
      DiaPair p=diameter1(root);
      return p.dia;
    }

    public static class DiaPair{
           int ht;
           int dia;
    }

  public static DiaPair diameter1(TreeNode node){

      if(node==null){
          DiaPair bp=new DiaPair();
          bp.ht=-1;
          bp.dia=0;
          return bp;  
      }

        DiaPair lp=diameter1(node.left);
        DiaPair rp=diameter1(node.right);

        DiaPair mp=new DiaPair();

        mp.ht=Math.max(lp.ht,rp.ht)+1;

        int fes=lp.ht+rp.ht+2;

        mp.dia=Math.max(fes,Math.max(lp.dia,rp.dia));

        return mp;

     }
}








// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {             //that code time complexity is O(n^2) that is not good
//         return dia(root);
//     }

//   public static int dia(TreeNode node){
//        if(node==null){
//           return 0;
//        }

//        int ld= dia(node.left);
//        int rd= dia(node.right);

//        int f=height(node.left)+height(node.right)+2;

//        int dia=Math.max(f,Math.max(ld,rd));

//        return dia;
//     }

//   public static int height(TreeNode node){

//     if(node==null){
//          return -1; //  -1 for eges and 0 for nodes
//     }

//     int lh=height(node.left);
//     int rh=height(node.right);
//     int th=Math.max(lh, rh)+1;

//     return th;

//   }
// }