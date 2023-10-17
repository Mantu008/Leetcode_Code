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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultlist=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return resultlist;
        }
        
        lrvellorder(root,resultlist,list);

        return resultlist;
    }

    public static void  lrvellorder(TreeNode root,List<List<Integer>> resultlist,List<Integer> list){
       Queue<TreeNode> q=new ArrayDeque<>();
       q.add(root);

      while(!q.isEmpty()){
          int size=q.size();
          list=new ArrayList<>();
          for(int i=0;i<size;i++){                                //it is use for store each level element in seprate way 
              TreeNode temp=q.remove();
              list.add(temp.val);

              if(temp.left!=null){
                  q.add(temp.left);
              }

              if(temp.right!=null){
                  q.add(temp.right);
              }
          }
            resultlist.add(list);
      }

    }
}