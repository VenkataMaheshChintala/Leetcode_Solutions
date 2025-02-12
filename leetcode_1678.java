public class leetcode_1678 {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }
    public static String interpret(String command) {
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }
}
