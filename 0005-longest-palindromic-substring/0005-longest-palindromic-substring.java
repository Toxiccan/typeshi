class Solution {
    int[][] dp;

    public String longestPalindrome(String s) {
        int n = s.length();
        dp = new int[n][n];

        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }

        int maxlen = 0;
        int sp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (solve(s, i, j)) {
                    int len = j - i + 1;

                    if (len > maxlen) {
                        maxlen = len;
                        sp = i;
                    }
                }
            }
        }

        return s.substring(sp, sp + maxlen);
    }

    boolean solve(String s, int i, int j) {
        if (i >= j) {
            return true;
        }

        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }

        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = solve(s, i + 1, j - 1) ? 1 : 0;
        } else {
            dp[i][j] = 0;
        }

        return dp[i][j] == 1;
    }
}