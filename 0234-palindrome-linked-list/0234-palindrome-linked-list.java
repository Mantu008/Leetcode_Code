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
      return  IsPalindrome(head);
    }

    boolean IsPalindrome(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            ListNode secondHalf = reverce(slow);
            ListNode firstHalf = head;

            while (secondHalf != null) {
                if (firstHalf.val != secondHalf.val) {
                    return false;
                } else {
                    firstHalf = firstHalf.next;
                    secondHalf = secondHalf.next;
                }
            }

            return true;

        }

        ListNode reverce(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
}