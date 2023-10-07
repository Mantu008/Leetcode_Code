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
             node=q.remove();
             list.add(node.val);
             
             if(node.left!=null){
                q.add(node.left);
             }
            
             if(node.right!=null){
                q.add(node.right);
             }
           }
           resultList.add(list);
        }
    }
         

}