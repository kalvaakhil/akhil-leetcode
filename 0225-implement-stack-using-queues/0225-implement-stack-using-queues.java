class MyStack {
    Queue<Integer> queue = new LinkedList<>();
    
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);    

    }
    
    public int pop() {
       for(int i=0;i<queue.size()-1 && !queue.isEmpty();i++){
           queue.add(queue.remove());
       }
       
        int answer = queue.remove();
        return answer;
    }
    
    public int top() {
         for(int i=0;i<queue.size()-1 && !queue.isEmpty();i++){
           queue.add(queue.remove());
       }
       
        int answer = queue.peek();
        queue.add(queue.remove());
        return answer;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */