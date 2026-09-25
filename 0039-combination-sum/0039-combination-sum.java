class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> comb = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        backtrack(0,0,candidates,target);
        return result;
    }
    public void backtrack(int i,int sum,int[] candidates,int target)
    {
        if(sum == target)
        {
            result.add(new ArrayList<>(comb));
            return;
        }
        if(sum > target)
        {
            return;
        }
        if(i == candidates.length)
        {
            return;
        }

        comb.add(candidates[i]);
        sum = sum + candidates[i];
        backtrack(i,sum,candidates,target);
        comb.remove(comb.size() - 1);
        sum = sum - candidates[i];
        backtrack(i + 1,sum,candidates,target);

    }
}