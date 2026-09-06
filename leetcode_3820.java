public class leetcode_3820 {
    public String intToBinary(String s) {
        StringBuilder ans = new StringBuilder();
        int num = Integer.parseInt(s);
        while(num > 0) {
            int rem = num%2;
            ans.append(rem);
            num /= 2;
        }
        return ans.reverse().toString();
    }
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<arr.length;i++) {
            ans.append(intToBinary(arr[i]));
            ans.append("-");
        }
        String a = ans.toString();
        a = a.substring(0,a.length()-1);
        return a;
    }
}
