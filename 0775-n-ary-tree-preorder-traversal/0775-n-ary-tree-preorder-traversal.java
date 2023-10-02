/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    ArrayList<Integer> result=new ArrayList<>();
    public List<Integer> preorder(Node root) {
      if(root==null) return result;             //when root is null then return null 
      solve(root);                             //it is ittrative function
      return result;
    }

        void solve(Node node){
            result.add(node.val);   
          if(node.children==null) return;      //if given node has not any child than return as it is
                       //if child is present then add in arraylist the child value
          for(Node child:node.children){       
               solve(child);
          }
    }
}