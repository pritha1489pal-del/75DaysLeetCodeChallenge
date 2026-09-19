class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] pCount = new int[26];
        int[] window = new int[26];

        int i = 0;
        while (i < p.length()) {
            pCount[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
            i++;
        }

        int left = 0;
        int right = p.length();

        while (right <= s.length()) {
            if (Arrays.equals(pCount, window)) {
                ans.add(left);
            }

            if (right == s.length()) {
                break;
            }

            window[s.charAt(left) - 'a']--;
            window[s.charAt(right) - 'a']++;

            left++;
            right++;
        }

        return ans;
    }
}