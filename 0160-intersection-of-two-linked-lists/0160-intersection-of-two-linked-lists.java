/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;

        int sA=0;
        int sB=0;

        while(tempA!=null){
            sA++;
            tempA=tempA.next;
        }

        while(tempB!=null){
            sB++;
            tempB=tempB.next;
        }

        tempA=headA;
        tempB=headB;

        if(sA>sB){
           int m=sA-sB;
           for(int i=0;i<m;i++){
               tempA=tempA.next;
           }
        }else{
           int m=sB-sA;
           for(int i=0;i<m;i++){
               tempB=tempB.next;
           }
        }

        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }

        return tempB;

    }
}