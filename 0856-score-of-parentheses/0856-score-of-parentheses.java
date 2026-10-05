class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0;
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                depth = depth + 1;
            }
            else
            {
                depth = depth - 1;
                if(s.charAt(i - 1) == '(')
                {
                    score = score + (1 << depth); //1 << depth means 2^depth
                }
            }

        }
        return score;
    }
}