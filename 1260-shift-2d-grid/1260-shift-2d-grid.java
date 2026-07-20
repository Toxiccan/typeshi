class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        k = k % (m * n);
        int temp[][] = new int[m][n];
        List<List<Integer>> res = new ArrayList<>();
        for(int row = 0;row < m;row++)
        {
            for(int col = 0;col < n;col++)
            {
                int index = row * n + col;
                int newindex = (index + k) % (m * n);
                int newrow = newindex / n;
                int newcol = newindex % n;
                temp[newrow][newcol] = grid[row][col];
            }
        }
        for(int row = 0;row < m;row++)
        {
            List<Integer> rowList = new ArrayList<>();  
            for(int col = 0;col < n;col++)
            {
                rowList.add(temp[row][col]);
            }
            res.add(rowList);
        }
        return res;
    }
}