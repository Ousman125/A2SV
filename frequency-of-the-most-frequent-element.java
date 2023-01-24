class Solution {
    public int maxFrequency(int[] nums, int k) {
         Arrays.sort(nums);
        int R = 0, L = 0, sum = 0, max_val = 0;
        for (R=0;R<nums.length;R++){
            sum += nums[R];
            while (nums[R] * (R - L + 1) - sum > k){ sum -= nums[L++];}
            max_val = Math.max(max_val,R-L+1);
        }
        return max_val;
    }
}
