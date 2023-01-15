class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max=new ArrayDeque<>();
        Deque<Integer> min=new ArrayDeque<>();
        int i=0,j;
        for(j=0;j<nums.length;j++){
            while(!max.isEmpty() && nums[j]>max.peekLast())
            max.pollLast();
            while(!min.isEmpty() && nums[j]<min.peekLast())
            min.pollLast();
            max.add(nums[j]);
            min.add(nums[j]);
            if(max.peek()-min.peek()>limit){
                if(max.peek()==nums[i]) max.pop();
                if(min.peek()==nums[i]) min.pop();
                i++;
            }
        }
        return j-i;
    }
}
