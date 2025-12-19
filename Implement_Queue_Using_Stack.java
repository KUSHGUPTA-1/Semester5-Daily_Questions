import java.util.*;
public class Implement_Queue_Using_Stack {
    private Stack<Integer> in;
    private Stack<Integer> out;
    public Implement_Queue_Using_Stack() {
        in=new Stack<>();
        out=new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.pop();
    }
    
    public int peek() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.peek();
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
    // Time Complexity: O(1) amortized for push, pop, peek
    // Space Complexity: O(n)
}
