
import java.util.*;

class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;

        if (n == 1) {
            return true;
        }

        if (stones[1] != 1) {
            return false;
        }

        HashMap<Integer, HashSet<Integer>> dp = new HashMap<>();

        int i = 0;
        while (i < n) {
            dp.put(stones[i], new HashSet<>());
            i++;
        }

        dp.get(0).add(0);

        i = 0;
        while (i < n) {
            int position = stones[i];

            for (int jump : dp.get(position)) {
                int k = jump - 1;

                while (k <= jump + 1) {
                    if (k > 0 && dp.containsKey(position + k)) {
                        dp.get(position + k).add(k);
                    }
                    k++;
                }
            }

            i++;
        }

        return !dp.get(stones[n - 1]).isEmpty();
    }
}
