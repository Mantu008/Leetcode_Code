/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      if (head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
             if(slow==fast){
                break;
             }
        }
        

        ListNode temp=head;

        while(fast!=null && fast!=temp){
            temp=temp.next;
            fast=fast.next;
        }

        return fast;
    }
}