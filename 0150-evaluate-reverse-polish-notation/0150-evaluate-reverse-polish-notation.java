class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens)
        {
            int compute;
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/"))
            {
                stack.push(Integer.parseInt(token));
            }
            else
            {
                int a = stack.pop();
                int b = stack.pop();
                if(token.equals("+"))
                {
                    compute = b + a;
                }
                else if(token.equals("-"))
                {
                    compute = b - a;
                }
                else if(token.equals("*"))
                {
                    compute = b * a;
                }
                else
                {
                    compute = b / a;
                }
                stack.push(compute);
            }
        }
        return stack.peek();
    }
}