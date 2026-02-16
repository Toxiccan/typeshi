import java.util.*;

class TwoSum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int nums[],int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++)
        {
            int needed = target - nums[i];
            if(map.containsKey(needed))
            {
                return new int[]{map.get(needed),i};
            }

            map.put(nums[i],i);
        }
        return new int[]{};
    }
}