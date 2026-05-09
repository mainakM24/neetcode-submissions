class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < nums.length - 2; ++i) {
            for (int j = i + 1; j < nums.length - 1; ++j) {
                for (int k = j + 1; k < nums.length; ++k) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int s = Math.min(nums[i], Math.min(nums[j], nums[k])); 
                        int l = Math.max(nums[i], Math.max(nums[j], nums[k])); 
                        int m = nums[i] + nums[j] + nums[k] - l - s;
                        ans.add(List.of(s, m, l));
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }
}
