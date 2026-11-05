class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        int i=0;

        while (i < arr1.length) {
            int j = 0;

            while(j<arr2.length){
                if (Math.abs((long) arr1[i] - arr2[j]) <= d) {
                    break;
                }
                j++;
            }

            if (j == arr2.length) {
                count++;
            }

            i++;
        }
        return count;


    }
}