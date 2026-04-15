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

    public ListNode mergeList(ListNode one,ListNode two){
        ListNode temp=new ListNode();
        ListNode dummy = temp;
        while(one!=null && two!=null){
            if(one.val<=two.val){
              dummy.next=one;
              dummy=dummy.next;
              one=one.next;
            }
            else{
                dummy.next=two;
              dummy=dummy.next;
              two=two.next;
            }
        }
        while(one!=null){
            dummy.next=one;
              dummy=dummy.next;
              one=one.next;
        }
        while(two!=null){
             dummy.next=two;
              dummy=dummy.next;
              two=two.next;
        }
        return temp.next;
    }

    public ListNode binarybreaker(ListNode[]lists,int start,int end){
               if(start == end)
                return lists[start];

        if(end-start==1)
           return mergeList(lists[start],lists[end]);

           int mid = start + (end - start) / 2;
           ListNode left= binarybreaker(lists,start,mid);
            ListNode right=binarybreaker(lists,mid+1,end);

            return mergeList(left,right);

        }

    
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
                   return null;
        return binarybreaker(lists,0,lists.length-1);

    }
}
