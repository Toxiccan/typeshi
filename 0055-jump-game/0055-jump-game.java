import java.util.Arrays;

class Solution {
    int[] dp;

    public boolean canJump(int[] nums) {
        int n = nums.length;

        dp = new int[n];
        Arrays.fill(dp, -1);

        return solve(nums, 0, n);
    }

    public boolean solve(int[] nums, int idx, int n) {

        // Base case: Reached the last index
        if (idx == n - 1) {
            return true;
        }

        // Return previously calculated result
        if (dp[idx] != -1) {
            return dp[idx] == 1;
        }

        // Explore all possible jumps
        for (int i = 1; i <= nums[idx] && idx + i < n; i++) {

            if (solve(nums, idx + i, n)) {
                dp[idx] = 1;
                return true;
            }
        }

        // No valid jump reaches the destination
        dp[idx] = 0;
        return false;
    }
}