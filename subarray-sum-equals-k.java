class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int [] prefixsum= new int[nums.length+1];
        prefixsum[0]=0;
        for(int i=1;i<prefixsum.length;i++)
        prefixsum[i]=prefixsum[i-1] + nums[i-1];
        for(int x=0;x<prefixsum.length;x++){
            for(int y=x+1;y<prefixsum.length;y++)
            if(prefixsum[y]-prefixsum[x]==k) count++;
        }
        return count;
    }
}
