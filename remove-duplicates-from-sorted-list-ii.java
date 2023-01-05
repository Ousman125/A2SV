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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans= new ListNode(0);
        ans.next=head;
        head=ans;
        while(head.next!=null && head.next.next!=null){
            if(head.next.val==head.next.next.val){
                int val=head.next.val;
              while(head.next!=null && head.next.val==val){
                  head.next=head.next.next;
              } 
            }else head=head.next;
        }
        return ans.next;
    }
}
