import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;

public class leetcode_155 {
    class MinStack {
    Stack<Integer> st;
    HashSet<Integer> hs;
    public MinStack() {
        st = new Stack<>();
        hs = new HashSet<>();
    }
    
    public void push(int val) {
        st.push(val);
        hs.add(val);
    }
    
    public void pop() {
        int val = st.peek();
        st.pop();
        if(st.search(val) == -1) {
            hs.remove(val);
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return Collections.min(hs);
    }
}
}
