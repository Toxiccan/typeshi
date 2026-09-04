class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        HashSet<Integer> set = new HashSet<>();
        if(n == 1) return true;
        while(temp != 1)
        {
            int sum = 0;
            while(temp > 0)
            {
                int digit = temp % 10;
                sum = sum + digit * digit;
                temp = temp / 10;
            }
            if(set.contains(sum))
            {
                return false;
            }
            set.add(sum);
            temp = sum;
        }
        return true;
    }
}