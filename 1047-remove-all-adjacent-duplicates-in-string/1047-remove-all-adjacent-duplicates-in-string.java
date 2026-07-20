class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder("");
        Stack<Character> stc = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if((!stc.isEmpty()) && (stc.peek()).equals(s.charAt(i))){
                stc.pop();
            }else {
                stc.push(s.charAt(i));
            }
        }
        while(!stc.isEmpty()){
            str.append(stc.pop());
        }
        return str.reverse().toString();
    }
}