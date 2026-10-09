class Solution {
    int dp[] = new int[101];
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);
        
        Arrays.fill(dp,-1);
        int a = solve(0,n-2,nums);
        Arrays.fill(dp,-1);
        int b = solve(1,n-1,nums);
        return Math.max(a,b);

        
    }
    private int solve(int index,int end,int[] nums)
    {
        if(index > end) return 0;
        if(dp[index] != -1) return dp[index];
        int take = nums[index] + solve(index + 2,end,nums);
        int skip = solve(index + 1,end,nums);
        return dp[index] = Math.max(take,skip);

    }
}