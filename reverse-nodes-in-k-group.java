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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans=new ListNode();
        ListNode temp=ans;ListNode temp1=null; int i=0;
        ListNode temp2 =new ListNode(); ListNode temp3=temp2;
        while(head!=null){
            i++;ListNode next=head.next;
             temp3.next=new ListNode(head.val);
             temp3=temp3.next;       
             head.next=temp1;
             temp1=head;
              if(i==k){ 
                temp.next=temp1; 
                 while(i>0) {temp=temp.next;i--;}
             temp1=null; temp2.next=null;temp3=temp2;
            }head=next;

        }  if (i>0) temp.next=temp2.next;
          return ans.next;
    }
}
