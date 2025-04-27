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
    public boolean isPalindrome(ListNode head) {
        //find size
        ListNode temp=head;
        int size=0;
        while(temp!=null){
           size++;
           temp=temp.next;
        }        

        //find mid of linkedlist 
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        //reverce half of list
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=slow){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //check if list size id even or odd
        if(size%2!=0){
            slow=slow.next;
        }

        //at the end check first half to second half

        while(slow!=null){
            if(slow.val==prev.val){
              slow=slow.next;
              prev=prev.next;
            }else{
                return false;
            }
        }

        return true;

    }
}