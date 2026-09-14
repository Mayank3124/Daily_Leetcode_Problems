class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] fre = new int[1001];

        for(int[] trip : trips){
            fre[trip[1]] += trip[0];
            fre[trip[2]] -= trip[0];
        }

        if(fre[0]>capacity) return false;
        for(int i = 1; i < 1001; i++){
            fre[i] = fre[i]+fre[i-1];
            if(fre[i]>capacity) return false;
        }
        return true;
    }
}