class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=1;i<=n;i++)arr.add(i);
        int x=0;
        while(arr.size()>1){
            x=(x+k-1)%arr.size();
            arr.remove(x);
        }
        return arr.get(0);
    }
}
