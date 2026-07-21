class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int ans[] = new int[nums.length];
        for(int i = 0;i < nums.length;i++)
        {
           int newindex = (i + k) % nums.length;
           ans[newindex] = nums[i];
        }
        for(int i = 0;i < nums.length;i++)
        {
            nums[i] = ans[i];
        }
    }
}