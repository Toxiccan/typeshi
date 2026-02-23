import java.util.*;

class MaxAvgSubarray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }
    }

    public static double Solution(int nums[],int k)
    {
        int cs = 0;
        for(int i = 0; i < k;i++)
        {
            cs = cs + nums[i];
        }

        int ms = cs;

        for(int i = k;i <nums.length;i++)
        {
            cs = cs + nums[i];
            cs = cs - nums[i - k];

            ms = Math.max(ms,cs);
        }

        return (double) ms/k;
    }
}