class Solution {
    public int[] rearrangeArray(int[] nums) {
         int n = nums.length;
        Arrays.sort(nums);
        int[] result = new int[n];
        for (int i = 0; i < n / 2; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n / 2 + n % 2];
        }
        if(n%2!=0) result[n-1] = nums[n/2];
        return result;
        
    }
}
