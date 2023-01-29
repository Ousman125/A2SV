class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int lo = 0, hi = tokens.length - 1;
        int points = 0, ans = 0;
        while (lo <= hi && (power >= tokens[lo] || points > 0)) {
            while (lo <= hi && power >= tokens[lo]) {
                power-=tokens[lo++];
                points++;
            }
            ans = Math.max(ans, points);
            if (lo <= hi && points > 0) {
                power+= tokens[hi--];
                points--;
            }
        }
        return ans;
    }
}
