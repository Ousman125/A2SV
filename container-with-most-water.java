class Solution {
    public int maxArea(int[] height) {
        int maxH=0;
        int maxA=0;
        int left=0,right=height.length-1;
        while(left<right){
            if(height[left]>maxH && height[right]>maxH){
                maxH=Math.min(height[left],height[right]);
                maxA=Math.max(maxA,(right-left)*maxH);
            }
            if(height[left]==height[right]){
                left++;right--;
            }else if(height[left]<height[right])
                    left++;
             else right--;

        }
        return maxA;
    }
}
