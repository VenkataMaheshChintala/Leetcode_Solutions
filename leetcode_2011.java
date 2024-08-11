public class leetcode_2011 {
    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        String temp;
        for(int i=0;i<operations.length;i++) {
            temp = operations[i];
            if(temp.charAt(0) == '-') x-=1;
            else if (temp.charAt(0) == '+') x+=1;
            else if (temp.charAt(temp.length()-1) == '+') x+=1;
            else x-=1;
        }
        return x;
    }
}
