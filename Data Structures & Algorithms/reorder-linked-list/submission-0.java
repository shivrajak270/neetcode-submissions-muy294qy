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
    public void reorderList(ListNode head) {


        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode ans=slow.next;
        slow.next=null;
        ListNode temp=ans;
        ListNode prev=null;
        while(temp!=null){
            ListNode newnext=temp.next;
            temp.next=prev;
            prev=temp;
            temp=newnext;
        }
        ListNode temp3=head;
        ListNode temp4=prev;
        while(temp4!=null){
            ListNode temp3next=temp3.next;
            ListNode temp4next=temp4.next;
            temp3.next=temp4;
            temp4.next=temp3next;
            temp3=temp3next;
            temp4=temp4next;
        }

        

        
    }
}
