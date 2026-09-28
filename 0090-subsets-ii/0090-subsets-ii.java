class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    public void solve(int[] nums, int index, List<Integer> curr, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(curr));


        int i = index;
        while (i < nums.length) {
            curr.add(nums[i]);
            solve(nums, i + 1, curr, ans);


            curr.remove(curr.size() - 1);




            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
            }
            i++;
        }
    }
}