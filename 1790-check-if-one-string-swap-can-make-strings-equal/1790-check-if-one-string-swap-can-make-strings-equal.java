class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int mismatch[] = new int[2];
        int count = 0;
        for(int i = 0;i < s1.length();i++)
        {
            if(s1.charAt(i)!= s2.charAt(i))
            {
                if(count == 2)
                {
                    return false;
                }
                mismatch[count] = i;
                count++;  
            }
        }
        if(count == 1)
        {
            return false;
        }
        if(count == 2)
        {
            if((s1.charAt(mismatch[0]) == s2.charAt(mismatch[1])) && (s1.charAt(mismatch[1]) == s2.charAt(mismatch[0])))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}