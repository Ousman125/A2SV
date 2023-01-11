class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans=new int[queries.length];
        int[] prefixXor=new int[arr.length];
        prefixXor[0]=arr[0];
        for(int i=1;i<arr.length;i++){
           prefixXor[i]=arr[i]^prefixXor[i-1]; 
        }for(int j=0;j<queries.length;j++){
            if(queries[j][0]==0) ans[j]=prefixXor[queries[j][1]];
            else ans[j]=prefixXor[queries[j][1]]^prefixXor[queries[j][0]-1];
        }
        return ans;
    }
}
