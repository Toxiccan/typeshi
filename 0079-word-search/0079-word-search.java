class Solution {
    char[][] board;
    int rows;
    int cols;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        rows = board.length;
        cols = board[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (backtrack(row, col, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(int row, int col, int index, String word) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return false;
        }
        if (board[row][col] != word.charAt(index)) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }
        char temp = board[row][col];
        board[row][col] = '#';
        if (backtrack(row + 1, col, index + 1, word) ||
            backtrack(row, col + 1, index + 1, word) ||
            backtrack(row - 1, col, index + 1, word) ||
            backtrack(row, col - 1, index + 1, word)) {

            return true;
        }
        board[row][col] = temp;
        return false;
    }
}