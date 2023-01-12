class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frq=new int[26];
        for(char x:tasks)
         frq[x-'A']++;
         Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
         for(int y:frq){
             if(y>0) pq.add(y);
         }
         Queue<Pair<Integer,Integer>> queue=new LinkedList<>();
         int ans=0;
         while(!pq.isEmpty() || !queue.isEmpty()){
             ans++;
           if(!pq.isEmpty()){
               int val=pq.poll();
               val--;
               if(val>0) queue.add(new Pair(ans+n,val));
           }
           if(!queue.isEmpty() && queue.peek().getKey()==ans)
           pq.add(queue.poll().getValue());
         }
         return ans;
    }
}
