class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String str : tokens){
            if(str.equals("+")){
                st.push(st.pop()+st.pop());
            }else if(str.equals("*")){
                st.push(st.pop()*st.pop());
            }else if(str.equals("-")){
                int num = st.pop();
                st.push(st.pop()-num);
            }else if(str.equals("/")){
                int num = st.pop();
                st.push(st.pop()/num);
            }else st.push(Integer.parseInt(str));
        }

        return st.pop();
    }
}