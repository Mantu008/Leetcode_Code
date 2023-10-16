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
    public List<Integer> rightSideView(TreeNode root) {
     ArrayList<Integer> ans=new ArrayList<>();
    
    if(root==null){
      return ans;
    }
    
    levalOrderTraversel(root,new ArrayList<>(),ans);

    return  ans;
 }
    

public static void levalOrderTraversel(TreeNode node,ArrayList<Integer>list,ArrayList<Integer> ans){
     Queue<TreeNode> q=new ArrayDeque<>();       //creat queue for store left and right node of particular root
        q.add(node);  
        
        while(q.size()>0){                       //this looop will run up till queue in not empty
           int count=q.size();
           list=new ArrayList<>();              //for each level node reset the list for storing new element in levelwise
           for(int i=0;i<count;i++){
             node=q.remove();                   //remove top queue node
             list.add(node.val);                //add removing node value in list 
             
             if(node.left!=null){               //if node.left is not null then incert into queue else nothing doing
                q.add(node.left);
             }
            
             if(node.right!=null){              //if node.right is not null then incert into queue  else nothing doing
                q.add(node.right);
             }
           }
           ans.add(list.get(list.size()-1));
        }
    }
         

}