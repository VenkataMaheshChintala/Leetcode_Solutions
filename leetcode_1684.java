public class leetcode_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int a = 0;
        boolean ans = false;
        for(int i=0;i<words.length;i++) {
            ans = false;
            String str = words[i];
            for(int j=0;j<str.length();j++) {
                int ind = allowed.indexOf(str.charAt(j));
                if(ind == -1) {
                    ans = true;
                    break;
                }
            }
            if(!ans) a++; 
        }
        return a;
    }
}
