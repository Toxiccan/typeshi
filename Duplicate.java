import java.util.*;

class Duplicate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Contains(arr));
    }
    public static boolean Contains(int[]arr)
    {
        Set<Integer> s = new HashSet<>();
        for(int i = 0;i < arr.length;i++)
        {
            if(s.contains(arr[i]))
            {
                return true;
            }
            s.add(arr[i]);
        }

        return false;
    }
}