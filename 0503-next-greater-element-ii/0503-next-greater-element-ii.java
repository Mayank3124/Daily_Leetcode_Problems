class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        int[] list = new int[n];
        // st.push(arr[n-1]);
        // list.add(-1);
        
        for(int j = 2*n-1; j >= 0; j--){
            int i = j % n;
            while(!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }
            
            if(st.isEmpty()) list[i] = -1;
            else list[i] = st.peek();
            st.push(arr[i]);
        }
        return list;
    }
}