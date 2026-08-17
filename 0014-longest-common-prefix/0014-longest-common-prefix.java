class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String ans = "";
        for(int i = 0;i < strs[0].length();i++)
        {
            char ch = strs[0].charAt(i);
            prefix = prefix + ch;
            for(int j = 1;j < strs.length;j++)
            {

                if(!strs[j].startsWith(prefix))
                {
                    return ans;
                }
                
            }
            ans = prefix;
        }
        return ans;
    }
}