class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> comb = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
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

        for(int j = i; j < candidates.length;j++)
        {
            if(j > i && candidates[j] == candidates[j - 1])
            {
                continue;
            }
            comb.add(candidates[j]);
            sum = sum + candidates[j];
            backtrack(j + 1,sum,candidates,target);
            comb.remove(comb.size() - 1);
            sum = sum - candidates[j];
        }
    }
}