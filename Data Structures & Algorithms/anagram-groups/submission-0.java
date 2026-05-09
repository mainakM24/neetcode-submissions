class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String s : strs) {
            String fs = getfs(s);

            if (hm.containsKey(fs)) hm.get(fs).add(s);
            else {
                List<String> ls = new ArrayList<>();
                ls.add(s);
                hm.put(fs, ls);
            }
        }

        return new ArrayList<>(hm.values());
    }

    public static String getfs(String s) {
        int[] f = new int[26];
        StringBuilder sb = new StringBuilder("");

        for (char ch : s.toCharArray()) {
            f[ch - 'a']++;
        }

        for (int i = 0; i < 26; ++i) {
            sb.append('a' + i);
            sb.append(f[i]);
        }

        return sb.toString();
    }
}
