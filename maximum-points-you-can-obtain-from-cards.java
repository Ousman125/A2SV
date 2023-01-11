class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int sum=0;
       for(int i=0;i<k;i++){
           sum+=cardPoints[i];
       }
       int ans=sum;
       for(int i=k-1,j=cardPoints.length-1;i>=0;i--,j--){
           sum+=cardPoints[j]-cardPoints[i];
           ans=Math.max(ans,sum);
       }
       return ans;
    }
}
