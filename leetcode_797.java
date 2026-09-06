import java.util.ArrayList;
import java.util.List;

public class leetcode_797 {
    List<List<Integer>> paths = new ArrayList<>();
    public void helper(int[][] graph,int current,int target,List<Integer> visited,List<Integer> path) {
        if(current == target) {
            paths.add(new ArrayList<>(path));
            return;
        }
        if(visited.contains(current)) return;
        else visited.add(current);
        for(int i=0;i<graph[current].length;i++) {
            path.add(graph[current][i]);
            helper(graph, graph[current][i], target, visited, path);
            path.removeLast();
        }
        visited.removeLast();
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int target = -1;
        for(int i=0;i<graph.length;i++) {
            for(int j=0;j<graph[i].length;j++) {
                target = Math.max(target,graph[i][j]);
            }
        }
        List<Integer> visited = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        helper(graph,0,target,visited,path);
        return paths;
    }
}
