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
    public ListNode reverseList(ListNode head) {
        

       ListNode pre=null;
       ListNode curr=head;
       ListNode temp=head;

        while(curr!=null){
          curr=temp.next;
          temp.next=pre;
          pre=temp;
          temp=curr;
        }
        

        return pre;
 

    }
}