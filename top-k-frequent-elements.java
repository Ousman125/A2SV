class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums) map.put(x,map.getOrDefault(x,0)+1);
        Queue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int x:map.keySet()) pq.add(x);
        int[] ans=new int[k];
        int i=0;
        while(i<k) ans[i++]=pq.poll();
        return ans;
    }
}
