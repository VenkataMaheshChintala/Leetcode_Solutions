public class leetcode_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1) {
            if(flowerbed[0] == 1) {
                if(n==0) return true;
                else return false;
            } else {
                return true;
            }
        }
        for(int i=0;i<flowerbed.length;i++) {
            if(flowerbed[i] == 0) {
                if(i == 0) {
                    if(flowerbed[1] == 0) {
                        flowerbed[0] = 1;
                        n-=1;
                    }
                    continue;
                } 
                if(i == flowerbed.length - 1) {
                    if(flowerbed[i-1] == 0) {
                        flowerbed[i] = 1;
                        n-=1;
                    }
                    continue;
                }
                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n-=1;
                }
            }
        }
        if(n<=0) return true;
        else return false;
    }
}
