class Solution {
    public int search(int[] nums, int target) {
        return binSearch(nums, 0, nums.length - 1, target); 
    }

    int binSearch(int[] nums, int l, int r, int target) {
        int mid = l + (r - l) / 2;
        if (l > r) return -1;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return binSearch(nums, l, mid - 1, target);
        else return binSearch(nums, mid + 1, r, target);
    }
}
