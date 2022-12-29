class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stk = new Stack<>();
        for (String s : tokens) {
            if ("+".equals(s)) stk.push(stk.pop() + stk.pop());
            else if ("-".equals(s)) stk.push(-stk.pop() + stk.pop());
            else if ("/".equals(s)) stk.push((int)(1D / stk.pop() * stk.pop()));
            else if ("*".equals(s)) stk.push(stk.pop() * stk.pop());
            else stk.push(Integer.valueOf(s));
        }

        return stk.pop();  
    }
}
