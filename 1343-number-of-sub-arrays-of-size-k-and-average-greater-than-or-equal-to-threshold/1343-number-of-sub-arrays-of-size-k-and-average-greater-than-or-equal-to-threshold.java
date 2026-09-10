class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;
        int i = 0;

        while (i <= arr.length - k) {

            int sum = 0;
            int j = i;

            while (j < i + k) {
                sum += arr[j];
                j++;
            }

            if (sum / k >= threshold) {
                count++;
            }

            i++;
        }

        return count;
    }
}