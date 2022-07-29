class Solution {
    static int[][] DIRECTIONS = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int rows;
    int cols;


    public int minimumEffortPath(int[][] heights) {
        rows = heights.length;
        cols = heights[0].length;

        //each cell represents the minimum effort required to reach that cell from all the possible paths.
        int[][] minEfforts = new int[rows][cols];
        for(int[] eachRow : minEfforts){
            Arrays.fill(eachRow, Integer.MAX_VALUE);
        }
        //already in starting cell
        minEfforts[0][0] = 0;


        PriorityQueue<Cell> minHeap = new PriorityQueue<Cell>((a, b) -> (a.effort - b.effort));
        minHeap.add(new Cell(0, 0, 0));

        boolean[][] visited = new boolean[rows][cols];



        while(!minHeap.isEmpty()){
            //get the cell, with minimal difference
            Cell currCell = minHeap.poll();

            if(currCell.x == rows - 1 && currCell.y == cols - 1) return currCell.effort;

            visited[currCell.x][currCell.y] = true;



            for(int[] dir : DIRECTIONS){
                int adjRow = currCell.x + dir[0];
                int adjCol = currCell.y + dir[1];

                if(!isInsideGrid(adjRow, adjCol)) continue;

                if(visited[adjRow][adjCol]) continue;

                //diffence b/w current cell height and nearest cell heights
                int difference = Math.abs(heights[currCell.x][currCell.y] - heights[adjRow][adjCol]);

                //effort required to reach to this nearest cell, through current cell
                int effortRequired = Math.max(minEfforts[currCell.x][currCell.y], difference);

                if(effortRequired < minEfforts[adjRow][adjCol]){

                    //found new smaller effort to reach this nearest cell
                    minEfforts[adjRow][adjCol] = effortRequired;

                    minHeap.add(new Cell(adjRow, adjCol, effortRequired));
                }
            }

        }


        return minEfforts[rows - 1][cols - 1];
    }

    private boolean isInsideGrid(int row, int col){
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
    
    
    
    
}

class Cell{
    int x;
    int y;
    int effort;

    Cell(int x, int y, int effort){
        this.x = x;
        this.y = y;
        this.effort = effort;
    }
}