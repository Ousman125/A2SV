class Solution {
    public List<Integer> partitionLabels(String s) {
         int[] temp = new int[26];
        for (int i = 0; i < s.length(); ++i)
            temp[s.charAt(i) - 'a'] = i;   
        int j = 0,L = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < s.length(); ++i) {
            j = Math.max(j,temp[s.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - L + 1);
                L = i + 1;
            }
        }
        return ans;
    }
}
