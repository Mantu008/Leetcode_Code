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
      ListNode fast=head;
      ListNode slow=head;

         if(slow!=null &&slow.next==null){
             return null;
         }

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }

        ListNode temp=head;
        while(fast!=null && temp!=fast){
          temp=temp.next;
          fast=fast.next;
        }

        return fast;
    }
}