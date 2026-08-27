class Solution {
    public int findCenter(int[][] edges) {
        int[] arr = new int[edges.length + 1];

        for(int[] edge : edges){
            arr[edge[0] - 1]++;
            arr[edge[1] - 1]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i]== arr.length - 1) return i + 1;
        }
        return 0;
    }
}