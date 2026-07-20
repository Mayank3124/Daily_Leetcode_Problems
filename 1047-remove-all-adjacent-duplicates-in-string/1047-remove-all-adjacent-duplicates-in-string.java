class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stc = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if((!stc.isEmpty()) && (stc.peek()).equals(s.charAt(i))){
                stc.pop();
            }else {
                stc.push(s.charAt(i));
            }
        }
        String str = "";
        while(!stc.isEmpty()){
            str = stc.pop() + str;
        }
        return str;
    }
}