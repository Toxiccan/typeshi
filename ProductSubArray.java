import java.util.*;
class ProductSubArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Maximum Product SubArray:" + Solution(nums));
    }
    public static int Solution(int nums[])
    {
        int maxend = nums[0];
        int minend = nums[0];
        int global = nums[0];

        for(int i = 1;i < nums.length;i++)
        {
            if(nums[i] < 0)
            {
                int temp = maxend;
                maxend = minend;
                minend = temp;
            }

            maxend = Math.max(nums[i],nums[i] * maxend);
            minend = Math.min(nums[i],nums[i] * minend);
            global = Math.max(maxend,global);
        }
        return global;
    }
}