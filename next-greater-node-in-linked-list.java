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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(ListNode node=head;node!=null;node=node.next)
               num.add(node.val);
               int[] ans=new int[num.size()];
               Stack<Integer> stk=new Stack<>();
               for(int i=0;i<num.size();i++){
                   while(!stk.isEmpty() && num.get(stk.peek())<num.get(i))
                   ans[stk.pop()]=num.get(i);
                   stk.push(i);
               }
        return ans;
    }
}
