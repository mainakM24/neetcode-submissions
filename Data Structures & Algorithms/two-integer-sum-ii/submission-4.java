class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int k = binSearch(numbers, 0, numbers.length - 1, target - numbers[i]);
            System.out.println(k);
            if (k != -1 && k != i) {
                return new int[] {i + 1, k + 1};
            }
        }
        return null;
    }
    public int binSearch(int[] numbers, int start, int end, int target) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;

        if (numbers[mid] > target)  return binSearch(numbers, start, mid - 1, target);
        if (numbers[mid] < target)  return binSearch(numbers, mid + 1, end, target);
        else return mid;
    }
}
