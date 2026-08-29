class Solution {
    public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '*') {
                // Remove the closest non-star character
                stack.deleteCharAt(stack.length() - 1);
            } else {
                // Add character to stack
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}