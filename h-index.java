class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i=0;
        int j=citations.length;
        while(i<j && citations[i]<j-i)
        i++;
        return j-i;
    }
}
