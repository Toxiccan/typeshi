import java.util.*;

class HashMapDemo
{
    public static void main(String args[]){
    HashMap<Integer,Integer> freq = new HashMap<>();
    int[] arr = {1,2,2,3,1,4};

    for(int num : arr)
    {
        freq.put(num,freq.getOrDefault(num,0)+1);
    }

    for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
        if(entry.getValue() >= 2)
        {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    HashMap<Character,Integer> map= new HashMap<>();
    map.put('a',1)
    map.put('b',2);
    map.put('c',3);

    if(map.containsKey('a'))
    {
        System.out.println("Key a is present with value: " + map.get('a'));
    }

    map.remove('b');
    System.out.println("Final map:" + map);
    
}
}

   