import java.util.Stack;

public class leetcode_42 {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.empty() && height[i] > height[stack.peek()]) {
                int topIndex = stack.pop(); 
                if (stack.empty()) break; 
                int leftIndex = stack.peek(); 
                int boundedHeight = Math.min(height[i], height[leftIndex]) - height[topIndex];
                int width = i - leftIndex - 1;
                ans += boundedHeight * width;
            }
            stack.push(i);
        }
        return ans;
    }
}
