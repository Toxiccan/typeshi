class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 1;

        for (int num : set) {

            if (set.contains(num - 1)) {
                continue;
            }

            int current = num;
            int len = 1;

            while (set.contains(current + 1)) {
                current++;
                len++;
            }

            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}