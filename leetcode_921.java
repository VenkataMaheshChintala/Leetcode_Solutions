import java.util.Stack;

public class leetcode_921 {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if(!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.size();
    }
}
