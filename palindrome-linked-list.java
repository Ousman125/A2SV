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
        ListNode fast=head,slow=head,temp;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        temp=slow;
        slow=slow.next;
        temp.next=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=temp;
            temp=slow;
            slow=next;
        }
        while(temp!=null){
            if(temp.val!=head.val)
            return false;
            temp=temp.next;
            head=head.next;
        }
        return true;
    }
}
