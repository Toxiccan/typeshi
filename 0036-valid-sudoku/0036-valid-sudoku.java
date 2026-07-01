class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int  i = 0;i < 9;i++)
        {
            for(int j = 0;j < 9;j++)
            {
                if(board[i][j] == '.')
                {
                    continue;
                }
                char current = board[i][j];
                for(int col = 0;col < 9;col++)
                {
                    if(col == j)
                    {
                        continue;
                    }
                    if(current == board[i][col])
                    {
                        return false;
                    }
                }
                for(int row = 0;row < 9;row++)
                {
                    if(row == i)
                    {
                        continue;
                    }
                    if(current == board[row][j])
                    {
                        return false;
                    }
                }
                int startrow = (i / 3) * 3;
                int startcol = (j / 3) * 3;
                for(int row = startrow;row < startrow + 3;row++)
                {
                    for(int col = startcol;col < startcol + 3;col++)
                    {
                        if((row == i)&&(col == j))
                        {
                            continue;
                        }
                        if(current == board[row][col])
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}