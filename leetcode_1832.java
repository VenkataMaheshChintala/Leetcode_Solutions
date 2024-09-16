import java.util.ArrayList;
import java.util.Scanner;
public class leetcode_1832 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = sc.nextLine();
        boolean answer = checkIfPangram(string);
        System.out.println(answer);
        sc.close();
    }
    public static boolean checkIfPangram(String sentence) {
        ArrayList<Character> list = new ArrayList<Character>(10);
        int i=0;
        int count=0;
        while(true){
            if(i==sentence.length()) {
                break;
            }
            char ch = sentence.charAt(i);
            boolean bool = list.contains(ch);
            if(bool == false) {
                list.add(ch);
                count++;
            }
            i++;
        }
        if(count==26) {
            return true;
        } else {
            return false;
        }
    }
}
