class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int ans = Integer.MAX_VALUE;
        int i = 0;

        while (i + k - 1 < nums.length) {
            int diff = nums[i + k - 1] - nums[i];
            ans = Math.min(ans, diff);
            i++;
        }

        return ans;
    }
}