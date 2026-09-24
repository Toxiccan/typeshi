class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,nums);
        return result;
    }

    void backtrack(int i,int[] nums)
    {
        if(i == nums.length)
        {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        backtrack(i+1,nums);
        subset.remove(subset.size() - 1);
        backtrack(i+1,nums);
    }
}