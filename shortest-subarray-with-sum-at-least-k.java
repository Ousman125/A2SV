class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int ans=nums.length+1;
        long[] presum=new long[nums.length+1];
        for(int i=1;i<presum.length;i++){
          presum[i]=presum[i-1]+nums[i-1];
        }
        Deque<Integer> left=new ArrayDeque<>();
        for(int j=0;j<presum.length;j++){
              while(!left.isEmpty() && presum[j]-presum[left.getFirst()]>=k)
              ans=Math.min(ans,j-left.pollFirst());
              while(!left.isEmpty() && presum[j]<=presum[left.getLast()])
              left.pollLast();
              left.addLast(j);
        }
        return ans<nums.length+1? ans:-1;
    }
}
