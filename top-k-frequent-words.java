class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:words) map.put(s,map.getOrDefault(s,0)+1);
        Queue<String> pr=new PriorityQueue<>((a,b)->{if(map.get(b)!=map.get(a)) return map.get(b)-map.get(a);else return a.compareTo(b);});
        for(String s:map.keySet()) pr.add(s);
        List<String> ans=new ArrayList<>();
        while(k>0){
            ans.add(pr.poll());
            k--;
        }
        return ans;
    }
}
