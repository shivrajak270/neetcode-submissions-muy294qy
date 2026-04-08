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
    public ListNode reverseList(ListNode head) {
        Stack<Integer>sk=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            sk.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.val=sk.peek();
            sk.pop();
              temp=temp.next;
        }
        return head;



    }
}