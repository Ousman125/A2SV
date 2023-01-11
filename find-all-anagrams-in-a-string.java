class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] map=new int[26];
        List<Integer> ans=new ArrayList<Integer>();
        for(char x:p.toCharArray())
        map[x-'a']++;
        int start=0,end=0;
        while(end<s.length()){
            if(map[s.charAt(end)-'a']>0){
               map[s.charAt(end++)-'a']--;
               if(end-start==p.length())
               ans.add(start);
            }else if(start==end){
                start++;
                end++;
            }else map[s.charAt(start++)-'a']++;
        }
        return ans;
    }
}
