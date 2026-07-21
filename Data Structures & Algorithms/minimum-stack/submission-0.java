class MinStack {

    private Stack<Integer>stk;
    private Stack<Integer>min;

    public MinStack() {
        stk = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        try{
            min.push((min.peek()<val)?min.peek():val);
        }catch (EmptyStackException e){
            min.push(val);
        }
    }
    
    public void pop() {
        stk.pop();
        min.pop();
        
    }
    
    public int top() {
        return stk.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
