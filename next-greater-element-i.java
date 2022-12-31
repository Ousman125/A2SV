class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int y=0;
        for(int x : nums1){
         for(int i=0;i<nums2.length;i++){
             if(x==nums2[i] & i<nums2.length-1){
               int  j=i;
                 while(j<nums2.length-1){
                     if(x<nums2[j+1]){
               nums1[y]=nums2[j+1];
               y++;
               break;
               }else if(j==nums2.length-2){
                 nums1[y]  =-1;
                 y++;
               }
               j++;
             }}else if(x==nums2[i]){
                 nums1[y]  =-1;
                 y++;
             }
         }
        }
        return nums1;
    }
}
