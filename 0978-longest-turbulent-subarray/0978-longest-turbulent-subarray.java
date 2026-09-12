class Solution {
    public int maxTurbulenceSize(int[] arr) {

        int prevDiff = 0;
        int len = 1;
        int maxLen = 1;

        for (int i = 1; i < arr.length; i++) {

            int currDiff = arr[i] - arr[i - 1];

            if (currDiff == 0) {
                len = 1;
            }
            else if ((prevDiff < 0 && currDiff > 0) ||
                     (prevDiff > 0 && currDiff < 0)) {
                len++;
            }
            else {
                len = 2;
            }

            prevDiff = currDiff;
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}