class Solution {
    int dp[] = new int[1001];
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        Arrays.fill(dp,-1);
        return Math.min(solve(0,cost),solve(1,cost));
    }
    private int solve(int index,int[] cost)
    {
        if(index >= cost.length) return 0;
        if(dp[index] != -1) return dp[index];
        int a = cost[index] + solve(index + 1,cost);
        int b = cost[index] + solve(index + 2,cost);
        dp[index] = Math.min(a,b);
        return dp[index];       
    }
}