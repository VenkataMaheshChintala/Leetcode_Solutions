import java.util.Scanner;

public class leetcode_680 {
    public static boolean isPalindrome(String s,int start_index,int end_index) {
        while(start_index <= end_index) {
            if(s.charAt(start_index) != s.charAt(end_index)) {
                return false;
            }
            start_index++;
            end_index--;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int start_pointer = 0;
        int end_pointer = s.length()-1;
        if(s.charAt(start_pointer) != s.charAt(end_pointer)) {
            boolean res1 = isPalindrome(s,start_pointer+1,end_pointer);
            boolean res2 = isPalindrome(s,start_pointer,end_pointer-1);
            if(res1 || res2) return true;
            else return false;
        } else {
            while(start_pointer <= end_pointer) {
                if(s.charAt(start_pointer) != s.charAt(end_pointer)) {
                    break;
                }
                start_pointer++;
                end_pointer--;
            }
            if(start_pointer == end_pointer || start_pointer > end_pointer) {
                return true;
            } else {
                String s1 = s.substring(0,end_pointer);
                String s2 = s.substring(end_pointer+1);
                String s3 = s1 + s2;
                boolean res1 = isPalindrome(s3,0,s3.length()-1);
                s1 = s.substring(0,start_pointer);
                s2 = s.substring(start_pointer+1);
                s3 = s1 + s2;
                boolean res2 = isPalindrome(s3,0,s3.length()-1);
                if(res1 || res2) return true;
                else return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(validPalindrome(s));
    }
}
