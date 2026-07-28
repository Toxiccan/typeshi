class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = k;
        while(right < arr.length)
        {
            if(x - arr[left] > arr[right] - x)
            {
                left++;
                right++;
            }
            else
            {
                break;
            }
        }
        for(int i = left;i < left + k;i++)
        {
            list.add(arr[i]);
        }
        return list;
    }
}