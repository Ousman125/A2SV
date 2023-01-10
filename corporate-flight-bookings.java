class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans=new int[n];
        for(int[] x:bookings){
            int start=x[0]-1;
            int end=x[1];
            int val=x[2];
            ans[start]+=val;
            if(end<n) ans[end]-=val;
        }
        for(int i=1;i<n;i++){
          ans[i]=ans[i]+ans[i-1];
        }
        return ans;
    }
}
