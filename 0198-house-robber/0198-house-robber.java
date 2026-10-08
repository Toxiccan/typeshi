class Solution {
    int dp[] = new int[101];
    public int rob(int[] nums) {
        Arrays.fill(dp,-1);
        return solve(0,nums);
    }

    private int solve(int index,int[] nums)
    {
        if(index >= nums.length)
        {
            return 0;
        }
        if(dp[index] != -1) return dp[index];
        int a = nums[index] + solve(index + 2,nums);
        int b = solve(index + 1,nums);
        return dp[index] = Math.max(a,b);
    }
}