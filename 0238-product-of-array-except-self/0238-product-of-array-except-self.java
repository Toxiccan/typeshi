class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int prefix = 1;
        int suffix = 1;
        for(int i = 0;i < nums.length;i++)
        {
            left[i] = prefix;
            prefix = prefix * nums[i];
        }
        for(int i = nums.length - 1;i >= 0;i--)
        {
            right[i] = suffix;
            suffix = suffix * nums[i];
        }
        for(int i = 0;i < nums.length;i++)
        {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}