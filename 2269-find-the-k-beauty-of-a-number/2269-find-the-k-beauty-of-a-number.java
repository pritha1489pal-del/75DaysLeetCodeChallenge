class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        int i = 0;

        while (i + k <= s.length()) {
            int value = Integer.parseInt(s.substring(i, i + k));

            if (value != 0 && num % value == 0) {
                count++;
            }

            i++;
        }

        return count;
    }
}