import java.util.Scanner;
public class leetcode_744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of elements : ");
        int n = sc.nextInt();
        char[] letters = new char[n];
        char ele;
        for(int i=0;i<n;i++) {
            ele = sc.next().charAt(0);
            letters[i] = ele;
        }
        System.out.print("Enter the target : ");
        char target = sc.next().charAt(0);
        char answer = nextGreatestLetter(letters,target);
        System.out.println(answer);
        sc.close();
    }
    public static char nextGreatestLetter(char[] letters,char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end) {
            int mid = (start + end)/2;
            if(target<letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
