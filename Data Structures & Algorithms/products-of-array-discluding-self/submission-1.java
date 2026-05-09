class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int hasZero = 0;
        for (int n : nums) {
            if (n == 0) hasZero++;
            else prod *= n;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (hasZero == 1) {
                if (nums[i] == 0) nums[i] = prod;
                else nums[i] = 0;
            } else if(hasZero > 1) {
                nums[i] = 0;
            } else {
                nums[i] = prod / nums[i];
            }
        }

        return nums;
    }
}  
