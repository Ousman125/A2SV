class Solution {
    public int chalkReplacer(int[] chalk, int k) {
         long prev=0l;
        long []ps=new long[chalk.length];
        for(int i=0;i<chalk.length;i++){
            prev+=chalk[i];
            ps[i]=prev;
        }
        k=(int)(k%prev);
        int lo=0,hi=chalk.length-1;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(ps[mid]==k){
                ans=mid+1;
                break;
            }
            else if(ps[mid]<k){
                lo=mid+1;
            }
            else{
                ans=mid;
                hi=mid-1;
            }
        }
        return ans;
    }
}
