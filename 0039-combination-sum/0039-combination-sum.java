class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int[] candidates, int target, int index,
                      List<Integer> curr, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        int i = index;

        while (i < candidates.length) {
            curr.add(candidates[i]);

            solve(candidates, target - candidates[i], i, curr, ans);

            curr.remove(curr.size() - 1);

            i++;
        }
    }
}