class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        HashSet <Integer> set = new HashSet();

        int l = 0;
        int r = 0;

        int sum = 0;
        int maxlen = 0;
        int ans =0;

        while (r<nums.length){
            
            sum += nums[r];

            while (set.contains(nums[r])){
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            set.add(nums[r]);


            ans= Math.max(ans,sum);
            r++;

        }
        return ans;
    }
}