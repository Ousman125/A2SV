class Solution {
    public int maxResult(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(0);
        for(int i=1;i<nums.length;i++){
           if(i-dq.peek()>k) dq.poll();
           nums[i]+=nums[dq.peek()];
           while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]) dq.pollLast();
           dq.add(i);
        }
        return nums[nums.length-1];
    }
}
