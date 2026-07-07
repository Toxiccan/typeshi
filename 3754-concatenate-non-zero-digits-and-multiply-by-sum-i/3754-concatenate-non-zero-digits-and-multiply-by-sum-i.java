class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);

        long sum = 0;
        long x = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '0')
            {
                continue;
            }

            int digit = ch - '0';

            sum = sum + digit;
            x = x * 10 + digit;
        }

        return x * sum;
    }
}