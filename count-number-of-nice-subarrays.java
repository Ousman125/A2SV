class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=0; int count=0;
        int[] temp=new int[nums.length+1];
         temp[0]=1;
         for(int x:nums){
             count+=x%2;
             temp[count]+=1;
             ans+=count>=k?temp[count-k] : 0;
         }  
         return ans;
    }
}
