class Solution {
    public void helper(int[] arr, boolean[] check, int[][] connect){
        for(int i = 0; i < arr.length; i++){
            if(!check[i] && arr[i]==1){
                check[i] = true;
                helper(connect[i],check,connect);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        
        boolean[] check = new boolean[isConnected.length];
        int count = 0;
        for(int i = 0; i < isConnected.length;i++){
            if(!check[i]){
                check[i] = true;
                helper(isConnected[i],check,isConnected);
                count++;
            }

        }
        return count;
    }
}