import java.util.Stack;

class MyQueue {

    private Stack<Integer> stackIn, stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    
    public void push(int x) {
        this.stackIn.push(x);
    }
    
    public int pop() {
        moveIntoOut();

        return stackOut.pop();
    }
    
    public int peek() {
        moveIntoOut();

        return stackOut.peek();
    }

    private void moveIntoOut(){
        if(stackOut.isEmpty())
        {
            while(!stackIn.isEmpty())
            {
                int tmp = stackIn.pop();
                stackOut.push(tmp);
            }
        }
    }
    
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}