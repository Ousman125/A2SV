class Solution {
    public int[][] kClosest(int[][] points, int k) {
       Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return  (a[0]*a[0] + a[1]*a[1]) -  (b[0]*b[0] + b[1]*b[1]) ; 
            }
        });
        
        int[][] res = new int[k][2];
        int index = 0; 
        while(k > 0){
            res[index] = points[index];
            index++;
            k--;
        }
        return res; 
        
    }
}
