import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if (!wordList.contains(endWord)) {
            return 0;
        }

        Set<String> set = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();

        queue.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size > 0) {

                String word = queue.poll();
                char[] arr = word.toCharArray();

                int i = 0;

                while (i < arr.length) {

                    char original = arr[i];

                    char ch = 'a';

                    while (ch <= 'z') {

                        arr[i] = ch;

                        String newWord = new String(arr);

                        if (newWord.equals(endWord)) {
                            return level + 1;
                        }

                        if (set.contains(newWord)) {
                            queue.add(newWord);
                            set.remove(newWord);
                        }

                        ch++;
                    }

                    arr[i] = original;
                    i++;
                }

                size--;
            }

            level++;
        }

        return 0;
    }
}