public class leetcode_1309 {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }
    public static String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<s.length();i++) {
            if(i+2 < s.length()) {
                if (s.substring(i, i + 3).contains("#")) {
                    ans.append(add(s.substring(i, i + 3)));
                    i += 2;
                } else {
                    ans.append(add1(s.substring(i, i + 1)));
                }
            } else {
                ans.append(add1(s.substring(i, i + 1)));
            }
        }
        return ans.toString();
    }
    public static String add1(String s) {
        switch (s) {
            case "1":
                return "a";
            case "2":
                return "b";
            case "3":
                return "c";
            case "4":
                return "d";
            case "5":
                return "e";
            case "6":
                return "f";
            case "7":
                return "g";
            case "8":
                return "h";
            case "9":
                return "i";
            default:
                return "";
        }
    }
    public static String add(String s) {
        switch (s) {
            case "10#":
                return "j";
            case "11#":
                return "k";
            case "12#":
                return "l";
            case "13#":
                return "m";
            case "14#":
                return "n";
            case "15#":
                return "o";
            case "16#":
                return "p";
            case "17#":
                return "q";
            case "18#":
                return "r";
            case "19#":
                return "s";
            case "20#":
                return "t";
            case "21#":
                return "u";
            case "22#":
                return "v";
            case "23#":
                return "w";
            case "24#":
                return "x";
            case "25#":
                return "y";
            case "26#":
                return "z";
            default:
                return "";
        }
    }
}
