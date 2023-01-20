class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return solver(nums,0,nums.length-1) >= 0 ? true : false; 
    }
    
    private int solver(int[] nums, int start, int end) {
        if(start == end) {
            return nums[start];
        }
        int a = nums[start] - solver(nums, start+1, end);
        int b = nums[end] - solver(nums, start, end-1);
           
        return Math.max(a,b);
    }
}
