public class leetcode_7 {
    public static void main(String[] args) {
        int x = -2147483412;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        int nod = 0;
        int temp = x;
        while(temp!=0) {
            nod++;
            temp=temp/10;
        }
        temp = x%10;
        if(nod>10) return 0;
        if(nod==10) {
            if(temp>2 || temp<-2) return 0;
            if(x<0) {
                temp = x/10;
                temp = reve(temp);
                temp = temp % 100;
                if(temp < -48) return 0;
            }
            temp = x/10;
            temp = reve(temp);
            if(temp%100>47) return 0;
        }
        int rev = 0, ld = 0;
        if(nod<=10) {
            rev = reve(x);
        }
        return rev;
    }
    public static int reve(int x) {
        int rev = 0,ld=0;
        while (x != 0) {
            rev *= 10;
            ld = x % 10;
            rev += ld;
            x = x / 10;
        }
        return rev;
    }
}
