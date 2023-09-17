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
    public ListNode oddEvenList(ListNode head) {

        if(head==null){
            return head;
        }

         ListNode odd=head;
         ListNode evan=head.next;
         ListNode Firsteven=evan;
         while(odd.next!=null && evan.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            evan.next=evan.next.next; 
            evan=evan.next;
         }

         odd.next=Firsteven;

         return head;
    }
}