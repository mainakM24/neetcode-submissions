class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int max = 1;
        int len = 1;
        int prev = 0;
        TreeSet<Integer> ts = new TreeSet<>();
        for (int n : nums) ts.add(n);
        for (int n : ts) {
            if (n != ts.first()) {
                if (n - 1 == prev) len++;
                else len = 1;
            }
            prev = n;
            max = Math.max(len, max);
        }

        return max;
    }
}
