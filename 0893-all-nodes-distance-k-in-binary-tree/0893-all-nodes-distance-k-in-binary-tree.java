/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
      allnode_from_k_away(root,target,k);
       return resule;
       
     }

    static ArrayList<Integer> resule=new ArrayList<>();
     
    static ArrayList<TreeNode>path;
    public static boolean findpath(TreeNode node,TreeNode data){
        if(node==null){
             return false;
        }

        if(node.val==data.val){
              path.add(node);
              return true;
        }

        boolean lc=findpath(node.left,data);
        if(lc){
          path.add(node);
          return true;
        }

        boolean rc=findpath(node.right,data);
        if(rc){
           path.add(node);
           return true;
        }

        return false;
    }

    public static void print_K_Level_down(TreeNode node,int k,TreeNode blocker){

      if(node==null || k<0 || node==blocker){
             return;
      }

      if(k==0){
           resule.add(node.val);
      }

      print_K_Level_down(node.left,k-1,blocker);
      print_K_Level_down(node.right,k-1,blocker);

    }


  public static void allnode_from_k_away(TreeNode node,TreeNode n,int k){
       path=new ArrayList<>();
       findpath(node, n);
        resule=new ArrayList<>();
       for(int i=0;i<path.size();i++){
            print_K_Level_down(path.get(i),k-i,i==0?null:path.get(i-1));
       }
  }
}
