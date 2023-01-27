class Solution {
    public int maxCoins(int[] piles) {
     Arrays.sort(piles); 
     int x=piles.length/3,index=piles.length-2,maxsum=0;
     while(x>0){
         maxsum+=piles[index];
         index-=2;
         x--;
     } 
     return maxsum; 
    }
}
