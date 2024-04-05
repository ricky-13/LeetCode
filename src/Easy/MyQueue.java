package Easy;

import java.util.Stack;

public class MyQueue {
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    public MyQueue() {
    }

    public void push(int x) {
        while(s1.size() > 0){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(s2.size() > 0){
            s1.push(s2.pop());
        }
    }

    public int pop() {
        int temp = (int)s1.pop();
        return temp;
    }

    public int peek() {
        int temp = (int)s1.peek();
        return temp;
    }

    public boolean empty() {
        if(s1.empty()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
