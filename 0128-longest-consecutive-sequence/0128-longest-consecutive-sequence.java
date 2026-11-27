class Solution {
    public int longestConsecutive(int[] nums)
    {
        if(nums.length == 0) return 0;
        int len = 1;
        int max_len = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int num : set)
        {
            if(set.contains(num - 1)) continue;
            len = 1;
            while(set.contains(num + 1))
            {
                num++;
                len++;
            }
            max_len = Math.max(len,max_len);
        }
        return max_len;
    }
}