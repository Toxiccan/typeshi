class Solution {
    public int minOperations(String s) {
        if(is_sorted(s) == true)
        {
            return 0;
        }

        if(s.length() == 2)
        {
            return -1;
        }

        char min_char = Min(s,0,s.length());
        char max_char = Max(s,0,s.length());

        if(s.charAt(0) == min_char || s.charAt(s.length() - 1) == max_char)
        {
            return 1;
        }

        char min_mid = Min(s,1,s.length() - 1);
        char max_mid = Max(s,1,s.length() - 1);

        if(s.charAt(0) > max_mid && s.charAt(s.length() - 1) < min_mid)
        {
            return 3;
        }
        else return 2;

        
    }
    public boolean is_sorted(String s)
    {
        boolean sorted = true;
        for(int i = 1;i < s.length();i++)
        {
            if(s.charAt(i) < s.charAt(i-1))
            {
                return false;
            }
        }
        return sorted;
    }

    public char Min(String s,int begin,int end)
    {
        int min_char = begin;
        for(int i = begin + 1;i < end;i++)
        {
            if(s.charAt(i) < s.charAt(min_char))
            {
                min_char = i;
            }
        }
        return s.charAt(min_char);
    }

    public char Max(String s,int begin,int end)
    {
        int max_char = begin;
        for(int i = begin + 1;i < end;i++)
        {
            if(s.charAt(i) > s.charAt(max_char))
            {
                max_char = i;
            }
        }
        return s.charAt(max_char);
    }
}