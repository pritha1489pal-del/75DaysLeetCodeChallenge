class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int i = 0;
        while (i < n) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
            i++;
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.add(0);
        visited[0] = true;

        int jumps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size > 0) {
                int index = q.poll();

                if (index == n - 1) return jumps;

                int forward = index + 1;
                int backward = index - 1;

                if (forward < n && !visited[forward]) {
                    visited[forward] = true;
                    q.add(forward);
                }

                if (backward >= 0 && !visited[backward]) {
                    visited[backward] = true;
                    q.add(backward);
                }

                ArrayList<Integer> same = map.get(arr[index]);

                if (same != null) {
                    int j = 0;

                    while (j < same.size()) {
                        int next = same.get(j);

                        if (!visited[next]) {
                            visited[next] = true;
                            q.add(next);
                        }
                        j++;
                    }

                    map.remove(arr[index]);
                }

                size--;
            }

            jumps++;
        }

        return -1;
    }
}
