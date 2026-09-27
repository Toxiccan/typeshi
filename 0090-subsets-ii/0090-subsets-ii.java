class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0,nums);
        return result;
    }
    public void backtrack(int i,int[] nums)
    {
        result.add(new ArrayList<>(subset));

        for(int j = i;j < nums.length;j++)
        {
            if (j > i && nums[j] == nums[j - 1]) 
            {
                continue;
            }
            subset.add(nums[j]);
            backtrack(j + 1,nums);
            subset.remove(subset.size() - 1);
        }
    }
}