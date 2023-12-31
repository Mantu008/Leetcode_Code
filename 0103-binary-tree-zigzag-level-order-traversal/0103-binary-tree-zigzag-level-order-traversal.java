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
 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> resultList = new ArrayList<>();
    
    if(root==null){
      return resultList;
    }
    
    levalOrderZigzagTraversel(root,resultList,new ArrayList<>());

    return  resultList;  

 }

public static void levalOrderZigzagTraversel(TreeNode node, List<List<Integer>> resultList,ArrayList<Integer>list){
     Queue<TreeNode> q=new ArrayDeque<>();       //creat queue for store left and right node of particular root
     List<Integer> ni=new ArrayList<>();
        q.add(node);  
        int flag=0;
        
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

            if(flag==0){
                   flag=1;
                   resultList.add(list);               //atlast add list in resultlist which store list of list
            }else if(flag==1){
               ni=new ArrayList<>();     
             for(int k=list.size()-1;k>=0;k--){
                ni.add(list.get(k));
             }
                    flag=0;
                   resultList.add(ni);               //atlast add list in resultlist which store list of list 
            }
        }
    }
         
}