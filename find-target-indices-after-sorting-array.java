class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> nums2 = new   ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
          for(int j=0;j<nums.length-1;j++) {
              if(nums[j]>nums[j+1]){
                  int tepp = nums[j];
                  nums[j]=nums[j+1];
                  nums[j+1]=tepp;
              }}}
             for(int x=0;x<nums.length;x++){
                 if(nums[x]==target){
                     nums2.add(x);
                 }
             }
        return nums2;
    }
}
