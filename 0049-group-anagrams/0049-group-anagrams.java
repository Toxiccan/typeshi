class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i < strs.length;i++)
        {
            String word = strs[i];
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(map.containsKey(key))
            {
                map.get(key).add(word);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());    
    }
}