class Solution {
    public int trap(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;
        int maxleft = height[left];
        int maxright = height[right];
        while(left < right)
        {
            if(maxleft < maxright)
            {
                left++;
                maxleft = Math.max(height[left],maxleft);
                water = water + maxleft - height[left];
            }
            else
            {
                right--;
                maxright = Math.max(height[right],maxright);
                water = water + maxright - height[right];
            }
        }
        return water;
    }
}