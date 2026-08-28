import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int[] row : grid) {
            String key = Arrays.toString(row);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int count = 0;
        for (int j = 0; j < grid.length; j++) {
            int[] column = new int[grid.length];

            for (int i = 0; i < grid.length; i++) {
                column[i] = grid[i][j];
            }

            String key = Arrays.toString(column);

            if (map.containsKey(key)) {
                count += map.get(key);
            }
        }

        return count;
    }
}