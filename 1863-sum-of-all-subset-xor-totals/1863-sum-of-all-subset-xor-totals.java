class Solution {
    int ans = 0;
    public void backtrack(int i ,int currentxor,int[] nums)
    {
        if(i == nums.length)
        {
            ans = ans + currentxor;
            return;
        }
        backtrack(i + 1,currentxor ^ nums[i],nums);
        backtrack(i + 1,currentxor,nums);
    }
    public int subsetXORSum(int[] nums) {
        backtrack(0,0,nums);
        return ans;
    }
}