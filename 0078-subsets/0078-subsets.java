class Solution {
    public void solve(List<List<Integer>> ans,List<Integer> curr,int[] nums,int i){
        if (i == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        } 
        //take
        int c = nums[i];
        curr.add(c);
        solve(ans,curr,nums,i+1);

        //skip
        curr.remove(curr.size()-1);
        solve(ans,curr,nums,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(ans,curr,nums,0);
        return ans;
    }
}