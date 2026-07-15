class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else {
                if (st.peek() == s.charAt(i)) {
                    st.push(s.charAt(i));
                } else {
                    st.pop();
                    if (st.isEmpty()) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}