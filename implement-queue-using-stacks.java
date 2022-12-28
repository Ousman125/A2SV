class MyQueue {
    Stack<Integer> stk = new Stack<Integer>();
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        
    while(!stk.empty()){
        temp.push(stk.pop());
    }
    stk.push(x);
    while(!temp.empty()){
        stk.push(temp.pop());
    }    
    }
    public int pop() { 
        return stk.pop();
    }  
    public int peek() {
        return stk.peek();
    } 
    public boolean empty() {
        return stk.empty();
    }
}

