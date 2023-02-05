class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int x:nums) pq.add(x);
        while(k>1){pq.poll();k--;}
        return pq.peek();
    }
}
