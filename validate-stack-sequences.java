class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk=new Stack<>();
        int i=0;
        for(int x:pushed){
            stk.push(x);
            while(!stk.isEmpty() && stk.peek()==popped[i]){
            stk.pop();
            i++;
            }
        }
        return stk.isEmpty();
    }
}
