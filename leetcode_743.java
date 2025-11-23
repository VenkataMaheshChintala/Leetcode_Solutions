public class leetcode_743 {
    public int chooseVertex(int[] dist,int[] status) {
        int mincost = 500;
        int vertex = -1;
        for(int i=0;i<dist.length;i++) {
            if(status[i]!=1 && dist[i]<mincost) {
                vertex = i;
                mincost = dist[i];
            }
        }
        return vertex;
    }
    public int getCost(int[][] times,int v1,int v2) {
        if(v1==v2) return 0;
        for(int i=0;i<times.length;i++) {
            if(times[i][0] == v1 && times[i][1] == v2) {
                return times[i][2];
            }
        }
        return -1;
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n];
        int[] status = new int[n];
        status[k-1] = 1;
        for(int i=0;i<n;i++) {
            dist[i] = 500;
            status[i] = 0;
        }
        status[k-1] = 1;
        dist[k-1] = 0;
        for(int i=0;i<times.length;i++) {
            if(times[i][0] == k) {
                dist[times[i][1]-1] = times[i][2];
            }
        }
        int vertex;
        int cost;
        for(int i=1;i<n;i++) {
            vertex = chooseVertex(dist,status);
            if(vertex == -1) break;
            status[vertex] = 1;
            for(int j=0;j<n;j++) {
                cost = getCost(times,vertex+1,j+1);
                if(cost == -1) continue;
                if(dist[j] > dist[vertex] + cost) {
                    dist[j] = dist[vertex] + cost;
                }
            }
        }
        int maxTime = 0;

    for (int t : dist) {
        if (t == 500) {
            return -1;   // unreachable
        }
        maxTime = Math.max(maxTime, t);
    }

    return maxTime;
    }
}
