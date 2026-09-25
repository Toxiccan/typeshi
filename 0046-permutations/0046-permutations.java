class Solution {
    boolean used[];
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();


    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backtrack(0,nums);
        return result;
        
    }

    public void backtrack(int i,int[] nums)
    {
        if(i == nums.length)
        {
            result.add(new ArrayList<>(subset));
            return;
        }   

        for(int j = 0;j < nums.length;j++)
        {
            if(used[j])
            {
                continue;
            }
            subset.add(nums[j]);
            used[j] = true;
            backtrack(i + 1,nums);
            subset.remove(subset.size() - 1);
            used[j] = false;
        }
    }
}