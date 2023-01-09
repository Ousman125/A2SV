class Solution {
    public int longestOnes(int[] nums, int k) {
        int countzero=0; int left=0; int ans=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0) countzero++;
            while(countzero>k){
                if(nums[left]==0) countzero--;
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}
