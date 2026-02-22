import java.util.*;

class SumSubArray
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Sum Subarray:" +Solution(arr));
        
    }

    public static int Solution(int arr[])
    {
        int currents = arr[0];
        int maxs = arr[0];
        for(int i = 1;i < arr.length;i++)
        {
            currents = Math.max(arr[i],currents + arr[i]);
            maxs = Math.max(maxs,currents);
        }
        return maxs;

    }
}