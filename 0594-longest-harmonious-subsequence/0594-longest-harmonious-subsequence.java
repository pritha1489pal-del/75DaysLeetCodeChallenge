class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        while (i < nums.length) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            i++;
        }

        int longest = 0;

        for (int x : map.keySet()) {
            if (x != Integer.MAX_VALUE && map.containsKey(x + 1)) {
                int length = map.get(x) + map.get(x + 1);
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}