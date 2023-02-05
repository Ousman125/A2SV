class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int x:stones) pq.add(x);
        int ans=0;
        while(pq.size()>1){
            int temp1=pq.poll();
            int temp2=pq.poll();
            if(temp1!=temp2) pq.add(temp1-temp2);
        }
        return pq.size()==0?0:pq.peek();
    }
}
