class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int move = 0;
        for(int i = 0;i < s.length();i++)
        {
            if(stack.isEmpty())
            {
                if(s.charAt(i) == '(')
                {
                    stack.push(s.charAt(i));
                }
                else
                {
                    move = move + 1;
                }
            }
            else
            {
                if(stack.peek() == '(' && s.charAt(i) == ')')
                {
                    stack.pop();
                    continue;
                }
                else if(s.charAt(i) == '(')
                {
                    stack.push(s.charAt(i));
                }
            }
        }
        return move = move + stack.size();
        
    }
}