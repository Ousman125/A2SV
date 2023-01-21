class Solution {
    public void rotate(int[] nums, int k) {
    k=k%nums.length;
    helper(nums,0,nums.length-k-1);
    helper(nums,nums.length-k,nums.length-1);
    helper(nums,0,nums.length-1);

    }
    public void helper(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }
}
