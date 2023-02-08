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
    public ListNode mergeKLists(ListNode[] lists) {
         ListNode result = new ListNode();
         ListNode curr = result;
         int len = lists.length;
         TreeMap<Integer, List<ListNode>> map = new TreeMap<>();
        for (ListNode node : lists) {
            if(node != null) {
                map.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node);
            }
        } 
        while(!map.isEmpty()) {
            Map.Entry<Integer, List<ListNode>> entry = map.pollFirstEntry();
            List<ListNode> list = entry.getValue();
            ListNode node = list.remove(0);
            curr.next = node;
            curr = node;
            if(!list.isEmpty()) {
                map.put(entry.getKey(), list);
            }
            node = node.next;
            if(node != null) {
                map.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node);
            }
        }
        return result.next;
    }
}
