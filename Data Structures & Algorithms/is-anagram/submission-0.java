class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int count = hm.size();

        for (char ch : t.toCharArray()) {
            if (!hm.containsKey(ch)) return false;

            int f = hm.get(ch);
            if (f == 0) return false;
            
            hm.put(ch, f - 1);
            if (f == 1) count--;
        }

        return count == 0;
    }
}
