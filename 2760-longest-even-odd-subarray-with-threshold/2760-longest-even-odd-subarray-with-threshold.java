class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = 0;
        int ans = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] > threshold) {
                len = 0;
            } else if (len > 0 && nums[i] % 2 != nums[i - 1] % 2) {
                len++;
            } else if (nums[i] % 2 == 0) {
                len = 1;
            } else {
                len = 0;
            }

            ans = Math.max(ans, len);
            i++;
        }

        return ans;
    }
}