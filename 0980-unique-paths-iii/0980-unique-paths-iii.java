class Solution {

    int count = 0;

    public int uniquePathsIII(int[][] grid) {

        int startRow = 0;
        int startCol = 0;
        int empty = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                }

                if (grid[i][j] != -1) {
                    empty++;
                }
            }
        }

        return dfs(grid, startRow, startCol, empty);
    }

    int dfs(int[][] grid, int r, int c, int remaining) {
        if (r < 0 || r >= grid.length ||
            c < 0 || c >= grid[0].length ||
            grid[r][c] == -1) {
            return 0;
        }
        if (grid[r][c] == 2) {
            return remaining == 1 ? 1 : 0;
        }
        grid[r][c] = -1;

        remaining--;

        int paths = 0;

        paths += dfs(grid, r - 1, c, remaining);
        paths += dfs(grid, r + 1, c, remaining);
        paths += dfs(grid, r, c - 1, remaining);

        paths += dfs(grid, r, c + 1, remaining);

        grid[r][c] = 0;

        return paths;
    }
}