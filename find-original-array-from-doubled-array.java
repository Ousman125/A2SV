class Solution {
    public int[] findOriginalArray(int[] changed) {
       if(changed.length%2!=0) return new int[0];
       int[] ans=new int[changed.length/2];
       Queue<Integer> q=new LinkedList<>();
       Arrays.sort(changed);
       int i=0;
       for(int x:changed){
        if(!q.isEmpty() && q.peek()==x){
          ans[i++]=q.poll()/2;
        }else q.add(x*2);
       }
       return q.size()==0?ans:new int[0];
    }
}
