class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            pq.add(entry);
        }

        int ans[] = new int[k];
        for(int i = 0;i < ans.length;i++)
        {
            Map.Entry<Integer,Integer> e = pq.poll();
            ans[i] = e.getKey();
        }
        return ans;
        
    }
}