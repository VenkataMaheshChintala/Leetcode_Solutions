public class leetcode_20 {
    public static void main(String[] args) {
        String s = "((";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        int top = -1;
        char[] stack = new char[s.length()];
        char ch;
        int ascii,ascii2;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                if (top == -1) {
                    top = 0;
                } else {
                    top++;
                }
                stack = push(stack,s.charAt(i),top);
            } else {
                if (top == -1) {
                    ch = '0';
                } else {
                    ch = pop(stack,top);
                    top--;
                }
                ascii = (int) ch;
                ascii2 = (int) s.charAt(i);
                if(ascii == 40 && ascii2 == 41) {
                    continue;
                } else if (ascii == 91 && ascii2 == 93) {
                    continue;
                } else if (ascii == 123 && ascii2 == 125) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if(top!=-1) return false;
        return true;
    }
    public static char[] push(char[] stack,char ch,int top) {
        stack[top] = ch;
        return stack;
    }
    public static char pop(char[] stack,int top) {
        char temp;
        temp = stack[top];
        return temp;
    }
}
