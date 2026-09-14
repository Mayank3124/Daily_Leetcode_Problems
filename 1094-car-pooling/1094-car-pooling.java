class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] fre = new int[1001];

        for(int[] trip : trips){
            int pass = trip[0];
            if(pass > capacity) return false;
            fre[trip[1]] += pass;
            fre[trip[2]] -= pass;
        }

        if(fre[0]>capacity) return false;
        for(int i = 1; i < 1001; i++){
            fre[i] = fre[i]+fre[i-1];
            if(fre[i]>capacity) return false;
        }
        return true;
    }
}