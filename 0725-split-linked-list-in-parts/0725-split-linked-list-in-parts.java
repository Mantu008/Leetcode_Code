/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int l=0;
        ListNode curr=head;
        while(curr!=null){
            l++;
            curr=curr.next;
        }

       int n=l/k;
       int r=l%k;
       ListNode ans[]=new ListNode[k];

       curr=head;
       ListNode prev=null;

       int i=0;
       while(curr!=null && i<k){
          ans[i]=curr;
          for(int j=0;j<n+(r>0?1:0);j++){
                prev=curr;
                curr=curr.next;
          }
          prev.next=null;
          i++;
          r--;
       }

       return ans;
    }
}