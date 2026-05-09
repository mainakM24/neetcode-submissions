class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int i = 0; i < bucket.length; ++i) bucket[i] = new ArrayList<>();
        for (int n : nums) hm.put(n, hm.getOrDefault(n, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())  bucket[entry.getValue()].add(entry.getKey());

        for (int i = bucket.length - 1; i >= 0; --i) {
            for (int n : bucket[i]) {
                ans[--k] = n;
                if (k == 0) return ans;
            }
        }

        return ans;
    }
}
