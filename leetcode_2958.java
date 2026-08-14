import java.util.HashMap;

public class leetcode_2958 {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int start = 0,end = 0,temp=-1,ans = 0;
        while(start <= end && end < nums.length && start < nums.length) {
            if(map.containsKey(nums[end])) {
                temp = map.get(nums[end]);
                temp++;
                if(temp <= k) {
                    map.put(nums[end],temp);
                    end++;
                } else {
                    temp--;
                    if(nums[start] == nums[end]) {
                        if(temp != 0) {
                            map.put(nums[end],temp);
                        } else {
                            map.remove(nums[end]);
                        }
                        end++;
                        start++;
                    } else {
                        while(nums[start] != nums[end]) {
                            temp = map.get(nums[start]);
                            temp--;
                            if(temp!=0) {
                                map.put(nums[start],temp);
                            } else {
                                map.remove(nums[start]);
                            }
                            start++;
                        }
                        temp = map.get(nums[start]);
                        temp--;
                        if(temp!=0) {
                            map.put(nums[start],temp);
                        } else {
                            map.remove(nums[start]);
                        }
                        start++;
                    }
                }
            } else {
                map.put(nums[end],1);
                end++;
            }
            ans = Math.max(ans,end-start);
        }
        return ans;
    }
}
