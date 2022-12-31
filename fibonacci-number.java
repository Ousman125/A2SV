class Solution {
    public int fib(int n) {
       if(n==0||n==1) return n;
       else{ int z=0,x=0,y=1;
          for(int i=1;i<n;i++){
          z=x+y;
         x=y; y=z;}
         return z;}
    }
}
