class TimeMap {
    HashMap<String,ArrayList<Node>> map;
    class Node
    {
        String value;
        int timestamp;

        Node(String value,int timestamp)
        {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
        {
            map.put(key,new ArrayList<>());
        }
        
        ArrayList<Node> list = map.get(key);
        list.add(new Node(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        return "";
        ArrayList<Node> list = map.get(key);
        int low = 0;
        int high = list.size() - 1;
        int ans = -1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(list.get(mid).timestamp <= timestamp)
            {
                ans = mid;
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        if(ans == -1)
        {
            return "";
        }
        else
        {
            return list.get(ans).value;
        }
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */