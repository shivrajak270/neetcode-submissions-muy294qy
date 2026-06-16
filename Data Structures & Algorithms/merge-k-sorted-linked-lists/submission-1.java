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
    ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(left!=null && right !=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left==null){
            temp.next=right;
        }
        else{
            temp.next=left;
        }
        return dummy.next;
    }
    public ListNode devideConcer(ListNode[]lists,int start,int end){
        if(start==end)
         return lists[start];

         if(end-start==1){
            return merge(lists[start],lists[end]);
         }
        int mid=start + (end - start) / 2;
        ListNode left=devideConcer(lists,start,mid);
        ListNode right=devideConcer(lists,mid+1,end);
        return merge(left,right);

    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0){
            return null;
        }
        else{
            return devideConcer(lists,0,lists.length-1);
        }



    }
}
