class MinStack {
     Stack <Integer> stk ;
      int min;
    public MinStack() {
     stk = new Stack<>();  
     min =0;
    }  
    public void push(int val) {   
        if(stk.empty()||val<=min){
           stk.push(min);
         min=val; 
       }
       stk.push(val);
    }
    public void pop() {
       if(stk.pop()==min)
       min=stk.pop();
    }
    public int top() {
        return stk.peek();
    }   
    public int getMin() {
       return min; 
    }
}
