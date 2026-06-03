import java.util.LinkedHashMap;
import java.util.Map;

public class leetcode_146 {
    private LinkedHashMap<Integer, Integer> map;
    private int capacity;
    public leetcode_146(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(
                    Map.Entry<Integer,Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}
