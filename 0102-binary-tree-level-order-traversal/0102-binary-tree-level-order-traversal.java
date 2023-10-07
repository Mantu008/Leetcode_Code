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
    List<List<Integer>> resultList = new ArrayList<>();
    
    if(root==null){
      return resultList;
    }
    
    levalOrderTraversel(root,resultList,new ArrayList<>());

    return  resultList;



 }
    

    public static void levalOrderTraversel(TreeNode node, List<List<Integer>> resultList,ArrayList<Integer>list){
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(node);
        while(q.size()>0){
           int count=q.size();
           list=new ArrayList<>();
           for(int i=0;i<count;i++){
             if(q.peek().left!=null){
                q.add(q.peek().left);
             }
            
             if(q.peek().right!=null){
                q.add(q.peek().right);
             }
             list.add(q.remove().val);
           }
            resultList.add(new ArrayList<>(list));
        }
         
         
    }

}