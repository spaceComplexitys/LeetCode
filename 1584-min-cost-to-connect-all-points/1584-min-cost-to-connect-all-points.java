class Solution {
    public int minCostConnectPoints(int[][] points) {
        Queue<int[]> queue = new PriorityQueue<int[]>((a, b) -> a[2]-b[2]);
        int pointLength = points.length;
        for(int i=0; i < pointLength; i++){
            int d = getDistance(points[0], points[i]);
            queue.add(new int[]{0, i,d });
        }


        boolean[] visited = new boolean[pointLength];
        int cost = 0;
        int count = pointLength - 1;

        visited[0] = true;

        while(queue.size()>0 && count>0){

            int[] current = queue.poll();
            int v1 = current[0];
            int v2 = current[1];
            int distance = current[2];

            if(visited[v2] == false){

                cost+=distance;
                visited[v2] = true;
                count--;

                for(int i=0;i<pointLength;i++){
                    if(visited[i] == false){
                        int d = getDistance(points[current[1]], points[i]);

                        queue.add(new int[]{v2, i, d});
                    }

                }
            }

        }
        return cost;

    }
    
    public int getDistance(int[] p1, int[] p2){
        return Math.abs( p2[0] - p1[0]) + Math.abs(p2[1] - p1[1] );
    }
}