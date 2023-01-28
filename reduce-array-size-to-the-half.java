class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<arr.length;i++) map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        int[] fre=new int[map.size()];int i=0;
        for(int x:map.values()) fre[i++]=x;
        Arrays.sort(fre);
        int R=0,ans=0,half=arr.length/2,index=fre.length-1;
        while(R<half){
            ans++;
            R+=fre[index--];
        }
        return ans;
    }
}
