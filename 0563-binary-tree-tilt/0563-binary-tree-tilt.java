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
    int tilt=0;
    public int findTilt(TreeNode root) {
     int node=Bt_tilt(root);
     System.out.println(node);   //print the sum of all node value but the queston dont ask for total sum 
     return tilt;               //return  the tilted value because the quastion ask for tilted value
    }

  public int Bt_tilt(TreeNode node){
        if(node==null){
             return 0;
        }

        int lst=Bt_tilt(node.left);    //it will return left sum and return chenged tilte value on left side
        int rst=Bt_tilt(node.right);   //it will return right sum and return chenged tilte value on right side

        int ltilt=Math.abs(lst-rst);   //this is give absulue value of left and right data

        tilt+=ltilt;                    //add absolute value in lilt

        int ts=lst+rst+node.val;        //increment the total sum

        return ts;                      //return total sum



    }
}