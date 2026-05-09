class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        StringBuilder hash = new StringBuilder("");
        int len = 0;
        hash.append('[');

        for (String str : strs) {
            sb.append(str);
            hash.append(str.length());
            hash.append(',');
        }
        return sb.append(hash).toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        int p = str.lastIndexOf("[");
        int start = 0;
        List<String> strs = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();

        String hash = str.substring(p + 1);
        if (hash == "") return strs;
        String[] freq = hash.split(",");

        for (String s : freq) ls.add(Integer.valueOf(s));
        
        for (int i = 0; i < ls.size(); ++i) {
            strs.add(str.substring(start, start + ls.get(i)));
            start = start + ls.get(i);
        }

        return strs;
    }
}
