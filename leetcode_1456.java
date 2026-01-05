import java.util.ArrayList;

public class leetcode_1456 {
    public int maxVowels(String s, int k) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int max = 0;
        for(int i=0;i<k;i++) {
            if(vowels.contains(s.charAt(i))) {
                max+=1;
            }
        }
        int tempMax = max;
        for(int i=1;i<=s.length()-k;i++) {
            if(vowels.contains(s.charAt(i-1))) tempMax-=1;
            if(vowels.contains(s.charAt(i+k-1))) tempMax += 1;
            if(tempMax > max) max = tempMax;
        }
        return max;
    }
}
