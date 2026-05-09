class Solution {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        char[] carr = s.toCharArray();
        int i = 0;
        int j = carr.length - 1;
        while (i < j) {
            while (!Character.isLetterOrDigit(carr[i])) {
                i++;
                if (i == carr.length) return true;
            }
            while (!Character.isLetterOrDigit(carr[j])) j--;
            if (carr[i++] != carr[j--]) return false;
        }

        return true;
    }
}
