class Solution {
    public int minMoves(int[] nums)
    {
        int steps = 0;
        int max = largest(nums);
        for(int i = 0;i < nums.length;i++)
        {
            if(max == nums[i])
            {
                continue;
            }
            steps += max - nums[i];
        }
        return steps;        
    }
    
    public int largest(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++)
        {
            max = Math.max(nums[i],max);
        }
        return max;
    }
}