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
        ListNode temps=head;
        int size=0;

        //find size of list

        while(temps!=null){
             size++;
             temps=temps.next;
        }

        //find rightmiddle element of list

        ListNode s=head;
        ListNode f=head;

        while(f!=null && f.next!=null){
              s=s.next;
              f=f.next.next;
        }

        System.out.println(s.val);


        //reverce list up to mid

       ListNode pre=null;
       ListNode curr=head;
       ListNode start=head;
       ListNode midl=s.next;
       

        while(curr!=s){
          ListNode n=curr.next;
          curr.next=pre;
          pre=curr;
          curr=n;
        }

        start.next=midl;
        if(size%2!=0){
           s=s.next;
        }

        //check  it palindrome or not 


        while(s!=null){
            if(pre.val==s.val){
                s=s.next;
                pre=pre.next;
            }else{
                return false;
            }
        }

        return true;

    }
}