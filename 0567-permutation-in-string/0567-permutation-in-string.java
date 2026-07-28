class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s1.length();i++)
        {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0) + 1);
        }
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> map2 = new HashMap<>();
        int k = s1.length();
        while(right < s2.length())
        {
            map2.put(s2.charAt(right),map2.getOrDefault(s2.charAt(right),0) + 1);
            if(right - left + 1 == k)
            {
                if(map.equals(map2))
                {
                    return true;
                }
                map2.put(s2.charAt(left),map2.get(s2.charAt(left)) - 1);
                if(map2.get(s2.charAt(left)) == 0)
                {
                    map2.remove(s2.charAt(left));

                }
                left++;
            }
            right++;
        }
        return false;
        
    }
}