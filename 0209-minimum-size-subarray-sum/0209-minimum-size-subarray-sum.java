class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int n = nums.length;
        int s = 0;
        int e = 0;

        int ml= Integer.MAX_VALUE;

        while( e <nums.length){
            sum+=nums[e];

            while(sum>=target){
                ml = Math.min(ml,e-s+1);
                sum-=nums[s];
                s++;
            }
            e++;

        }
        if(ml==Integer.MAX_VALUE) return 0;
        return ml;


    }
}