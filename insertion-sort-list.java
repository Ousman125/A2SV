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
    public ListNode insertionSortList(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode temp=ans;
        while(head!=null){
            ListNode next=head.next;
            if(head.val<temp.val)
              temp=ans;
              while(temp.next!=null && head.val>temp.next.val){
              temp=temp.next;}
             head.next=temp.next;
             temp.next=head;
             head=next;
        }
        return ans.next;
    }
}
