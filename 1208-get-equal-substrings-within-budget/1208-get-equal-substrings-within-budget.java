class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        int st = 0;
        int e =0;
        int cost = 0;
        int maxLen= 0;
        while (e < s.length()) {
            cost += Math.abs(s.charAt(e) - t.charAt(e));
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(st) - t.charAt(st));
                st++;
            }
            int length = e - st + 1;
            if (length > maxLen) {
                maxLen = length;
            }
            e++;
        }
        return maxLen;
    }
}