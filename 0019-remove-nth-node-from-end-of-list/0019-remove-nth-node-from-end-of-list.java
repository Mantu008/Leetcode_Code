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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        }

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        if(slow.next!=null && slow.next.next!=null){
           slow.next=slow.next.next;
        }else{
            slow.next=null;
        }

        
        return head;
    }
}