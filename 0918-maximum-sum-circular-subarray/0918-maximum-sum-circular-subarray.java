class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int currentmaxsum = 0;
        int currentminsum = 0;
        int totalsum = 0;
        int ans = 0;
        for(int i = 0;i < nums.length;i++)
        {
            currentmaxsum = Math.max(nums[i], currentmaxsum + nums[i]);
            currentminsum = Math.min(nums[i], currentminsum + nums[i]);
            maxsum = Math.max(currentmaxsum,maxsum);
            minsum = Math.min(currentminsum,minsum);
            totalsum = totalsum + nums[i];
        }
        if(maxsum < 0)
        {
            return maxsum;
        }
        ans = Math.max(maxsum,totalsum - minsum);
        return ans;
    }
}