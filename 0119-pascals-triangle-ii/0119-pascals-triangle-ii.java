
import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        row.add(1);

        int i = 1;

        while (i <= rowIndex) {
            row.add(1);

            int j = i - 1;

            while (j > 0) {
                row.set(j, row.get(j) + row.get(j - 1));
                j--;
            }

            i++;
        }

        return row;
    }
}
