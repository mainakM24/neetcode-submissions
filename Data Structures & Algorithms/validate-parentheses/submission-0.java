class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> hm = new HashMap<>();

        hm.put(')', '(');
        hm.put('}', '{');
        hm.put(']', '[');

        for (char p : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == hm.get(p)) {
                st.pop();
            } else {
                st.push(p);
            }

            System.out.println(st);
        }

        return st.isEmpty();
    }
}
