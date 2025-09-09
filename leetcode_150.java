import java.util.Stack;

public class leetcode_150 {
    
    public static int  evalRPN(String[] tokens) {
        int a=0,b=0;
        Stack<String> stack = new Stack<>();
        for(String i : tokens) {
            if(i.equals("+")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a+b));
            } else if (i.equals("-")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b-a));
            } else if (i.equals("*")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a*b));
            } else if (i.equals("/")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b/a));
            } else {
                stack.push(i);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
