class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> stk=new Stack();
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stk.isEmpty() && temperatures[stk.peek()]<=temperatures[i])
            stk.pop();
            if(!stk.isEmpty())
            ans[i]=stk.peek()-i;
            stk.push(i);
        }
        return ans;
    }
}
