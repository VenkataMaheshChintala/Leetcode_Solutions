public class leetcode_1791 {
    public int findCenter(int[][] edges) {
        if(edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]) return edges[0][1];
        else return edges[0][0];
    }
}
