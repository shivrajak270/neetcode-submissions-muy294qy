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
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(n==size){
            head=head.next;
            return head;
        }
        ListNode prev=head;
        ListNode curr=head;
        ListNode nextnode=head;
        int itt=0;
      
        while(itt!=size-n){
            nextnode=curr.next;
            prev=curr;
            curr=nextnode;
            itt++;
        }
        prev.next=curr.next;
        return head;



    }
}
