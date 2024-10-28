class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                //loop through each iteration, if that iteration equals 1
                if (grid[i][j] == '1') {
                    //plus the count because if we see 1, we know we have an island
                    count += 1;
                    //then run the BFS to reach as far as possible to 4 directions (up, down, left, right) surrounding that iteration to look for 1
                    runBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    public void runBFS(char[][] grid, int i, int j) {
        //give the base case for the recursive call
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        //make the current position 0 so that it does not get called in other iteration
        grid[i][j] = '0';
        //keep running for 4 directions until hits the base condition
        runBFS(grid, i + 1, j);
        runBFS(grid, i - 1, j);
        runBFS(grid, i, j + 1);
        runBFS(grid, i, j - 1);
    }
}