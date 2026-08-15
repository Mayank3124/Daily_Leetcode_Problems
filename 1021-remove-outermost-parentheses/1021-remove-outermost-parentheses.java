class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()){
                    str.append(ch);
                }
                st.push(ch);
            }
            else {
                if(st.size()!=1){
                    str.append(ch);
                }
                st.pop();
            }
        }

        return str.toString();

    }
}