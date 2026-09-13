class Solution {
    public int longestOnes(int[] nums, int k) {
        int s = 0;
        int e = 0;
        int n = nums.length;
        int count=0;


        int ml =0;
        
        while(e<nums.length){
            if(nums[e]==0){
                count++;
            }

            while( count>k ){
                if(nums[s]==0) count--;
                s++;
            }
            ml = Math.max(ml,e-s+1);
            e++;
            
        }
        
        return ml;
    }
}