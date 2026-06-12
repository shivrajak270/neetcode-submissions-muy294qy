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
        ListNode node2=slow.next;

  
        slow.next=null;
        //reverse
              ListNode temp=node2;
        ListNode prev=null;

        while(temp!=null){
            ListNode nextnode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextnode;
        }
        ListNode temp3=prev;
        ListNode temp4=head;
        while(temp3!=null){
            ListNode newnode=temp4.next;
            ListNode newprenode=temp3.next;
            temp4.next=temp3;
            temp4.next.next=newnode;
            temp4=temp4.next.next;
            temp3=newprenode;
        }

    }
}
