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
    public boolean isValidBST(TreeNode root) {
       return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);  
    }


  public static boolean isBST(TreeNode node,long min_val,long max_val){

     if(node==null){
         return true;
     }

     if(node.val>=max_val || node.val<=min_val){
         return false;
     }

     return isBST(node.left,min_val,node.val) && isBST(node.right,node.val,max_val);

  }
}


// class Solution {
//     public boolean isValidBST(TreeNode root) {
//          BSTPair bp=isBST(root);
//          return bp.isBST;
//     }

//       public static class BSTPair{
//         boolean isBST;
//         long min;
//         long max;
//     }

//     public static  BSTPair isBST(TreeNode node){
//        if(node==null){
//           BSTPair bp=new BSTPair();
//           bp.min=(Long.MAX_VALUE);
//           bp.max=(Long.MIN_VALUE);
//           bp.isBST=true;
//           return bp; 
//         }

//         BSTPair lp=isBST(node.left);
//         BSTPair rp=isBST(node.right);
//         BSTPair mp=new BSTPair();
//         mp.isBST=lp.isBST && rp.isBST && (node.val>lp.max && node.val<rp.min);
//         mp.min=Math.min(node.val,Math.min(lp.min, rp.min));
//         mp.max=Math.max(node.val,Math.max(lp.max, rp.max));

//         return mp;
//     }
// }