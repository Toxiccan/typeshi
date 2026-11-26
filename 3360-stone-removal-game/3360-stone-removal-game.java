class Solution {
    public boolean canAliceWin(int n)
    {
        int temp = n;
        for(int i = 10;i >= 1;i--)
        {
            if (temp < i && i % 2 == 0)
            {
                return false;
            }
            if (temp < i && i % 2 != 0)
            {
                return true;
            }
            temp = temp - i;
        }
        return true;
    }
}