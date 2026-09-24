class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;

        for (int unique = 1; unique <= 26; unique++) {
            int[] freq = new int[26];
            int left = 0, right = 0;
            int count = 0;
            int valid = 0;

            while (right < s.length()) {
                int idx = s.charAt(right) - 'a';

                if (freq[idx] == 0)
                    count++;

                freq[idx]++;
                
                if (freq[idx] == k)
                    valid++;

                right++;

                while (count > unique) {
                    int remove = s.charAt(left) - 'a';

                    if (freq[remove] == k)
                        valid--;

                    freq[remove]--;

                    if (freq[remove] == 0)
                        count--;

                    left++;
                }

                if (count == unique && valid == unique)
                    ans = Math.max(ans, right - left);
            }
        }

        return ans;
    }
}