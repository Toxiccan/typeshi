class Solution {
    public int countCommas(int n) {
        int start = 1000;
        int answer = 0;
        int commas = 1;

        while (start <= n) {
            int nextStart = start * 1000;

            answer += (Math.min(n, nextStart - 1) - start + 1) * commas;

            start = nextStart;
            commas++;
        }

        return answer;
    }
}