class Solution {
    Stack <Character> stk=new Stack<>();
    public String reverseParentheses(String s) {
            for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == ')') {
            StringBuilder sb = new StringBuilder();
            while (stk.isEmpty() == false && stk.peek()!='(') {
                sb.append(stk.peek());
                stk.pop();
            }
            if(stk.isEmpty() == false) {
                stk.pop();
            }
            for(int j = 0; j < sb.toString().length(); j++) {
                stk.push(sb.toString().charAt(j));
            }
        } else {
            stk.push(s.charAt(i));
        }
    }
    StringBuilder sb = new StringBuilder();

    while (stk.isEmpty() == false) {
        sb.append(stk.peek());
        stk.pop();
    }
    return sb.reverse().toString();  
        
    }
}
