class MinStack {
    class Node {
        int value;
        int min;
        Node next;
        
        public Node(int value, int min) {
            this.value = value;
            this.min = min;
            this.next = null;
        }
    }

    private Node head;

    public MinStack() {
        head = null; 
    }
    
    public void push(int value) {
        if (head == null) {
            head = new Node(value, value);
        } else {
            int currentMin = Math.min(value, head.min);
            Node newNode = new Node(value, currentMin);
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void pop() {
        if (head != null) {
            head = head.next;
        }   
        else {
            throw new RuntimeException("Stack is empty");
        }
    }
    
    public int top() {
        if (head != null) {
            return head.value;
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public int getMin() {
        if (head != null) {
            return head.min;
        }
        throw new RuntimeException("Stack is empty");
    }
}

public class Main {
    public static void main(String[] args) {
        String[] commands = {
            "MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"
        };

        Integer[] values = {
            null, -2, 0, -3, null, null, null, null
        };

        MinStack minStack = null;

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            switch (command) {
                case "MinStack":
                    minStack = new MinStack();
                    System.out.println("null");
                    break;

                case "push":
                    minStack.push(values[i]);
                    System.out.println("null");
                    break;

                case "pop":
                    minStack.pop();
                    System.out.println("null");
                    break;

                case "top":
                    System.out.println(minStack.top());
                    break;

                case "getMin":
                    System.out.println(minStack.getMin());
                    break;
            }
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */