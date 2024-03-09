public class leetcode_832 {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        int[][] result = flipAndInvertImage(image);
        for(int i=0;i< result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int x = image.length-1;
        int temp;
        int[][] result = new int[image.length][image.length];
        for(int i=0;i< result.length;i++) {
            x = image[i].length-1;
            for(int j=0;j<result[i].length;j++) {
                temp = image[i][x];
                if(temp==0) temp=1;
                else temp = 0;
                result[i][j] = temp;
                x--;
            }
        }
        return result;
    }

}
