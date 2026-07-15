class Solution {
    public int balancedStringSplit(String s) {
        // Stack<Character> st = new Stack<>();
        int count = 0;
        
        // for (int i = 0; i < s.length(); i++) {
        //     if (st.isEmpty()) {
        //         st.push(s.charAt(i));
        //     } else {
        //         if (st.peek() == s.charAt(i)) {
        //             st.push(s.charAt(i));
        //         } else {
        //             st.pop();
        //             if (st.isEmpty()) {
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // return count;
        int countR = 0;
        int countL = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='L'){
                countL++;
            }else{
                countR++;
            }
            if(countL==countR){
                count++;
            }
        }
        return count;
    }
}