public class leetcode_71 {
    public String simplifyPath(String path) {
        if(path.equals("/")) return "/";
        if(path.equals("/../")) return "/";
        char ch = path.charAt(path.length()-1);
        if(ch != '/') {
            path = path + "/";
        }
        Stack<String> stack = new Stack<>();
        String temp;
        int index = 0,index1=0;
        int i=1,count=0;
        stack.push("/");
        while (i< path.length() && i != -1){
            count = 0;
            temp = stack.peek();
            if(Objects.equals(temp, "/") && path.charAt(i) == '/') {
                i++;
                continue;
            }
            if(path.charAt(i) == '/') {
                stack.push("/");
                i++;
            } else {
                index = path.indexOf("/",i);
                temp = path.substring(i,index);
                if(temp.equals(".")) {
                    i+=2;
                } else if (temp.equals("..")) {
                    if(stack.size() > 1) {
                        stack.pop();
                    }
                    if(stack.size() > 1) {
                        stack.pop();
                    }
                    i = index;
                } else {
                    stack.push(temp);
                    stack.push("/");
                    i = index+1;
                }
            }
        }
        if(stack.size() >1) {
            stack.pop();
        }
        StringBuffer str = new StringBuffer();
        while(!stack.empty()) {
            str.insert(0,stack.pop());
        }
        String string = str.toString();
        System.out.println(string);
        return string;
    }
}
