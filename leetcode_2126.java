import java.util.Arrays;

public class leetcode_2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;
        for(int asteroid : asteroids) {
            if(currMass >= asteroid) {
                currMass += asteroid;
            } else {
                return false;
            }
        }
        return true;
    }
}
