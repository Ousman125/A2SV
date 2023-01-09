class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(Maxsolver(nums,firstLen,secondLen),Maxsolver(nums,secondLen,firstLen));
    }
    int Maxsolver(int[] nums, int fl, int sl){
        int sumfl=0,sumsl=0;
        for(int i=0;i<fl+sl;i++){
            if(i<fl) sumfl+=nums[i];
            else sumsl+=nums[i];
        }
        int ans=sumfl+sumsl;
        for(int j=fl+sl,maxsumfl=sumfl;j<nums.length;j++){
            sumfl+=nums[j-sl]-nums[j-sl-fl];
            sumsl+=nums[j]-nums[j-sl];
            maxsumfl=Math.max(maxsumfl,sumfl);
            ans=Math.max(ans,maxsumfl+sumsl);
        }
        return ans;
    }
}
