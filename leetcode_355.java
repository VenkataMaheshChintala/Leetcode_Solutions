import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class leetcode_355 {
    HashMap<Integer, HashSet<Integer>> map;
    ArrayList<List<Integer>> tweets;

    public leetcode_355() {
        map = new HashMap<>();
        tweets = new ArrayList<>();
    }

    public void postTweet(int userId, int tweetId) {
        tweets.add(Arrays.asList(userId, tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> ans = new ArrayList<>();
        for(int i = tweets.size() - 1;
            i >= 0 && ans.size() < 10;
            i--) {
            List<Integer> tweet = tweets.get(i);
            int tweetUser = tweet.get(0);
            int tweetId = tweet.get(1);
            if(tweetUser == userId ||
               (map.containsKey(userId) &&
                map.get(userId).contains(tweetUser))) {
                ans.add(tweetId);
            }
        }
        return ans;
    }

    public void follow(int followerId, int followeeId) {
        if(followerId == followeeId) return;
        map.putIfAbsent(followerId, new HashSet<>());
        map.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if(map.containsKey(followerId)) {
            map.get(followerId).remove(followeeId);
        }
    }
}
