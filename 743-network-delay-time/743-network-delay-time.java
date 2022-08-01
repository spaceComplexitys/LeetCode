class Solution {
   public int networkDelayTime(int[][] times, int N, int K) {
        List<Edge> edges = new ArrayList<>();
        
        for(int i=0; i<times.length; i++) {
            edges.add(new Edge(times[i][0], times[i][1], times[i][2]));
        }
        
        int[] dist = new int[N+1];
        for(int i=1; i<dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[K] = 0;
        
        for(int i=1; i<N; i++) {
            for(Edge currEdge: edges) {
                int source = currEdge.v;
                int dest = currEdge.u;
                int weight = currEdge.weight;
                if(dist[source]!=Integer.MAX_VALUE && dist[source] + weight < dist[dest]) {
                    dist[dest] = dist[source] + weight;
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        // check to see if any of the distance are MAX_VALUE, this will
        // show that the node was never relaxed so return -1
        for(int i=0; i<dist.length; i++) {
            if(dist[i]==Integer.MAX_VALUE){
                return -1;
            }
            max = Math.max(max, dist[i]);
        }
        
        return max;
    }
    
    class Edge {
        int v;
        int u;
        int weight;
        
        Edge(int v, int u, int weight) {
            this.v = v;
            this.u = u;
            this.weight = weight;
        }
        
        public String toString() {
            return " " + this.v + ", " + this.u + ", " + this.weight;
        }
    }
}