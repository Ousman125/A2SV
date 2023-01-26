class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int size = l.length;
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i<size; i++){
            int[] subArray = Arrays.copyOfRange(nums,l[i],1+r[i]);
            Arrays.sort(subArray);
            boolean isFalse = false;
            int diff = subArray[1] - subArray[0];
            for(int j = 2; j<subArray.length; j++){
                if(subArray[j] - subArray[j-1] != diff){
                    ans.add(false);
                    isFalse = true;
                    break;
                }
            }
            if(isFalse == false) ans.add(true);
        }
        return ans;
    }
}
