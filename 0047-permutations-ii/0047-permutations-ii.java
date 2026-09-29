import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        solve(nums, used, new ArrayList<>(), ans);

        return ans;
    }

    public void solve(int[] nums, boolean[] used, List<Integer> curr,
                      List<List<Integer>> ans) {

        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        int i = 0;

        while (i < nums.length) {

            if (used[i]) {
                i++;
                continue;
            }

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                i++;
                continue;
            }

            used[i] = true;
            curr.add(nums[i]);

            solve(nums, used, curr, ans);

            curr.remove(curr.size() - 1);
            used[i] = false;

            i++;
        }
    }
}