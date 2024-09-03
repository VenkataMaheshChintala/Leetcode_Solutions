public class leetcode_11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(missingNumber(height));
    }
    public static int missingNumber(int[] height) {
        int maxarea=0,l=0,h=0,max=0,maxh=0,maxl=0;
        for(int i=0;i<height.length;i++) {
            for(int j=i+1;j<height.length;j++) {
                l = j-i;
                h = (Math.min(height[i], height[j]));
                if((l+h)>=(maxh+maxl)) {
                    maxarea = l*h;
                    if(maxarea>max) {
                        max = maxarea;
                        maxh = h;
                        maxl = l;
                    }
                }
            }
        }
        return max;
    }
}
