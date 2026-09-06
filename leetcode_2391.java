public class leetcode_2391 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int mhigh = -1;
        int phigh = -1;
        int ghigh = -1;
        for(int i=0;i<garbage.length;i++) {
            if(garbage[i].indexOf("M") != -1) {
                mhigh = i;
            } 
            if(garbage[i].indexOf("P") != -1) {
                phigh = i;
            } 
            if(garbage[i].indexOf("G") != -1) {
                ghigh = i;
            } 
        }
        int ans = 0;
        for(int i=0;i<=mhigh;i++) {
            if(i != 0) ans += travel[i-1];
            if(garbage[i].indexOf("M")!=-1) {
                for(int j=0;j<garbage[i].length();j++) {
                    if(garbage[i].charAt(j) == 'M') ans++;
                }
            }
        }
        for(int i=0;i<=phigh;i++) {
            if(i != 0) ans += travel[i-1];
            if(garbage[i].indexOf("P")!=-1) {
                for(int j=0;j<garbage[i].length();j++) {
                    if(garbage[i].charAt(j) == 'P') ans++;
                }
            }
        }
        for(int i=0;i<=ghigh;i++) {
            if(i != 0) ans += travel[i-1];
            if(garbage[i].indexOf("G")!=-1) {
                for(int j=0;j<garbage[i].length();j++) {
                    if(garbage[i].charAt(j) == 'G') ans++;
                }
            }
        }
        return ans;
    }
}
