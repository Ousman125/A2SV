class Solution {
    public void moveZeroes(int[] nums) {
        int x=0;
        for(int i : nums){
            if(i!=0){
            nums[x]=i;
            x++;
            }}
            while(x<nums.length){
                nums[x]=0;
                x++;
            }
    }
}
