class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        for(int i = 0;i < heights.length;i++)
        {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()])
            {
                int index = stack.pop();
                int pse = stack.isEmpty() ? -1 : stack.peek();
                int width = i - pse - 1;
                int area = heights[index] * width;
                maxarea = Math.max(area,maxarea);
            }
            stack.push(i);
        }

        while(!stack.isEmpty())
        {
            int index = stack.pop();
            int nse = heights.length;
            int pse = stack.isEmpty() ? -1 : stack.peek();
            int width = nse - pse - 1;
            int area = heights[index] * width;
            maxarea = Math.max(area,maxarea);
        }
        return maxarea;
    }
}