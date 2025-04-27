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
    public ListNode rotateRight(ListNode head, int k) {

       if(head==null || head.next==null || k==0){
          return head;
       }

        //find size and tail node
        int size=1;
        ListNode tail=head;
        while(tail.next!=null){
            size++;
            tail=tail.next;
        }
        
        //mark tail next to head
        tail.next=head;
        //find k in correcgt way in case if k is grator than list length
        k= k % size;

        //find new head position value and take a node and ittrate this to the new head position 
        int newHeadPosition=size-k;
        ListNode newTailNode=head;
        for(int i=0;i<newHeadPosition-1;i++){
            newTailNode=newTailNode.next;
        }

        //mark head
        head=newTailNode.next;
        //mark tail
        newTailNode.next=null;

        return head;

    }
}