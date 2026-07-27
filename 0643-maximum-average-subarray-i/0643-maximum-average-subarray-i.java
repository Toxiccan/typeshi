class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int l = 0;
        int r = k - 1;
        for(int i = 0;i < k;i++)
        {
            sum = sum + nums[i];
        }

        maxsum = Math.max(maxsum, sum); 
        
        while(r < nums.length - 1)
        {
            sum = sum - nums[l];
            l++;
            r++;
            sum = sum + nums[r];

            maxsum = Math.max(maxsum,sum);
        }
        return (double) maxsum / k;
    }
}