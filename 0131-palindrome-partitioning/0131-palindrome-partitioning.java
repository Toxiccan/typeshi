class Solution {
    List<String> subset = new ArrayList<>();
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s)
    {
        backtrack(0,s);
        return result;
        
    }
    public void backtrack(int i,String s)
    {
        if(i == s.length())
        {
            result.add(new ArrayList<>(subset));
            return;
        }

        for(int j = i;j < s.length();j++)
        {
            if(isPalindrome(s,i,j))
            {
                String part = s.substring(i,j + 1);
                subset.add(part);
                backtrack(j + 1,s);
                subset.remove(subset.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s,int i ,int j)
    {
        int left = i;
        int right = j;
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}