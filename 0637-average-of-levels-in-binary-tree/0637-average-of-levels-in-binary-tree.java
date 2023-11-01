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
    public List<Double> averageOfLevels(TreeNode root) {
      ArrayList<Double> ans=new ArrayList<>();
      avg_level(root,ans);  
      return ans;
    }
    public static void avg_level(TreeNode node,ArrayList<Double> ans){
       Queue<TreeNode>q=new ArrayDeque<>();
       q.add(node);

       while(!q.isEmpty()){
          int size=q.size();
          double sum=0;
          for(int i=0;i<size;i++){
              TreeNode temp=q.remove();
              sum=sum+temp.val;

              if(temp.left!=null){
                  q.add(temp.left);
              }

              if(temp.right!=null){
                  q.add(temp.right);
              }

          }
          ans.add(sum/size);
       }
}
}