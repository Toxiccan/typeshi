class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long x = 0;
        long place = 1;
        while(n > 0)
        {
            if(n % 10 == 0)
            {
                n = n / 10;
                continue;
            }
            int digit = n % 10;
            sum = sum + digit;
            x = x + digit * place;
            place = place * 10;
            n = n / 10;
        }
        return x * sum;
    }
}