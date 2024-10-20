import java.util.Scanner;
public class leetcode_67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number 1 : ");
        String a = sc.next();
        System.out.print("Enter binary number 2 : ");
        String b = sc.next();
        String ans = addBinary(a,b);
        System.out.println(ans);
    }
    public static String addBinary(String a, String b) {
        String ans2 = "";
        char ch = '0';
        String ans = "";
        String reversed = "";
        int a_length = a.length();
        int b_length = b.length();
        int temp;
        if(a.length() == b.length()) {
            ans = add2(a,b);
        } else {
            if(a.length() > b.length()) {
                temp = a_length - b_length;
                String t = a.substring(temp,a_length);
                String m = a.substring(0,temp);
                System.out.println(t);
                ans = add(t,b);
                ch = ans.charAt(0);
                ans = ans.substring(1);
                if(ch == '1') {
                    for(int i=m.length()-1;i>=0;i--) {
                        if(m.charAt(i)=='0' && ch == '1') {
                            ans2 = ans2 + '1';
                            ch = '0';
                        } else if (m.charAt(i)=='1' && ch == '1') {
                            ans2 = ans2 + '0';
                            ch = '1';
                        } else {
                            ans2 = ans2 + m.charAt(i);
                        }
                    }
                }
                else {
                    for(int i = m.length()-1;i>=0;i--) {
                        ans2 = ans2 + m.charAt(i);
                    }
                }
            } else {
                temp = b_length - a_length;
                String t = b.substring(temp,b_length);
                String m = b.substring(0,temp);
                ans = add(a,t);
                ch = ans.charAt(0);
                ans = ans.substring(1);
                if(ch == '1') {
                    for(int i=m.length()-1;i>=0;i--) {
                        if(m.charAt(i)=='0' && ch == '1') {
                            ans2 = ans2 + '1';
                            ch = '0';
                        } else if (m.charAt(i)=='1' && ch == '1') {
                            ans2 = ans2 + '0';
                            ch = '1';
                        } else {
                            ans2 = ans2 + m.charAt(i);
                        }
                    }
                }
                else {
                    for(int i = m.length()-1;i>=0;i--) {
                        ans2 = ans2 + m.charAt(i);
                    }
                }
            }
        }
        if(ch == '1') {
            ans2 = ans2 + '1';
        }
        String reversed2 = "";
        for(int i=ans2.length()-1;i>=0;i--) {
            reversed2 += ans2.charAt(i);
        }
        reversed = reversed2 + ans;
        return reversed;
    }
    public static String add(String a,String b) {
        String reversed = "";
        int carry = 0;
        String ans = "";
        for(int i=a.length()-1;i>=0;i--) {
            if(a.charAt(i) == b.charAt(i) && a.charAt(i) == '0') {
                if(carry == 1) {
                    ans = ans + '1';
                    carry = 0;
                } else {
                    ans = ans + '0';
                }
            } else if (a.charAt(i) == '0' && b.charAt(i) == '1' || a.charAt(i) == '1' && b.charAt(i) == '0') {
                if(carry == 1) {
                    ans = ans + '0';
                    carry = 1;
                }
                else {
                    ans = ans + '1';
                }
            } else {
                if(carry == 1) {
                    ans = ans + '1';
                } else {
                    ans = ans + '0';
                }
                carry = 1;
            }
        }
        if (carry == 1) {
            ans = ans + '1';
        } else {
            ans = ans + '0';
        }
        for (int i = ans.length() - 1; i >= 0; i--) {
            reversed += ans.charAt(i);
        }
        return reversed;
    }
    public static String add2(String a,String b) {
        String reversed = "";
        int carry = 0;
        String ans = "";
        for(int i=a.length()-1;i>=0;i--) {
            if(a.charAt(i) == b.charAt(i) && a.charAt(i) == '0') {
                if(carry == 1) {
                    ans = ans + '1';
                    carry = 0;
                } else {
                    ans = ans + '0';
                }
            } else if (a.charAt(i) == '0' && b.charAt(i) == '1' || a.charAt(i) == '1' && b.charAt(i) == '0') {
                if(carry == 1) {
                    ans = ans + '0';
                    carry = 1;
                }
                else {
                    ans = ans + '1';
                }
            } else {
                if(carry == 1) {
                    ans = ans + '1';
                } else {
                    ans = ans + '0';
                }
                carry = 1;
            }
        }
        if (carry == 1) {
            ans = ans + '1';
        }
        for (int i = ans.length() - 1; i >= 0; i--) {
            reversed += ans.charAt(i);
        }
        return reversed;
    }
}
