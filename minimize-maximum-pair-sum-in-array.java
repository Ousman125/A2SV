class Solution {
    public int minPairSum(int[] nums) {
      Arrays.sort(nums);
      int L=0,R=nums.length-1,maxsum=0;
      while(L<R){
          maxsum=Math.max(maxsum,nums[L]+nums[R]);
          L++;R--;
      }  
      return maxsum;
    }
}
