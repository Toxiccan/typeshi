import java.util.*;
/*This problem is similar to Two Sum but the array is sorted so we are using Two Pointer */
class TwoSum2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n]; 
        for(int i = 0;i < n;i++)
        {
            nums[i] = sc.nextInt();
        } 

    }

    public static int[] TwoPointer(int nums[],int target)
    {
        int left = 0;
        int right = nums.length - 1;
        for(int i = left;i < nums.length;i++)
        {
            if(nums[left] + nums[right])
        }
    }
}