import java.util.*;

class HashSetdemo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for(int num : arr) {
            set.add(num);
        }

        System.out.println(set.contains(20));  
        System.out.println(set.size());       
        System.out.println(set);               
        System.out.println(set.isEmpty());     
        for(int val : set) {
            System.out.println(val);
        }

        set.clear();
        System.out.println(set.isEmpty());
    }
}
